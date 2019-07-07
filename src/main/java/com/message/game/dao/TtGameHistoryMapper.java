package com.message.game.dao;

import com.message.game.model.po.TtGameHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TtGameHistoryMapper {
    int insert(TtGameHistory record);

    int insertSelective(TtGameHistory record);

    TtGameHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TtGameHistory record);

    int updateByPrimaryKey(TtGameHistory record);
}