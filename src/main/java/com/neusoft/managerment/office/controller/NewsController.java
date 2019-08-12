package com.neusoft.managerment.office.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.managerment.message.ResultMessage;
import com.neusoft.managerment.office.model.NewsModel;
import com.neusoft.managerment.office.service.INewsService;

@RestController
@RequestMapping(value="/news")
public class NewsController {
	
	@Autowired
	INewsService newservice = null;
	//查询所有新闻
	@RequestMapping(value="/tolist")
	public List <NewsModel>tolist()  throws Exception{
		
		return newservice.getnewsbyall();
	}
	//选择新闻类型
	@RequestMapping(value="/tolistbytype")
	public List<NewsModel> tolistbytype(String newstype) throws Exception{
		
		return newservice.getnewsbytype(newstype);
		
		
	}
	//删除新闻
	@RequestMapping(value="/delete")
	public ResultMessage<NewsModel> delete(NewsModel newsmodel) throws Exception{
		
		 newservice.deletenews(newsmodel);
		 return new ResultMessage<NewsModel>("OK","删除新闻成功");		
	}
	
	//增添
	@RequestMapping(value="/add")
	public ResultMessage<NewsModel> add(NewsModel newsmodel) throws Exception{
		
		newservice.relesenews(newsmodel);
		return new ResultMessage<NewsModel>("OK","增加新闻成功");		
	}

}
