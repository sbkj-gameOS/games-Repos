package com.steven.game.dao;

import java.util.List;

import com.steven.game.vo.MgUserRechargeHistory;
import com.steven.game.vo.MgUserRechargeHistoryExample;
import org.apache.ibatis.annotations.Param;

public interface MgUserRechargeHistoryMapper {
    int countByExample(MgUserRechargeHistoryExample example);

    int deleteByExample(MgUserRechargeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MgUserRechargeHistory record);

    int insertSelective(MgUserRechargeHistory record);

    List<MgUserRechargeHistory> selectByExample(MgUserRechargeHistoryExample example);

    MgUserRechargeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MgUserRechargeHistory record, @Param("example") MgUserRechargeHistoryExample example);

    int updateByExample(@Param("record") MgUserRechargeHistory record, @Param("example") MgUserRechargeHistoryExample example);

    int updateByPrimaryKeySelective(MgUserRechargeHistory record);

    int updateByPrimaryKey(MgUserRechargeHistory record);
}