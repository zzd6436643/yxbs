package org.jzw.yxbs.controller;import java.util.HashMap;import java.util.List;import java.util.Map;import javax.annotation.Resource;import org.apache.log4j.Logger;import org.jzw.yxbs.condition.MessageCondition;import org.jzw.yxbs.condition.TopicCondition;import org.jzw.yxbs.domain.Message;import org.jzw.yxbs.domain.Section;import org.jzw.yxbs.domain.Topic;import org.jzw.yxbs.service.BBSMessageService;import org.jzw.yxbs.service.BBSSectionService;import org.jzw.yxbs.service.BBSTopicService;import org.jzw.yxbs.utils.PaginationUtil;import org.jzw.yxbs.utils.UserInfoUtil;import org.springframework.stereotype.Controller;import org.springframework.ui.ModelMap;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.servlet.ModelAndView;@Controller@RequestMapping("/bbs")public class BbsController {		private static Logger logger = Logger.getLogger(BbsController.class);	@Resource	private BBSSectionService bbssectionService;		@Resource	private BBSTopicService bbstopicService;		@Resource	private BBSMessageService bbsMessageService;		@RequestMapping(value = "index")	public ModelAndView bbs() {		ModelMap modelMap = new ModelMap();		List<Section> listSections = bbssectionService.findAllSection();		modelMap.addAttribute("listSections", listSections);		Map<Integer, List<Topic>> mapTopic = new HashMap<Integer, List<Topic>>();		for (int i=0; i<listSections.size(); i++)		{			Section section = listSections.get(i);			TopicCondition tc = new TopicCondition();			tc.setSectionID(section.getSid());			List<Topic> listTopics = bbstopicService.findTopics(tc);			mapTopic.put(section.getSid(), listTopics);		}		modelMap.addAttribute("mapTopic", mapTopic);		return new ModelAndView("bbs/index", modelMap);	}		@RequestMapping(value="topic")	public ModelAndView topic(TopicCondition tc)	{		ModelMap modelMap = new ModelMap();		List<Topic> listTopics = bbstopicService.findTopics(tc);		if (listTopics.size() > 0)		{			Topic topic = listTopics.get(0);			modelMap.addAttribute("topic", topic);			MessageCondition mc = new MessageCondition();			mc.setTid(tc.getTid());			mc.setPageIndex(tc.getPageIndex());			mc.setPageSize(30);			Integer msgCount = bbsMessageService.selectCount(mc);			List<Message> listMsgs = bbsMessageService.selectMessages(mc);			modelMap.addAttribute("listMessage", listMsgs);			modelMap.addAttribute("currentPage", PaginationUtil.getCurrentPage(mc.getPageIndex(), mc.getPageSize(), msgCount));			modelMap.addAttribute("totalPage", PaginationUtil.getTotalPage(mc.getPageIndex(), mc.getPageSize(), msgCount));			modelMap.addAttribute("messageCount", msgCount);		}		return new ModelAndView("bbs/topic", modelMap);	}		@RequestMapping(value="newMsg")	public ModelAndView newMsg(TopicCondition tc)	{		ModelMap modelMap = new ModelMap();		List<Topic> topics = bbstopicService.findTopics(tc);		if (topics.size() > 0)		{			modelMap.addAttribute("topic", topics.get(0));		}		return new ModelAndView("bbs/newMsg", modelMap);	}		@RequestMapping(value="cmtMsg")	public ModelAndView insertMsg(Message m)	{		ModelMap modelMap = new ModelMap();		String username = UserInfoUtil.getUserName();		m.setUsername(username);		bbsMessageService.insert(m);		modelMap.addAttribute("flag", true);		modelMap.addAttribute("desc", "发贴成功, 请等待版本审核");		return new ModelAndView("bbs/cmtMsg", modelMap);	}	}