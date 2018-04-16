package com.sadan.common.model;

public class SearchCriteria extends Criteria{

	private String searchType; // 검색의 항목 저장
	private String keyword; // 검색 데이터 저장
	private String location;
	private String business_type;
	
	private String content;
	private String subject;
	private String writer;

	public String getBusiness_type() {
		return business_type;
	}
	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	// 작성자로 검색하는 아닌지 알아 내는 getter
	public boolean isSubject() {
		if(searchType.indexOf("t")<0) return false; // 없는 경우
		else return true; // 있는 경우
	}
	
	public boolean isContent() {
		if(searchType.indexOf("c")<0) return false; // 없는 경우
		else return true; // 있는 경우
	}
	public boolean isWriter() {
		if(searchType.indexOf("w")<0) return false; // 없는 경우
		else return true; // 있는 경우
	}
	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + ", location=" + location
				+ ", business_type=" + business_type + ", content=" + content + ", subject=" + subject + ", writer="
				+ writer + "]";
	}

}
