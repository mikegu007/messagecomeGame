package com.message.game.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by LRG on 2019/5/30.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GameRuleVo implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 游戏规则ID
     */
    private Long id;

    /**
     * 分类code
     */
    private String dictionCode;

    /**
     * 游戏时间段起始时间
     */
    private Integer startTime;

    /**
     * 游戏时间段结束时间
     */
    private Integer endTime;

    /**
     * 允许失败次数
     */
    private Integer count;

    /**
     * 短信置顶停留时间
     */
    private Integer time;

    /**
     * 短信类型
     */
    private Integer messageType;
}
