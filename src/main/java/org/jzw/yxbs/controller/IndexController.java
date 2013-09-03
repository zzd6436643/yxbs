package org.jzw.yxbs.controller;import javax.annotation.Resource;import org.apache.commons.lang3.StringUtils;import org.apache.log4j.Logger;import org.jzw.yxbs.service.IndexService;import org.jzw.yxbs.utils.UserInfoUtil;import org.springframework.stereotype.Controller;import org.springframework.ui.ModelMap;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.servlet.ModelAndView;@Controller@RequestMapping("/index")public class IndexController extends BaseController {	private static final Logger LOGGER = Logger.getLogger(IndexController.class);		@Resource	private IndexService indexService;		@RequestMapping(value = "welcome")	public String welcome() {		LOGGER.info("welcome!");		return "index/welcome";	}	@RequestMapping(value = "login")	public ModelAndView login() {		LOGGER.info("login：" + UserInfoUtil.getUserName() + "first login");		ModelMap modelMap = new ModelMap();		indexService.updateLastLoginTime(UserInfoUtil.getUserName());		String lastlogin = indexService.getLastLoginTime(UserInfoUtil.getUserName());		if (StringUtils.isEmpty(lastlogin)) {			modelMap.addAttribute("lastloginTime", "您之前没用登录过系统");		} else {			modelMap.addAttribute("lastloginTime", lastlogin);		}		return new ModelAndView("index/home",modelMap);	}	@RequestMapping(value = "home")	public ModelAndView home() {		LOGGER.info("login：" + UserInfoUtil.getUserName());		ModelMap modelMap = new ModelMap();		String lastlogin = indexService.getLastLoginTime(UserInfoUtil.getUserName());		if (StringUtils.isEmpty(lastlogin)) {			modelMap.addAttribute("lastloginTime", "您之前没用登录过系统");		} else {			modelMap.addAttribute("lastloginTime", lastlogin);		}		return new ModelAndView("index/home",modelMap);	}		@RequestMapping(value = "notlogin")	public String notlogin() {		LOGGER.info("notlogin!");		return "index/notlogin";	}		@RequestMapping(value = "accessDenied")	public String accessDenied(){		LOGGER.info("403：" + UserInfoUtil.getUserName());		return "common/403";	}		@RequestMapping(value = "about")	public String about(){		return "index/about";	}	@RequestMapping(value = "bbs")	public String bbs() {		return "index/bbs";	}	}