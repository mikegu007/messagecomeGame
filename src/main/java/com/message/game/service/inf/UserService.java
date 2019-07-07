package com.message.game.service.inf;

import com.message.game.model.PageBase.DataTableCommonParameter;
import com.message.game.model.PageBase.PageBean;
import com.message.game.model.dto.UserDto;
import com.message.game.model.vo.UserVo;

/**
 * Created by LRG on 2019/5/29.
 */
public interface UserService {

    /**
     * 添加一个新用户
     * @param userDto
     * @return
     */
    String addNewUser(UserDto userDto);

    /**
     * 获取用户个人信息
     * @param uuid
     * @return
     */
    UserVo getUserByUuid(String uuid);

    /**
     * 根据openId获取用户信息
     * @param openid
     * @return
     */
    UserVo getUserByOpenId(String openid);

    /**
     * 分页获取用户排行榜
     * @param parameter
     * @return
     */
    PageBean<UserVo> getPankingList(DataTableCommonParameter parameter);
}
