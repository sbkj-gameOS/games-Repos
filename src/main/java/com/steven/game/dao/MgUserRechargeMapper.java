package com.steven.game.dao;

import com.steven.game.vo.MgUserRecharge;
import com.steven.game.vo.MgUserRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgUserRechargeMapper {
    int countByExample(MgUserRechargeExample example);

    int deleteByExample(MgUserRechargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MgUserRecharge record);

    int insertSelective(MgUserRecharge record);

    List<MgUserRecharge> selectByExample(MgUserRechargeExample example);

    MgUserRecharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MgUserRecharge record, @Param("example") MgUserRechargeExample example);

    int updateByExample(@Param("record") MgUserRecharge record, @Param("example") MgUserRechargeExample example);

    int updateByPrimaryKeySelective(MgUserRecharge record);

    int updateByPrimaryKey(MgUserRecharge record);
}