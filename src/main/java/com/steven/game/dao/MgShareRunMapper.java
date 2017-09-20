package com.steven.game.dao;

import com.steven.game.vo.MgShareRun;
import com.steven.game.vo.MgShareRunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgShareRunMapper {

	public int countByExample(MgShareRunExample example);

	public int deleteByExample(MgShareRunExample example);

	public int deleteByPrimaryKey(Long id);

	public int insert(MgShareRun record);

	public int insertSelective(MgShareRun record);

	public List<MgShareRun> selectByExample(MgShareRunExample example);

	public MgShareRun selectByPrimaryKey(Long id);

	public int updateByExampleSelective(@Param("record") MgShareRun record, @Param("example") MgShareRunExample example);

	public int updateByExample(@Param("record") MgShareRun record, @Param("example") MgShareRunExample example);

	public int updateByPrimaryKeySelective(MgShareRun record);

	public int updateByPrimaryKey(MgShareRun record);
}
