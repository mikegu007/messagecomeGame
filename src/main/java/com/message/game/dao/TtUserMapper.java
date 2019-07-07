package com.message.game.dao;

import com.message.game.model.po.TtUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TtUserMapper {
    int insert(TtUser record);

    int insertSelective(TtUser record);

    TtUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TtUser record);

    int updateByPrimaryKey(TtUser record);

    /**
     * 根据UUID获取用户信息
     * @param uuid
     * @return
     */
    TtUser queryUserInfoByUuid(@Param("uuid") String uuid);

    /**
     * 根据OpenId获取用户信息
     * @param openid
     * @return
     */
    TtUser queryUserInfoByOpenId(@Param("openid") String openid);

    /**
     *获取用户总数
     * @return
     */
    int queryUserCount();

    /**
     * 获取用户列表
     * @return
     */
    List<TtUser> queryUserList();
}