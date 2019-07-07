package com.message.game.dao;

import com.message.game.model.po.TmMessageRule;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TmMessageRuleMapper {
    int insert(TmMessageRule record);

    int insertSelective(TmMessageRule record);

    TmMessageRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TmMessageRule record);

    int updateByPrimaryKey(TmMessageRule record);

    /**
     * 获取短信规则列表
     * @param sex
     * @return
     */
    List<TmMessageRule> queryMessageRuleList(@Param("sex") String sex);
}