package com.steven.game.dao;

import com.steven.game.vo.MgUserRecharge;
import com.steven.game.vo.MgUserRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgUserRechargeMapper {

	public int countByExample(MgUserRechargeExample example);

	public int deleteByExample(MgUserRechargeExample example);

	public int deleteByPrimaryKey(Long id);

	public int insert(MgUserRecharge record);

	public int insertSelective(MgUserRecharge record);

	public List<MgUserRecharge> selectByExample(MgUserRechargeExample example);

	public MgUserRecharge selectByPrimaryKey(Long id);

	public int updateByExampleSelective(@Param("record") MgUserRecharge record, @Param("example") MgUserRechargeExample example);

	public int updateByExample(@Param("record") MgUserRecharge record, @Param("example") MgUserRechargeExample example);

	public int updateByPrimaryKeySelective(MgUserRecharge record);

	public int updateByPrimaryKey(MgUserRecharge record);
}
