package com.neusoft.managerment.baseinfo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.managerment.baseinfo.model.RoomModel;
/**
 *    模块：基础信息   表：房间 Room
 *    author : 陈思颖
 *    version: 1.0
 */
public interface IRoomService {
	//增加
	public void add(RoomModel room) throws Exception;
	//修改
	public void modify(RoomModel room) throws Exception;
	//删除
	public void delete(RoomModel room) throws Exception;
	//取得所有房间列表
	public List<RoomModel> getListByAll() throws Exception;
	
	public List<RoomModel> getListByAllWithFK() throws Exception;
	
	//取得房间单个对象，
	public RoomModel getByRoomNo(int roomno) throws Exception;
	//取得所有房间列表,分页模式
	public List<RoomModel> getListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得房间的个数
	public int getCountByAll() throws Exception;
	//取得房间页数
	public int getPageCountByAll(int rows) throws Exception;
	//取得所有房间列表,关联AreaNo
	public List<RoomModel> getListByAllWithAreaNo() throws Exception;
	//取得所有房间列表,关联BuildingTypeNo
	public List<RoomModel> getListByAllWithBuildingTypeNo() throws Exception;
	//取得所有房间列表,关联HouseTypeNo
	public List<RoomModel> getListByAllWithHouseTypeNo() throws Exception;
	//取得所有房间列表,关联BuildingNo
	public List<RoomModel> getListByAllWithBuildingNo() throws Exception;
	//取得所有房间列表,关联TypeNo和BuildingNo
	//public List<RoomModel> getListByAllWithTypeNoAndBuildingNo() throws Exception;
	//根据类型编号取得此户型的房间
	public RoomModel getListByHouseTypeNo(int housetypeno) throws Exception;
	//根据楼宇序号取得此序号的房间
	public RoomModel getListByBuildingNo(int buildingno) throws Exception;

}
