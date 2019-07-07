package com.message.game.service.inf;

import com.message.game.model.vo.MessageRuleVo;

import java.util.List;

/**
 * Created by LRG on 2019/5/29.
 */
public interface MessageRuleService {

    /**
     * 获取短信列表
     * @param sex
     * @return
     */
    List<MessageRuleVo> getMessageRuleList(String sex);
}
