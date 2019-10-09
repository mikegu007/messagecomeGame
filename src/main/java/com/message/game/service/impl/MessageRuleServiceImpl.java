package com.message.game.service.impl;

import com.github.pagehelper.PageHelper;
import com.message.game.constant.Constant;
import com.message.game.dao.TmMessageRuleMapper;
import com.message.game.model.PageBase.PageBean;
import com.message.game.model.dto.MessageListDto;
import com.message.game.model.po.TmMessageRule;
import com.message.game.model.vo.MessageRuleVo;
import com.message.game.service.inf.MessageRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by LRG on 2019/5/29.
 */
@Service
@Slf4j
public class MessageRuleServiceImpl implements MessageRuleService {

    @Autowired
    private TmMessageRuleMapper tmMessageRuleMapper;

    /**
     * 获取短信列表
     * @param messageListDto
     * @return
     */
    @Override
    public PageBean<MessageRuleVo> getMessageRuleList(MessageListDto messageListDto) {
        log.info("获取短信规则列表 请求参数[{}]",messageListDto.toString());
        String sex = messageListDto.getSex();
        int start = messageListDto.getStart();
        int length = messageListDto.getLength();
        PageBean pageBean=new PageBean();
        try{
            Integer count = tmMessageRuleMapper.queryMessageRuleCount(StringUtils.isEmpty(sex)?null:sex);
            PageHelper.startPage(start,length);
            List<TmMessageRule> tmMessageRuleList = tmMessageRuleMapper.queryMessageRuleList(StringUtils.isEmpty(sex)?null:sex);
            List<MessageRuleVo> messageRuleVoList=new ArrayList<>();
            tmMessageRuleList.stream().forEach(x-> {
                MessageRuleVo messageRuleVo=new MessageRuleVo();
                BeanUtils.copyProperties(x,messageRuleVo);
                messageRuleVoList.add(messageRuleVo);});
            log.info("获取短信列表成功！");
            pageBean.setCode(Constant.LAY_TABLE_SUCCESS);
            pageBean.setCount(count);
            pageBean.setData(tmMessageRuleList);
            pageBean.setMsg("短信列表获取成功!");
        }catch (Throwable e){
            log.error("获取短信列表失败！",e);
            pageBean.setCount(0);
            pageBean.setCode(Constant.LAY_TABLE_FAIL);
            pageBean.setMsg("获取短信规则列表失败！");
            pageBean.setData(Collections.EMPTY_LIST);
        }
        return pageBean;
    }
}
