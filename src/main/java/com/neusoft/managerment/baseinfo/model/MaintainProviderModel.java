package com.neusoft.managerment.baseinfo.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 *    author : 张梓琪
 *    version: 1.0
 *    系统基础信息模块的维修单位Model
 */
@Alias("MaintainProvider")
@Data
public class MaintainProviderModel {
	private int providerno = 0;
	private String pname = null;
	private String pcontact = null;
	private String paddress = null;
	private String pmobile = null;
	private String tel = null;
	
}