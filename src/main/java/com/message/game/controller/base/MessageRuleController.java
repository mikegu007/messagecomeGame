package com.message.game.controller.base;

import com.message.game.model.PageBase.PageBean;
import com.message.game.model.dto.MessageListDto;
import com.message.game.model.dto.ResultData;
import com.message.game.model.vo.MessageRuleVo;
import com.message.game.service.inf.MessageRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @RequestMapping(value = "/rule/list",method = RequestMethod.GET)
    public ResultData<List<MessageRuleVo>> getMessageRuleList(
            @RequestParam(name = "sex",required = false) String sex){
        return new ResultData<>(ResultData.SUCCESS,"","",messageRuleService.getMessageRuleList(sex));
    }
}
