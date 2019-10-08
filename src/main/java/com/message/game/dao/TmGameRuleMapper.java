//package com.message.game.dao;
//
//import com.message.game.model.po.TmGameRule;
//import org.apache.ibatis.annotations.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface TmGameRuleMapper {
//    int insert(TmGameRule record);
//
//    int insertSelective(TmGameRule record);
//
//    TmGameRule selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(TmGameRule record);
//
//    int updateByPrimaryKey(TmGameRule record);
//
//    /**
//     * 根据code获取游戏规则
//     * @param dictionCode
//     * @return
//     */
//    List<TmGameRule> getGameRuleList(@Param("dictionCode") String dictionCode);
//}