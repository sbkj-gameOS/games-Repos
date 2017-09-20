package com.steven.game.dao;

import com.steven.game.vo.MgRoomCordUsehistory;
import com.steven.game.vo.MgRoomCordUsehistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgRoomCordUsehistoryMapper {

	public int countByExample(MgRoomCordUsehistoryExample example);

	public int deleteByExample(MgRoomCordUsehistoryExample example);

	public int deleteByPrimaryKey(Long id);

	public int insert(MgRoomCordUsehistory record);

	public int insertSelective(MgRoomCordUsehistory record);

	public List<MgRoomCordUsehistory> selectByExample(MgRoomCordUsehistoryExample example);

	public MgRoomCordUsehistory selectByPrimaryKey(Long id);

	public int updateByExampleSelective(@Param("record") MgRoomCordUsehistory record, @Param("example") MgRoomCordUsehistoryExample example);

	public int updateByExample(@Param("record") MgRoomCordUsehistory record, @Param("example") MgRoomCordUsehistoryExample example);

	public int updateByPrimaryKeySelective(MgRoomCordUsehistory record);

	public int updateByPrimaryKey(MgRoomCordUsehistory record);
}
