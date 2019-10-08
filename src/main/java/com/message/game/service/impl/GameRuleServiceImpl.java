//package com.message.game.service.impl;
//
//import com.message.game.dao.TmGameRuleMapper;
//import com.message.game.model.po.TmGameRule;
//import com.message.game.model.vo.GameRuleVo;
//import com.message.game.service.inf.GameRuleService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by LRG on 2019/5/30.
// */
//@Service
//@Slf4j
//public class GameRuleServiceImpl implements GameRuleService {
//
//    @Autowired
//    private TmGameRuleMapper tmGameRuleMapper;
//
//    /**
//     * 获取游戏规则
//     * @param dictionCode
//     * @return
//     */
//    @Override
//    @Cacheable(value = "message:game:rule:list:code",key = "'message:game:rule:list:code'+#p0")
//    public List<GameRuleVo> getGameRuleList(String dictionCode) {
//        log.info("查询游戏规则 分类code[{}]",dictionCode);
//        List<TmGameRule> tmGameRules = tmGameRuleMapper.getGameRuleList(StringUtils.isEmpty(dictionCode)?null:dictionCode);
//        List<GameRuleVo> gameRuleVos=new ArrayList<>();
//        tmGameRules.stream().forEach(x->{
//            GameRuleVo gameRuleVo=new GameRuleVo();
//            BeanUtils.copyProperties(x,gameRuleVo);
//            gameRuleVos.add(gameRuleVo);
//        });
//        log.info("游戏规则查询成功！");
//        return gameRuleVos;
//    }
//}
