package com.sadan.useafter.model;

import java.util.List;
import java.util.Map;

public class Useafter_reply_DTO {
	private String no;
	private String rno;
	private String replytext;
	private String replyer;
	private String regdate;
	private String updatedate;
	private String secret;
	private String answer_num;
	private String answer_lev;
	private String answer_seq;
	
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getRno() {
		return rno;
	}
	public void setRno(String rno) {
		this.rno = rno;
	}
	public String getReplytext() {
		return replytext;
	}
	public void setReplytext(String replytext) {
		this.replytext = replytext;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public String getAnswer_num() {
		return answer_num;
	}
	public void setAnswer_num(String answer_num) {
		this.answer_num = answer_num;
	}
	public String getAnswer_lev() {
		return answer_lev;
	}
	public void setAnswer_lev(String answer_lev) {
		this.answer_lev = answer_lev;
	}
	public String getAnswer_seq() {
		return answer_seq;
	}
	public void setAnswer_seq(String answer_seq) {
		this.answer_seq = answer_seq;
	}
	@Override
	public String toString() {
		return "Useafter_reply_DTO [no=" + no + ", rno=" + rno + ", replytext=" + replytext + ", replyer=" + replyer
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
}
