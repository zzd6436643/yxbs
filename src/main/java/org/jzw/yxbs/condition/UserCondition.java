package org.jzw.yxbs.condition;import org.jzw.yxbs.annotation.TrimBlank4Object;import org.jzw.yxbs.utils.EscapeStringUtil;@TrimBlank4Objectpublic class UserCondition extends BaseCondition {		private Long userId;	private String username;	private String role;	private Integer isenable;		public Long getUserId() {		return userId;	}	public void setUserId(Long userId) {		this.userId = userId;	}	public String getUsername() {		return username;	}	public String getEscapeUserName() {		return EscapeStringUtil.escape4mysql(username);	}	public void setUsername(String username) {		this.username = username;	}	public String getRole() {		return role;	}	public void setRole(String role) {		this.role = role;	}	public Integer getIsenable() {		return isenable;	}	public void setIsenable(Integer isenable) {		this.isenable = isenable;	}	public String getDisplayIsenable() {		if (isenable == null) {			return "";		}		if (isenable == 1) {			return "enabled";		} else if (isenable == 0){			return "disabled";		} else {			return "";		}	}	public void setDisplayIsenable(String displayIsenable){		if (displayIsenable == null||displayIsenable.trim().equalsIgnoreCase("")) {			this.isenable = null;		} else if (displayIsenable.equalsIgnoreCase("enabled")) {			this.isenable = 1;		} else if (displayIsenable.equalsIgnoreCase("disabled")) {			this.isenable = 0;		} else {			this.isenable = -1;		}	}}