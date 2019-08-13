package com.neusoft.managerment.communityinfo.service;

import java.util.List;

import com.neusoft.managerment.communityinfo.model.CommunityActiveModel;

/*
  * 社区业务层接口 
 * @Author: 张梓琪
 */
public interface ICommunityService {
	
	//增加
	public void add(CommunityActiveModel com) throws Exception;
	//修改
	public void modify(CommunityActiveModel com) throws Exception;
	//删除
	public void delete(CommunityActiveModel com) throws Exception;
	//取得活动同类型的对象
	public List<CommunityActiveModel> getListByType(String type)throws Exception;
	//取得所有活动列表 
	public List<CommunityActiveModel> getListByAll() throws Exception;
	

}
