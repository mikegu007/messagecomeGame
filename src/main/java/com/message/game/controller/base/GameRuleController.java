//package com.message.game.controller.base;
//
//import com.message.game.model.dto.ResultData;
//import com.message.game.model.vo.GameRuleVo;
//import com.message.game.model.vo.MessageRuleVo;
//import com.message.game.service.inf.GameRuleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * Created by LRG on 2019/5/29.
// */
//@RestController
//@RequestMapping("/game")
//public class GameRuleController {
//
//    @Autowired
//    private GameRuleService gameRuleService;
//
//    /**
//     * 获取短信列表
//     */
//    @RequestMapping(value = "/rule/list",method = RequestMethod.GET)
//    public ResultData<List<GameRuleVo>> getGameRuleList(
//            @RequestParam(name = "dictionCode",required = false) String dictionCode){
//        return new ResultData<>(ResultData.SUCCESS,"","",gameRuleService.getGameRuleList(dictionCode));
//    }
//}
