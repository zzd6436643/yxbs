package org.jzw.yxbs.domain;import org.jzw.yxbs.annotation.TrimBlank4Object;@TrimBlank4Objectpublic class UserInfo {		private Long userInfoId;	private String username;	private String userInfoAttrid;	private String userInfoAttrval;		public Long getUserInfoId() {		return userInfoId;	}	public void setUserInfoId(Long userInfoId) {		this.userInfoId = userInfoId;	}	public String getUsername() {		return username;	}	public void setUsername(String username) {		this.username = username;	}	public String getUserInfoAttrid() {		return userInfoAttrid;	}	public void setUserInfoAttrid(String userInfoAttrid) {		this.userInfoAttrid = userInfoAttrid;	}	public String getUserInfoAttrval() {		return userInfoAttrval;	}	public void setUserInfoAttrval(String userInfoAttrval) {		this.userInfoAttrval = userInfoAttrval;	}	}