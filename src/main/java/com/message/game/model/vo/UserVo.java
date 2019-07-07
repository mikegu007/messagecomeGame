package com.message.game.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 用户排行榜
 * Created by LRG on 2019/6/1.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserVo implements Serializable{

    private static final long serialVersionUID = -1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户uuid
     */
    private String uuid;

    /**
     * 微信openID
     */
    private String openid;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户手机号码
     */
    private String userMobile;

    /**
     * 用户最长时间
     */
    private Long userTime;

    /**
     * 用户头像连接
     */
    private String userImage;

}
