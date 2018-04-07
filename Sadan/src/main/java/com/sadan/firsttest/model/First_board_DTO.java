package com.sadan.firsttest.model;

public class First_board_DTO {
	
	private String no;
	private String subject;
	private String content;
	private String writer;
	private String date;
	private String secret;
	private String category;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "First_board_DTO [no=" + no + ", subject=" + subject + ", content=" + content + ", writer=" + writer
				+ ", date=" + date + ", secret=" + secret + ", category=" + category + "]";
	}
}
