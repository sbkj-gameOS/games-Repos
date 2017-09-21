package com.steven.util.timer;

/**
 * Created by Administrator on 2017/9/20/020.
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.steven.game.dao.WxTokenMapper;
import com.steven.game.vo.WxToken;
import com.steven.util.wx.ConfigUtil;
import com.steven.util.wx.HttpKit;

import java.util.Date;
import java.util.TimerTask;

/**
 * 定时器，每两个小时更新一下access_token
 * @author Weiyongle
 * @time 2017-5-5 下午2:20:12
 */
public class MyTimerTask extends TimerTask{
    private WxTokenMapper wxTokenMapper;
    public MyTimerTask(WxTokenMapper wxToken){
        this.wxTokenMapper = wxToken ;
    }
    @Override
    public void run() {
        try {
            /** 请求结果 */
            String result = null;
            String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+ ConfigUtil.APPID+"&secret="+ConfigUtil.APP_SECRECT;
            result = HttpKit.get(url);
            JSONObject jsonTexts = (JSONObject) JSON.parse(result);
            WxToken token = new WxToken();
            token.setId(0);
            token.setAccessToken(jsonTexts.get("access_token").toString());
            token.setTime(new Date());
            wxTokenMapper.updateByPrimaryKeySelective(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
