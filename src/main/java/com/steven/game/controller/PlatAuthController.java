package com.steven.game.controller;

import com.steven.game.dao.TestDao;
import com.steven.user.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 登陆授权等等相关action
 * Created by lanhaozhi on 2017/8/17.
 */
@Controller
@RequestMapping("test")
public class PlatAuthController {
	
	@Autowired
	private TestDao testDao;
	
    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public String login(ModelMap model, HttpSession session, @RequestParam("userName")String userName
            ,@RequestParam("pass")String pass) {
        User user = new User() ;
        user.setUserName(userName);
        session.setAttribute(User.UK,user);

        return "hello";
    }

    @RequestMapping(value = "/toLogin", method = {RequestMethod.GET,RequestMethod.POST})
    public String loginOut(ModelMap model) {
        return "login" ;
    }
    
    @RequestMapping(value = "/test", method = {RequestMethod.GET,RequestMethod.POST})
    public String test() {
    	testDao.updateTest();
        return "3213213" ;
    }
}
