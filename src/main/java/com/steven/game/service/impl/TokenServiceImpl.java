package com.steven.game.service.impl;

import com.steven.game.dao.WxTokenMapper;
import com.steven.game.service.TokenService;
import com.steven.game.vo.WxToken;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tianshuai on 2017/9/20/020.
 */
public class TokenServiceImpl implements TokenService {
    @Autowired
    private WxTokenMapper wxTokenMapper;
    @Override
    public WxToken selectToken(WxToken wxToken) {
        return wxTokenMapper.selectByPrimaryKey(0);
    }
}
