package org.jzw.yxbs.domain;

import java.sql.Timestamp;

/**
 * BBS中Message bean
 * @author mOnsoOn
 *
 */
public class Message {
	private Integer mid;
	private Integer tid;
	private String username;
	private String mtitle;
	private String mcontent;
	private Timestamp mtime;
	private Integer mstate;
	private Timestamp lastReplyTime;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMtitle() {
		return mtitle;
	}
	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public Timestamp getMtime() {
		return mtime;
	}
	public void setMtime(Timestamp mtime) {
		this.mtime = mtime;
	}
	public Integer getMstate() {
		return mstate;
	}
	public void setMstate(Integer mstate) {
		this.mstate = mstate;
	}
	public Timestamp getLastReplyTime() {
		return lastReplyTime;
	}
	public void setLastReplyTime(Timestamp lastReplyTime) {
		this.lastReplyTime = lastReplyTime;
	}
	
	

}
