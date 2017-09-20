package com.steven.game.controller.h5;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.google.gson.Gson;
import com.steven.game.vo.UserVo;
import com.steven.util.wx.ConfigUtil;
import com.steven.util.wx.GetWxOrderno;
import com.steven.util.wx.PayCommonUtil;
import com.steven.util.wx.RequestHandler;
import com.steven.util.wx.Sha1Util;

/**
 * @ClassName: WXPayController
 * @Description: TODO(微信支付控制层)
 * @author dave
 * @date 2017年9月19日 下午4:06:24
 */
@Controller
@RequestMapping("/wxpay")
public class WXPayController {

	/**
	 * 方法描述: 跳转到h5微信支付<br>
	 * 作者：田帅 <br>
	 * 创建时间：2017-09-16 <br>
	 * 版本：V1.0
	 */
	@RequestMapping("/toH5WxPay")
	public String toH5WxPay(String out_trade_no, String total_fee, String body) {
		System.out.println("out_trade_no=" + out_trade_no);
		System.out.println("total_fee=" + total_fee);
		System.out.println("body=" + body);
		String backUri = "";// 微信授权后跳转的支付界面
		backUri = backUri + "?out_trade_no=" + out_trade_no + "&total_fee=" + total_fee + "&body=" + body;
		// URLEncoder.encode 后可以在backUri 的url里面获取传递的所有参数
		backUri = URLEncoder.encode(backUri);
		// scope 参数视各自需求而定，这里用scope=snsapi_base 不弹出授权页面直接授权目的只获取统一支付接口的openid
		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?" + "appid=" + ConfigUtil.APPIDH5 + "&redirect_uri=" + backUri
				+ "&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect";
		return "redirect:" + url;
	}

	/**
	 * 方法描述: H5向微信请求支付信息<br>
	 * 作者：田帅 <br>
	 * 创建时间：2017-09-16 <br>
	 * 版本：V1.0
	 */
	@RequestMapping("/getWXPayXmlH5")
	@ResponseBody
	public Object getWXPayXmlH5(HttpServletRequest request, HttpServletResponse response, int userId, String out_trade_no, String status,
			@SessionAttribute("userVo") UserVo userVo) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Gson gson = new Gson();
		String openid = userVo.getOpenid();
		String total_fee;
		try {
			// 查询用户信息
			System.out.println("openid:" + openid);
			// 查询应交金额
			BigDecimal payment = null;
			if (payment == null) {
				dataMap.put("status", "202");
				dataMap.put("message", "没有根据该订单查询到应交金额");
				return dataMap;
			}
			total_fee = String.valueOf(payment);
		} catch (Exception e) {
			dataMap.put("status", "500");
			dataMap.put("message", "服务器内部异常");
			System.out.println("未知异常：" + e.getLocalizedMessage());
			return dataMap;
		}

		// HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println("userId=" + userId);
		System.out.println("out_trade_no=" + out_trade_no);
		System.out.println("total_fee=" + total_fee);
		// System.out.println("body=" + body);
		System.out.println("openid=" + openid);
		// 金额转化为分为单位
		int finalmoney = (int) (Double.valueOf(total_fee) * 100);

		String appid = ConfigUtil.APPID;
		String appsecret = ConfigUtil.APP_SECRECTH5;
		String partner = ConfigUtil.MCH_IDH5;
		String partnerkey = ConfigUtil.API_KEYH5;

		request.getSession();
		// 商户号
		String mch_id = partner;
		// 随机数
		String nonce_str = PayCommonUtil.CreateNoncestr();
		// 商品描述根据情况修改
		String body = "麻将游戏";

		// 订单生成的机器 IP
		String spbill_create_ip = PayCommonUtil.getIpAddress(request);
		// 这里notify_url是 支付完成后微信发给该链接信息，可以判断会员是否支付成功，改变订单状态等。
		String notify_url = ConfigUtil.NOTIFY_URL;
		System.out.println("wowowo====================" + notify_url);
		System.out.println("=========================================================================================");
		System.out.println("wowowo====================" + notify_url);
		System.out.println("=========================================================================================");
		String trade_type = "JSAPI";
		SortedMap<Object, Object> packageParams = new TreeMap<Object, Object>();
		packageParams.put("appid", appid);
		packageParams.put("mch_id", mch_id);
		packageParams.put("nonce_str", nonce_str);
		packageParams.put("body", body);
		packageParams.put("out_trade_no", out_trade_no);
		packageParams.put("total_fee", finalmoney + "");
		packageParams.put("spbill_create_ip", spbill_create_ip);
		packageParams.put("notify_url", notify_url);
		packageParams.put("trade_type", trade_type);
		packageParams.put("openid", openid);

		if ("1".equals(status)) {
			// 附件属性,原样返回
			packageParams.put("attach", "clear");
		} else {
			// 附件属性,原样返回
			packageParams.put("attach", "trade");
		}

		RequestHandler reqHandler = new RequestHandler(request, response);
		reqHandler.init(appid, appsecret, partnerkey);

		String sign = PayCommonUtil.createSignature(packageParams);
		String xml = "<xml>" + "<appid>" + appid + "</appid>" + "<mch_id>" + mch_id + "</mch_id>" + "<nonce_str>" + nonce_str + "</nonce_str>" + "<sign>" + sign + "</sign>"
				+ "<body><![CDATA[" + body + "]]></body>" + "<out_trade_no>" + out_trade_no + "</out_trade_no>" + "<total_fee>" + finalmoney + "</total_fee>" + "<spbill_create_ip>"
				+ spbill_create_ip + "</spbill_create_ip>" + "<notify_url>" + notify_url + "</notify_url>" + "<trade_type>" + trade_type + "</trade_type>" + "<openid>" + openid
				+ "</openid>" + "<attach>" + packageParams.get("attach") + "</attach>" + "</xml>";
		System.out.println("xml=" + xml);
		String createOrderURL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
		String prepay_id = "";
		try {
			prepay_id = new GetWxOrderno().getPayNo(createOrderURL, xml);
			if (prepay_id.equals("")) {
				request.setAttribute("ErrorMsg", "统一支付接口获取预支付订单出错");
				response.sendRedirect("error.jsp");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		SortedMap<String, String> finalpackage = new TreeMap<String, String>();
		String appid2 = appid;
		String timestamp = Sha1Util.getTimeStamp();
		String nonceStr2 = nonce_str;
		String prepay_id2 = "prepay_id=" + prepay_id;
		String packages = prepay_id2;
		finalpackage.put("appId", appid2);
		finalpackage.put("timeStamp", timestamp);
		finalpackage.put("nonceStr", nonceStr2);
		finalpackage.put("package", packages);
		finalpackage.put("signType", "MD5");
		String finalsign = reqHandler.createSign(finalpackage);

		dataMap.put("appid", appid2);
		dataMap.put("timeStamp", timestamp);
		dataMap.put("nonceStr", nonceStr2);
		dataMap.put("package", packages);
		dataMap.put("paySign", finalsign);
		dataMap.put("status", 200);
		return gson.toJson(dataMap);

	}
}
