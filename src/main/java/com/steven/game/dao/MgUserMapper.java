package com.steven.game.dao;

import com.steven.game.vo.MgUser;
import com.steven.game.vo.MgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgUserMapper {

	public int countByExample(MgUserExample example);

	public int deleteByExample(MgUserExample example);

	public int deleteByPrimaryKey(Long id);

	public int insert(MgUser record);

	public int insertSelective(MgUser record);

	public List<MgUser> selectByExample(MgUserExample example);

	public MgUser selectByPrimaryKey(Long id);

	public int updateByExampleSelective(@Param("record") MgUser record, @Param("example") MgUserExample example);

	public int updateByExample(@Param("record") MgUser record, @Param("example") MgUserExample example);

	public int updateByPrimaryKeySelective(MgUser record);

	public int updateByPrimaryKey(MgUser record);
}
