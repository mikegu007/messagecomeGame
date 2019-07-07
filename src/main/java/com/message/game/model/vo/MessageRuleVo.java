package com.message.game.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信
 * Created by LRG on 2019/5/29.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MessageRuleVo implements Serializable{

    private static final long serialVersionUID = -1L;

    // 短信ID
    private Long id;

    //短信内容
    private String content;

    // 短信类型
    private Integer type;

    // 来信人
    private String name;
}
