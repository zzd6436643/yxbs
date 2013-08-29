package org.jzw.yxbs.domain;

import java.sql.Timestamp;

import com.mysql.jdbc.Blob;

/**
 * 主题部分
 * 
 * @author mOnsoOn
 *
 */
public class Topic {
	
	private Integer tid;
	private Integer sid;
	private Blob icon;
	private String title;
	private Timestamp timestamp;
	private Integer tstate;
	private Integer tmcount;
	private Integer trcount;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Blob getIcon() {
		return icon;
	}
	public void setIcon(Blob icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getTstate() {
		return tstate;
	}
	public void setTstate(Integer tstate) {
		this.tstate = tstate;
	}
	public Integer getTmcount() {
		return tmcount;
	}
	public void setTmcount(Integer tmcount) {
		this.tmcount = tmcount;
	}
	public Integer getTrcount() {
		return trcount;
	}
	public void setTrcount(Integer trcount) {
		this.trcount = trcount;
	}
	
	
	
	
}
