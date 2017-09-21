package com.steven.game.dao;

import com.steven.game.vo.WxToken;
import com.steven.game.vo.WxTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxTokenMapper {
    int countByExample(WxTokenExample example);

    int deleteByExample(WxTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxToken record);

    int insertSelective(WxToken record);

    List<WxToken> selectByExample(WxTokenExample example);

    WxToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxToken record, @Param("example") WxTokenExample example);

    int updateByExample(@Param("record") WxToken record, @Param("example") WxTokenExample example);

    int updateByPrimaryKeySelective(WxToken record);

    int updateByPrimaryKey(WxToken record);
}