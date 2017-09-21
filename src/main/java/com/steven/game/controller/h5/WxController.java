package com.steven.game.controller.h5;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.steven.game.service.UserService;
import com.steven.game.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
		String result = "{\"subscribe\": 1,\"openid\":\"o6_bmjrPTlm6_2sgVt7hMZOPfL2M\",\"nickname\": \"Band\",\"sex\": 1,\"language\": \"zh_CN\",\"city\":\"广州\",\"province\": \"广东\",\"country\":\"中国\",\"headimgurl\":\"\",\"subscribe_time\": 1382694957,\"unionid\": \"o6_bmasdasdsad6_2sgVt7hMZOPfL\",\"remark\": \"\",\"groupid\":0,  \"tagid_list\":[128,2]}";//WxUserInfo.getWxUserInfo(code);
		JSONObject jsonObject = (JSONObject) JSON.parse(result);
		Gson gson = new Gson();
		try {
			if (jsonObject.get("openid") != null) {
				UserVo userVo = gson.fromJson(result, UserVo.class);
				int userNum = userService.findOpenIdIsExist(userVo.getOpenid());
				if (0 == userNum) {
					SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyyHHmmssSSS");
					String time =formatter.format(new Date());
					String str = "YX"+time.substring(time.length()-4,time.length());
					userVo.setInvitationCode(str);
					userService.buildUserInfo(userVo);
					session.setAttribute("userVo", userVo);
					dataMap.put("userVo", userVo);
				} else {
					UserVo newUserVo = new UserVo();
					newUserVo = userService.findUserInfo(userVo.getOpenid());
					session.setAttribute("userVo", newUserVo);
					dataMap.put("userVo", newUserVo);
				}
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
