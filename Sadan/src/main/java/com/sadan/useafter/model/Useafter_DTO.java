package com.sadan.useafter.model;

import java.util.List;
import java.util.Map;

public class Useafter_DTO {
	private String no;
	private String content;
	private String subject;
	private String writer;
	private String location;
	private String recommand;
	private String dates;
	private String business_nm;
	private String business_type;
	private String hit;
	private String secret;
	private String answer_num;
	private String answer_lev;
	private String answer_seq;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRecommand() {
		return recommand;
	}
	public void setRecommand(String recommand) {
		this.recommand = recommand;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getBusiness_nm() {
		return business_nm;
	}
	public void setBusiness_nm(String business_nm) {
		this.business_nm = business_nm;
	}
	public String getBusiness_type() {
		return business_type;
	}
	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
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
		return "Useafter_DTO [no=" + no + ", content=" + content + ", subject=" + subject + ", writer=" + writer
				+ ", location=" + location + ", recommand=" + recommand + ", dates=" + dates + ", business_nm="
				+ business_nm + ", business_type=" + business_type + ", hit=" + hit + ", secret=" + secret + "]";
	}
	
}
