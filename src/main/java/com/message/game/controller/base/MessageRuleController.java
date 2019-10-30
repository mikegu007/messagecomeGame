package com.message.game.controller.base;

import com.message.game.model.PageBase.PageBean;
import com.message.game.model.dto.MessageListDto;
import com.message.game.model.vo.MessageRuleVo;
import com.message.game.service.inf.MessageRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短信
 * Created by LRG on 2019/5/29.
 */
@RestController
@RequestMapping("/message")
public class MessageRuleController {

    @Autowired
    private MessageRuleService messageRuleService;

    /**
     * 获取短信列表
     */
    @RequestMapping(value = "/rule/list",method = RequestMethod.POST)
    public PageBean<MessageRuleVo> getMessageRuleList(
            @RequestBody MessageListDto messageListDto){
        return messageRuleService.getMessageRuleList(messageListDto);
    }
}
