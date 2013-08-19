package org.jzw.yxbs.controller;import java.util.List;import javax.annotation.Resource;import org.apache.log4j.Logger;import org.jzw.yxbs.domain.Section;import org.jzw.yxbs.service.BBSSectionService;import org.jzw.yxbs.service.UserService;import org.springframework.stereotype.Controller;import org.springframework.ui.ModelMap;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.servlet.ModelAndView;@Controller@RequestMapping("/bbs")public class BbsController {	@Resource	private BBSSectionService bbssectionService;		@RequestMapping(value = "index")	public ModelAndView bbs() {		ModelMap modelMap = new ModelMap();		List<Section> listSections = bbssectionService.findAllSection();		modelMap.addAttribute("listSections", listSections);		return new ModelAndView("bbs/index", modelMap);	}}