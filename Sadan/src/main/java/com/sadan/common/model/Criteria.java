package com.sadan.common.model;

public class Criteria {

	// 현재 페이지
	private int page;
	// 한페이지에 보여줄 데이터의 갯수
	private int perPageNum;

	// 기본 값을 셋팅하는 생성자
	public Criteria() {
		this.page = 1; // 1페이지
		this.perPageNum = 10; // 한페이지에 10개의 데이터를 표시한다.
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page < 1) this.page=1; // 최소 페이지가 1인데 1보다 작은 숫자가 들어오면 1로 한다.
		else this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		// 한 페이지에 보여 줄수 있는 데이터를 갯수가 최소 4개부터 최대 100개까지 보여 줄 수 있다.
		// 범위에 들어 있는 숫자가 아닌 경우는 기본 숫자=10로 셋팅해 준다.
		if(perPageNum<4 || perPageNum >100 ) this.perPageNum = 10;
		else this.perPageNum = perPageNum;
	}

	// 첫번째 데이터의 번호를 구하는 메서드 - startRow 라는 property
	public int getStartRow(){
		return (page-1) * perPageNum + 1;
	}
	// 마지막 데이터의 번호를 구하는 메서드- endRow 라는 property
	public int getEndRow() {
		return page * perPageNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}

}
