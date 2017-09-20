package com.steven.game.dao;

import com.steven.game.vo.MgRoomCordUsehistory;
import com.steven.game.vo.MgRoomCordUsehistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgRoomCordUsehistoryMapper {
    int countByExample(MgRoomCordUsehistoryExample example);

    int deleteByExample(MgRoomCordUsehistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MgRoomCordUsehistory record);

    int insertSelective(MgRoomCordUsehistory record);

    List<MgRoomCordUsehistory> selectByExample(MgRoomCordUsehistoryExample example);

    MgRoomCordUsehistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MgRoomCordUsehistory record, @Param("example") MgRoomCordUsehistoryExample example);

    int updateByExample(@Param("record") MgRoomCordUsehistory record, @Param("example") MgRoomCordUsehistoryExample example);

    int updateByPrimaryKeySelective(MgRoomCordUsehistory record);

    int updateByPrimaryKey(MgRoomCordUsehistory record);
}