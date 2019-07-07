package com.message.game.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

/**
 * Created by LRG on 2019/5/29.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    // 微信openID
    @NotEmpty(message = "用户OpenId信息不能为空！")
    private String openid;

    // 用户名称
    private String userName;

    // 用户手机号码
    private String userMobile;

    // 用户头像链接
    private String userImage;

    // 用户性别
    private Integer sex;


}
