package com.neusoft.managerment.personnel.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.managerment.personnel.model.EmployeesModel;



/**
 *    author : 丘嘉茹
 *    version: 1.0
 *    人事管理信息模块的员工档案管理信息
 */
public interface IEmployeesService {
	//增加
	public void add(EmployeesModel employees) throws Exception;
	//修改
	public void modify(EmployeesModel employees) throws Exception;
	//删除
	public void delete(EmployeesModel employees) throws Exception;
	//查询部门信息
	public List<EmployeesModel> getEmpListByAll() throws Exception;
	//分页
	public List<EmployeesModel> getEmpListByAllWithPage(int rows,int pages) throws Exception;
	//返回指定员工信息
	public EmployeesModel getEmpByID(int id) throws Exception;
	//检索
	public List<EmployeesModel> getListByConditionWithDepartments(int departmentNo,String sex,Date startJoinDate,Date endJoinDate, int rows,int page) throws Exception;
	//根据综合检索条件取得员工个数
	public int getCountByConditionWithDepartments(int departmentNo,String sex,Date startJoinDate,Date endJoinDate) throws Exception;
	//根据综合检索条件取得员工显示的页数
	public int getPageCountByConditionWithDepartments(int departmentNo,String sex,Date startJoinDate,Date endJoinDate,int rows) throws Exception;

}
