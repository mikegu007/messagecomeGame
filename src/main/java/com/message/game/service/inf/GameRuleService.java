package com.message.game.service.inf;

import com.message.game.model.vo.GameRuleVo;

import java.util.List;

/**
 * Created by LRG on 2019/5/30.
 */
public interface GameRuleService {
    /**
     * 获取游戏规则
     * @param dictionCode
     * @return
     */
    List<GameRuleVo> getGameRuleList(String dictionCode);
}
