package com.neusoft.managerment.baseinfo.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 *    author : 张梓琪
 *    version: 1.0
 *    系统基础信息模块的服务类型Model
 */
@Alias("servicetype")
@Data
public class ServiceTypeModel {

	private int typeno = 0;
	private String type = null;
}
