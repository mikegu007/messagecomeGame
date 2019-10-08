//package com.message.game.service.impl;
//
//import com.github.pagehelper.PageHelper;
//import com.message.game.constant.Constant;
//import com.message.game.constant.ErrConstant;
//import com.message.game.dao.TtUserMapper;
//import com.message.game.model.PageBase.DataTableCommonParameter;
//import com.message.game.model.PageBase.PageBean;
//import com.message.game.model.dto.UserDto;
//import com.message.game.model.exception.XyxException;
//import com.message.game.model.po.TtUser;
//import com.message.game.model.vo.UserVo;
//import com.message.game.service.inf.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.util.StringUtils;
//
//import javax.validation.constraints.NotEmpty;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.UUID;
//
///**
// * 用户服务
// * Created by LRG on 2019/5/29.
// */
//@Service
//@Slf4j
//public class UserServiceImpl implements UserService{
//
//    @Autowired
//    private TtUserMapper ttUserMapper;
//
//    /**
//     * 新增一个新用户
//     * @param userDto
//     * @return
//     */
//    @Override
//    @Transactional
//    public String addNewUser(UserDto userDto) {
//        log.info("添加新用户信息 详情[{}]",userDto.toString());
//        TtUser ttUser=new TtUser();
//        if(userDto!=null){BeanUtils.copyProperties(userDto,ttUser);}
//        String openid = userDto.getOpenid();
//        if(StringUtils.isEmpty(openid)){
//            throw new XyxException(ErrConstant.BUSI_RETURN_ERR,"用户OpenID信息不能为空!");
//        }
//        // 根据openID查询用户信息
//        TtUser user = ttUserMapper.queryUserInfoByOpenId(openid);
//        if(user==null){
//            // 生成一个新的UUID
//            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//            ttUser.setUuid(uuid);
//            ttUser.setIsDel(Constant.NOT_DEL);
//            ttUserMapper.insertSelective(ttUser);
//            log.info("新用户添加成功 UUID[{}]",uuid);
//
//        }else {
//            ttUser.setId(user.getId());
//            ttUser.setUuid(user.getUuid());
//            ttUserMapper.updateByPrimaryKey(ttUser);
//            log.info("用户信息更新成功 ID[{}]",ttUser.getId());
//        }
//        return ttUser.getUuid();
//    }
//
//    /**
//     * 获取用户个人信息
//     * @param uuid
//     * @return
//     */
//    @Override
//    public UserVo getUserByUuid(String uuid) {
//        log.info("根据用户uuid获取用户信息 uuid[{}]",uuid);
//        if(StringUtils.isEmpty(uuid)){
//            throw new XyxException(ErrConstant.BUSI_RETURN_ERR,"用户UUID信息不能为空！");
//        }
//        TtUser ttUser = ttUserMapper.queryUserInfoByUuid(uuid);
//        if(ttUser==null){
//            throw new XyxException(ErrConstant.BUSI_RETURN_ERR,"未查询到该用户的信息！");
//        }
//        UserVo userVo=new UserVo();
//        BeanUtils.copyProperties(ttUser,userVo);
//        log.info("用户信息查询结束！");
//        return userVo;
//    }
//
//    @Override
//    public UserVo getUserByOpenId(String openid) {
//        log.info("根据OpenID获取用户信息 OpenId[{}]",openid);
//        if(StringUtils.isEmpty(openid)){
//            throw new XyxException(ErrConstant.BUSI_RETURN_ERR,"用户OpenID信息不能为空！");
//        }
//        TtUser user = ttUserMapper.queryUserInfoByOpenId(openid);
//        UserVo userVo=new UserVo();
//        BeanUtils.copyProperties(user,userVo);
//        log.info("根据OpenID获取用户信息成功！");
//        return userVo;
//    }
//
//    /**
//     * 分页获取用户排行榜
//     * @param parameter
//     * @return
//     */
//    @Override
//    public PageBean<UserVo> getPankingList(DataTableCommonParameter parameter) {
//        log.info("查询用户排行榜！");
//        PageBean pageBean=new PageBean();
//        try{
//            parameter.init();
//            int start = parameter.getStart();
//            int length = parameter.getLength();
//            // 获取分页总数
//            int count = ttUserMapper.queryUserCount();
//            PageHelper.startPage(start,length);
//            List<TtUser> ttUserList = ttUserMapper.queryUserList();
//            List<UserVo> userVoList=new ArrayList<>();
//            ttUserList.stream().forEach(x->{
//                UserVo userVo=new UserVo();
//                BeanUtils.copyProperties(x,userVo);
//                userVoList.add(userVo);
//            });
//            pageBean.setCode(Constant.LAY_TABLE_SUCCESS);
//            pageBean.setMsg("用户排行榜获取成功！");
//            pageBean.setData(userVoList);
//            pageBean.setCount(count);
//            log.info("用户排行榜获取成功！");
//        }catch (Throwable e){
//            log.error("分页获取用户排行榜失败",e);
//            pageBean.setCode(Constant.LAY_TABLE_FAIL);
//            pageBean.setCount(0);
//            pageBean.setData(Collections.EMPTY_LIST);
//            pageBean.setMsg("用户排行榜信息获取失败！");
//        }
//        return pageBean;
//    }
//}
