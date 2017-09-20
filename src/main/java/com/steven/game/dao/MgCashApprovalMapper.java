package com.steven.game.dao;

import com.steven.game.vo.MgCashApproval;
import com.steven.game.vo.MgCashApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgCashApprovalMapper {

	public int countByExample(MgCashApprovalExample example);

	public int deleteByExample(MgCashApprovalExample example);

	public int deleteByPrimaryKey(Long id);

	public int insert(MgCashApproval record);

	public int insertSelective(MgCashApproval record);

	public List<MgCashApproval> selectByExample(MgCashApprovalExample example);

	public MgCashApproval selectByPrimaryKey(Long id);

	public int updateByExampleSelective(@Param("record") MgCashApproval record, @Param("example") MgCashApprovalExample example);

	public int updateByExample(@Param("record") MgCashApproval record, @Param("example") MgCashApprovalExample example);

	public int updateByPrimaryKeySelective(MgCashApproval record);

	public int updateByPrimaryKey(MgCashApproval record);
}
