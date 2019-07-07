package com.message.game.controller.base;

import com.message.game.model.PageBase.DataTableCommonParameter;
import com.message.game.model.PageBase.PageBean;
import com.message.game.model.dto.ResultData;
import com.message.game.model.dto.UserDto;
import com.message.game.model.vo.UserVo;
import com.message.game.service.inf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 用户
 * Created by LRG on 2019/5/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加新用户
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultData<String> addNewUser(
            @RequestBody @Validated UserDto userDto){
        return new ResultData<>(ResultData.SUCCESS,"","",userService.addNewUser(userDto));
    }

    /**
     * 获取用户个人信息
     * @param uuid
     * @return
     */
    @RequestMapping(value = "/info/uuid",method = RequestMethod.GET)
    public ResultData<UserVo> getUserByUuid(
            @RequestParam(name = "uuid")String uuid){
        return new ResultData<UserVo>(ResultData.SUCCESS,"","",userService.getUserByUuid(uuid));
    }

    /**
     * 获取用户个人信息
     * @param openid
     * @return
     */
    @RequestMapping(value = "/info/openid",method = RequestMethod.GET)
    public ResultData<UserVo> getUserByOpenId(
            @RequestParam(name = "openid")String openid){
        return new ResultData<UserVo>(ResultData.SUCCESS,"","",userService.getUserByOpenId(openid));
    }


    /**
     * 获取排行榜
     * @param parameter
     * @return
     */
    @RequestMapping(value = "/pank/list",method = RequestMethod.POST)
    public PageBean<UserVo> getPankingList(
            @RequestBody DataTableCommonParameter parameter){
        return userService.getPankingList(parameter);
    }
}
