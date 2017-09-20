package com.steven.game.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.steven.game.service.UserService;
import com.steven.game.vo.UserVo;
import com.steven.util.RandomStr;
import com.steven.util.wx.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 类描述：微信授权登录等action <br>
 * 作者：田帅 <br>
 * 创建时间：2017-09-16 <br>
 * 版本：V1.0
 */
@Controller
@RequestMapping("/wxController")
public class WxController {

	@Autowired
	private UserService userService;

	/**
	 * @Title: wxLogin
	 * @Description: TODO(根据code获取用户信息)
	 * @param code
	 * @param session
	 * @return 设定文件 String 返回类型
	 */
	@ResponseBody
	@RequestMapping("/wxLogin")
	public String wxLogin(String code, HttpSession session) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		/** 请求结果 */
		String result = WxUserInfo.getWxUserInfo(code);
		JSONObject jsonObject = (JSONObject) JSON.parse(result);
		Gson gson = new Gson();
		try {
			if ("40013" != jsonObject.get("errcode")) {
				UserVo userVo = gson.fromJson(result, UserVo.class);
				int userNum = userService.findOpenIdIsExist(userVo.getOpenid());
				if (0 == userNum) {
					String str = userVo.getOpenid() + RandomStr.randomStr(6);
					userVo.setInvitationCode(str);
					userService.buildUserInfo(userVo);
					session.setAttribute("userVo", userVo);
				} else {
					UserVo newUserVo = new UserVo();
					newUserVo = userService.findUserInfo(userVo.getOpenid());
					session.setAttribute("userVo", newUserVo);
				}
				dataMap.put("userVo", userVo);
				dataMap.put("success", true);
			} else {
				dataMap.put("success", false);
				dataMap.put("msg", "授权失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			dataMap.put("success", false);
			dataMap.put("msg", "授权失败");
		}
		return gson.toJson(dataMap);
	}

	/**
	 * 方法描述: 微信绑定平台的用户手机号<br>
	 * 作者：田帅 <br>
	 * 创建时间：2017-09-16 <br>
	 * 版本：V1.0
	 */
	@RequestMapping("/wxBound")
	@ResponseBody
	public Object wxBound(String mobile, String openid, String nickname, String headimgurl) {
		Map<String, Object> json = new HashMap<String, Object>();
		System.out.println("mobile=" + mobile);
		System.out.println("openid=" + openid);
		System.out.println("nickname=" + nickname);
		System.out.println("headimgurl=" + headimgurl);
		if (mobile == null || mobile.isEmpty() || openid == null || openid.isEmpty()) {
			json.put("status", "203");
			json.put("message", "参数不完整");
			return json;
		}
		// 赋值书手机号
		/* 根据手机号查询账号是否存在 */
		// 该手机号还没有注册
		// 该手机号已注册
		// 先查询该手机号是否已绑定微信openid
		return json;
	}


}
