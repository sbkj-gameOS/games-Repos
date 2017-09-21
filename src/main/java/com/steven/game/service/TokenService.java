package com.steven.game.service;

import com.steven.game.vo.WxToken;

/**
 * Created by tianshuai on 2017/9/20/020.
 */
public interface TokenService {

    /**
     * 根据id查询token值
     * @param wxToken
     * @return
     */
    public WxToken selectToken(WxToken wxToken);
}
