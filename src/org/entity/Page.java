package org.entity;

import java.util.List;

/**
 * @author 80664
 *
 * @param <T>
 */
public class Page<T> {
	
	private Integer pageIndex;  //索引
	
	private Integer totalPage;  //总页数
	
	private Integer count;      //数据总条数
	
	private Integer pageSize;   //每页显示的条数
	
	private List<T> list;       //数据的集合
	
	private String urlSort;     //通过url重写记住用户在浏览器的输入的额查询条件
	
	private Integer pageBegin;  //开始索引
	
	private Integer pageEnd;    //结束索引
	
	//特殊样式显示算法
    public void setPageBegin() {
		if(getTotalPage() < 10) {
		   pageBegin = 1;
		   pageEnd = getTotalPage();
		}else {
			pageBegin = pageIndex-5;
			pageEnd = pageIndex+4;
			//下标相减小于pageIndex时
			if(pageBegin < 1) {
				pageBegin = 1;
				pageEnd = 10;
			}
			//下标相加大于pageIndex时
			if(pageEnd > getTotalPage()) {
				//这里减9是因为总共要显示10个页码
				pageBegin = getTotalPage()-9;
				pageEnd = getTotalPage();
			}
		}
	}

	@Override
	public String toString() {
		return "Page [pageIndex=" + pageIndex + ", totalPage=" + totalPage + ", count=" + count + ", pageSize="
				+ pageSize + ", list=" + list + ", urlSort=" + urlSort + "]";
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getTotalPage() {
		return this.totalPage = count%pageSize==0?count/pageSize:count/pageSize+1;
	}

//	public void setTotalPage(Integer totalPage) {
//		this.totalPage = totalPage;
//	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public String getUrlSort() {
		return urlSort;
	}

	public void setUrlSort(String urlSort) {
		this.urlSort = urlSort;
	}

	public Page(Integer pageIndex, Integer totalPage, Integer count, Integer pageSize, List<T> list, String urlSort) {
		super();
		this.pageIndex = pageIndex;
		this.totalPage = totalPage;
		this.count = count;
		this.pageSize = pageSize;
		this.list = list;
		this.urlSort = urlSort;
	}

	public Page() {
		super();
	}	

}
 