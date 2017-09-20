package com.steven.game.dao;

import com.steven.game.vo.MgShareRun;
import com.steven.game.vo.MgShareRunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgShareRunMapper {
    int countByExample(MgShareRunExample example);

    int deleteByExample(MgShareRunExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MgShareRun record);

    int insertSelective(MgShareRun record);

    List<MgShareRun> selectByExample(MgShareRunExample example);

    MgShareRun selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MgShareRun record, @Param("example") MgShareRunExample example);

    int updateByExample(@Param("record") MgShareRun record, @Param("example") MgShareRunExample example);

    int updateByPrimaryKeySelective(MgShareRun record);

    int updateByPrimaryKey(MgShareRun record);
}