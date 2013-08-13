package org.jzw.yxbs.controller;import org.apache.log4j.Logger;import org.jzw.yxbs.utils.UserInfoUtil;import org.springframework.stereotype.Controller;import org.springframework.ui.ModelMap;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.servlet.ModelAndView;@Controller@RequestMapping("/index")public class IndexController {	private static final Logger LOGGER = Logger.getLogger(IndexController.class);		@RequestMapping(value = "welcome")	public String welcome() {		LOGGER.info("welcome!");		return "index/welcome";	}	@RequestMapping(value = "login")	public ModelAndView login() {		LOGGER.info("login：" + UserInfoUtil.getUserName());		ModelMap modelMap = new ModelMap();		modelMap.addAttribute("username", UserInfoUtil.getUserName());		return new ModelAndView("index/login", modelMap);	}	@RequestMapping(value = "notlogin")	public String notlogin() {		LOGGER.info("notlogin!");		return "index/notlogin";	}		@RequestMapping(value = "accessDenied")	public ModelAndView accessDenied(){		LOGGER.info("403：" + UserInfoUtil.getUserName());		ModelMap modelMap = new ModelMap();		modelMap.addAttribute("username", UserInfoUtil.getUserName());		return new ModelAndView("common/403", modelMap);	}		@RequestMapping(value = "about")	public ModelAndView about(){		ModelMap modelMap = new ModelMap();		modelMap.addAttribute("username", UserInfoUtil.getUserName());		return new ModelAndView("index/about", modelMap);	}		@RequestMapping(value = "menu2")	public ModelAndView menu2() {		ModelMap modelMap = new ModelMap();		modelMap.addAttribute("username", UserInfoUtil.getUserName());		return new ModelAndView("menu2", modelMap);	}}