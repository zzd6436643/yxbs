package org.jzw.yxbs.controller;import org.apache.log4j.Logger;import org.jzw.yxbs.utils.UserInfoUtil;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;@Controller@RequestMapping("/index")public class IndexController {		private static final Logger LOGGER = Logger.getLogger(IndexController.class);		@RequestMapping(value = "welcome")	public String welcome(){		LOGGER.info("welcome!");		return "welcome";	}		@RequestMapping(value = "login")	public String login(){		LOGGER.info("login：" + UserInfoUtil.getUserName());		return "login";	}		@RequestMapping(value = "notlogin")	public String notlogin(){		LOGGER.info("notlogin!");		return "notlogin";	}}