package org.jzw.yxbs.controller;import java.util.ArrayList;import java.util.List;import javax.annotation.Resource;import org.springframework.security.core.context.SecurityContextHolder;import org.springframework.security.core.session.SessionRegistry;import org.springframework.security.core.userdetails.UserDetails;import org.springframework.web.bind.annotation.ModelAttribute;public class BaseController {		@Resource	SessionRegistry sessionRegistry;		@ModelAttribute("baseUserOnlineNum")	public int getNumberOfUsers() {		return sessionRegistry.getAllPrincipals().size();	}		@ModelAttribute("baseUserOnlineList")	public List<String> getUserOnlineList(){		List<Object> list = sessionRegistry.getAllPrincipals();		List<String> resultList = new ArrayList<String>();		for (Object principal:list) {			String username = "";			if (principal instanceof UserDetails) {				username = ((UserDetails) principal).getUsername();			} else {				username = principal.toString();			}			resultList.add(username);		}		return resultList;	}		@ModelAttribute("baseCurrentUsername")	public String getCurrentUsername() {		Object principal = SecurityContextHolder.getContext()				.getAuthentication().getPrincipal();		String username = "";		if (principal instanceof UserDetails) {			username = ((UserDetails) principal).getUsername();		} else {			username = principal.toString();		}		return username;	}	}