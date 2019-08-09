package com.neusoft.managerment.office.service;

import java.util.List;

import com.neusoft.managerment.office.model.NewsModel;

/*
 * 2019.8.9
   *      张梓琪
 * 新闻的业务接口
 * */
public interface INewsService {
	//发布新闻
	public void relesenews(NewsModel newsmodel) throws Exception;
	//删除新闻
	public void deletenews(NewsModel newsmodel) throws Exception;
	//修改新闻
	public void modifynews(NewsModel newsmodel) throws Exception;
	//查询新闻
	public List<NewsModel> searchnewsbyall() throws Exception;
	public NewsModel searchnewsbytype()throws Exception;
	 

}