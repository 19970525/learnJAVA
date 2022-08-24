package com.user.logic;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-08-22
 */
public class LoginHandler implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("loginInfo","登录成功");
        modelAndView.setViewName("loginView");
        return modelAndView;
    }
}
