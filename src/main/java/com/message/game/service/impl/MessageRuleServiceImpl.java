package com.message.game.service.impl;

import com.message.game.dao.TmMessageRuleMapper;
import com.message.game.model.po.TmMessageRule;
import com.message.game.model.vo.MessageRuleVo;
import com.message.game.service.inf.MessageRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
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
     * @param sex
     * @return
     */
    @Override
//    @Cacheable(value = "message:rule:list:sex",key = "'message:rule:list:sex:'+#p0")
    public List<MessageRuleVo> getMessageRuleList(String sex) {
        log.info("获取短信规则列表 性别[{}]",sex);
        List<TmMessageRule> tmMessageRuleList = tmMessageRuleMapper.queryMessageRuleList(StringUtils.isEmpty(sex)?null:sex);
        List<MessageRuleVo> messageRuleVoList=new ArrayList<>();
        tmMessageRuleList.stream().forEach(x-> {
            MessageRuleVo messageRuleVo=new MessageRuleVo();
            BeanUtils.copyProperties(x,messageRuleVo);
            messageRuleVoList.add(messageRuleVo);});
        log.info("获取短信列表成功！");
        return messageRuleVoList;
    }
}
