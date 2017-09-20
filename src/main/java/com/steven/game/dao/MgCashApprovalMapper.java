package com.steven.game.dao;

import com.steven.game.vo.MgCashApproval;
import com.steven.game.vo.MgCashApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgCashApprovalMapper {
    int countByExample(MgCashApprovalExample example);

    int deleteByExample(MgCashApprovalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MgCashApproval record);

    int insertSelective(MgCashApproval record);

    List<MgCashApproval> selectByExample(MgCashApprovalExample example);

    MgCashApproval selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MgCashApproval record, @Param("example") MgCashApprovalExample example);

    int updateByExample(@Param("record") MgCashApproval record, @Param("example") MgCashApprovalExample example);

    int updateByPrimaryKeySelective(MgCashApproval record);

    int updateByPrimaryKey(MgCashApproval record);
}