package com.steven.game.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steven.game.dao.UserDao;
import com.steven.game.service.UserService;
import com.steven.game.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public Integer findInvitationCodeIsExist(String str) {
		return userDao.findInvitationCodeIsExist(str);
	}

	@Override
	public Integer findOpenIdIsExist(String openid) {
		return userDao.findOpenIdIsExist(openid);
	}

	@Override
	public void buildUserInfo(UserVo userVo) {
		userDao.buildUserInfo(userVo);
	}

	@Override
	public UserVo findUserInfo(String openid) {
		return userDao.findUserInfo(openid);
	}

}
