package com.message.game.dao;

import com.message.game.model.po.TmDiction;
import org.springframework.stereotype.Repository;

@Repository
public interface TmDictionMapper {
    int insert(TmDiction record);

    int insertSelective(TmDiction record);

    TmDiction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TmDiction record);

    int updateByPrimaryKey(TmDiction record);
}