package com.steven.game.dao;

import com.steven.game.vo.MgUserRechargeHistory;
import com.steven.game.vo.MgUserRechargeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgUserRechargeHistoryMapper {

	public int countByExample(MgUserRechargeHistoryExample example);

	public int deleteByExample(MgUserRechargeHistoryExample example);

	public int deleteByPrimaryKey(Long id);

	public int insert(MgUserRechargeHistory record);

	public int insertSelective(MgUserRechargeHistory record);

	public List<MgUserRechargeHistory> selectByExample(MgUserRechargeHistoryExample example);

	public MgUserRechargeHistory selectByPrimaryKey(Long id);

	public int updateByExampleSelective(@Param("record") MgUserRechargeHistory record, @Param("example") MgUserRechargeHistoryExample example);

	public int updateByExample(@Param("record") MgUserRechargeHistory record, @Param("example") MgUserRechargeHistoryExample example);

	public int updateByPrimaryKeySelective(MgUserRechargeHistory record);

	public int updateByPrimaryKey(MgUserRechargeHistory record);
}
