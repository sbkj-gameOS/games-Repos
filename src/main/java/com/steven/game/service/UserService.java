package com.steven.game.service;

import com.steven.game.vo.UserVo;

/**
 * @ClassName: UserService
 * @Description: TODO(用户信息业务层)
 * @author dave
 * @date 2017年9月19日 上午10:06:27
 */
public interface UserService {

	/**
	 * @Title: findInvitationCodeIsExist
	 * @Description: TODO(查询邀请码是否已经存在)
	 * @param str
	 * @return 设定文件 Integer 返回类型
	 */
	public Integer findInvitationCodeIsExist(String str);

	/**
	 * @Title: findOpenIdIsExist
	 * @Description: TODO(查询人员是否存在)
	 * @param openid
	 * @return 设定文件 Integer 返回类型
	 */
	public Integer findOpenIdIsExist(String openid);

	/**
	 * @Title: buildUserInfo
	 * @Description: TODO(创建人员)
	 * @param userVo 设定文件 void 返回类型
	 */
	public void buildUserInfo(UserVo userVo);

	/**
	 * @Title: findUserInfo
	 * @Description: TODO(查询人员信息)
	 * @param openid
	 * @return 设定文件 UserVo 返回类型
	 */
	public UserVo findUserInfo(String openid);

}
