package com.neusoft.managerment.personnel.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 *    author : 丘嘉茹
 *    version: 1.0
 *    人事管理信息模块的员工档案管理信息Model
 */
@Alias("Employees")
@Data
public class EmployeesModel implements Serializable {

	private String empid = null;
	private DepartmentsModel deptno = null;
	private String empname = null;
	private String sex = null;
	private int age = 0;
	private Date joindate = null;
	private String job = null;
	private String mobile = null;
	private String tel = null;
	private String qq = null;
	private String weixin = null;
}