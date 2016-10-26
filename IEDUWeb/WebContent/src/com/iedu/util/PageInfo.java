package com.iedu.util;

/*
 * 	이 클래스는 페이지 나눔 기능을 하기 위해서 
 * 	필요한 정보를 계산하기 위한 클래스이다.
 */
public class PageInfo {
	// 정보를 기억할 변수
	// 1. 현재 봐야하는 페이지를 기억할 변수
	private int nowPage;
	// 2. 총 데이터의 갯수를 기억할 변수
	private int totalList;
	// ==> 위의 두가지는 컨트롤러가 알 수 있는 정보이다.(컨트롤러가 알려줄 예정)
	
	
	// 3. 한 페이지에 몇개의 데이터를 출력할지를 기억할 변수
	private int pageList;
	// 4. 한 화면에 페이지 이동 숫자를 몇개까지 표시할지를 기억할 변수
	private int pageGroup;
	// ==> 위의 두가지는 개발자가 결정해야할 문제이다.
	
	
	// 5. 페이지 이동 기능을 표시할 때 몇 페이지부터 시작할지를 기억할 변수
	private int startPage;
	// 6. 페이지 이동 기능을 표시할 때 마자막 페이지를 기억할 변수
	private int endPage;
	// 7. 데이터가 총 몇페이지 나오는지를 기억할 변수
	private int totalPage;
	// ==> 계산에 의해서 만들어야 하는 정보
	
	public PageInfo(int nowPage, int totalList) {
		this(nowPage, totalList, 5, 5);
	}
	public PageInfo(int nowPage, int totalList, int pageList, int pageGroup) {
		this.nowPage = nowPage;
		this.totalList = totalList;
		this.pageList = pageList;
		this.pageGroup = pageGroup;
		//	기본 데이터는 기억했으므로 필요한 데이터를 계산하도록 하자.
		calcTotalPage();
		clacStartPage();
		calcEndPage();
	}
	public void calcTotalPage() {
		// 총 몇페이지에 걸쳐서 나와야 할지는
		// 총 데이터개수 / 한페이지에 보여줄 데이터 개수
		// 문제 나누어 떨어지는 문제가 안되지만
		//      떨어지지 않으면 1페이지를 더해야 한다.
		if(totalList % pageList == 0){
			totalPage = totalList / pageList;
		}
		else {
			totalPage = (totalList / pageList) + 1;
		}
	}
	public void clacStartPage() {
		// 현재 보고싶은 페이지가 어떤 그룹에 있는지를 판단해야 한다.
		/*
		 * [1][2][3]	1그룹		
		 * [4][5][6]	2그룹	
		 * [7][8][9]	3그룹	
		 * [10][11][12] 4그룹	
		 * ((nowPage - 1) / pageGroup) + 1 
		 * 		1	(0 / 3) 0	1              			
		 * 		2	(1 / 3) 0   1           			
		 * 		3	(2 / 3) 0   1           			
		 *      4	(3 / 3) 1   2
		 * 		5	(4 / 3) 1  	2		
		 *	    6	(5 / 3) 1	2
		 *		12	(11 / 3) 3	 4   
		 */
		int tempGroup = ((nowPage - 1) / pageGroup) + 1;
			//	각각의 그룹의 시작 페이지를 알아내면 된다.
			//	1		1		(tempGroup - 1) * pageGroup + 1;
			//	2		4		(1 - 1) * 3 + 1;		1
			//	3		7		(2 - 1) * 3 + 1;		4
			//					(3 - 1) * 3 + 1;		7
			startPage = (tempGroup - 1) * pageGroup + 1;
	}           			
	public void calcEndPage() {
		// 시작페이지가 구해졌으므로 거기에서 + pageGroup - 1을 하면된다.
		endPage = startPage + pageGroup - 1;
		// 만약 마지막페이지가 총페이지 보다 많으면 마지막 페이지를 조정해야 한다.
		if(endPage > totalPage) {
			endPage = totalPage;
		}
	}
	
	// 이변수값을 JSTL에서 사용할 수 있도록 get함수를 만들어 놓는다.
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalList() {
		return totalList;
	}
	public void setTotalList(int totalList) {
		this.totalList = totalList;
	}
	public int getPageList() {
		return pageList;
	}
	public void setPageList(int pageList) {
		this.pageList = pageList;
	}
	public int getPageGroup() {
		return pageGroup;
	}
	public void setPageGroup(int pageGroup) {
		this.pageGroup = pageGroup;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
}
