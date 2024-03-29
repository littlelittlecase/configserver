package com.neusoft.managerment.personnel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.managerment.message.ResultMessage;
import com.neusoft.managerment.personnel.model.DepartmentsModel;
import com.neusoft.managerment.personnel.service.IDepartmentsService;

/**
 *    author : 丘嘉茹
 *    version: 1.0
 *    人事管理信息模块的部门管理信息controller
 */
@RestController
@RequestMapping("departments")
public class DepartmentsController {
	@Autowired
	private IDepartmentsService departmentsService=null;
	//增加
	@PostMapping("/add")
	public ResultMessage<DepartmentsModel> add(DepartmentsModel departments) throws Exception {
		departmentsService.add(departments);
		return new ResultMessage<DepartmentsModel>("OK","增加部门信息成功");
	}
	//修改
	@PostMapping("/modify")
	public ResultMessage<DepartmentsModel> modify(DepartmentsModel departments) throws Exception {
		departmentsService.modify(departments);
		return new ResultMessage<DepartmentsModel>("OK","修改部门信息成功");
	}
	//删除
	@PostMapping("/delete")
	public ResultMessage<DepartmentsModel> delete(DepartmentsModel departments) throws Exception {
		departmentsService.delete(departments);
		return new ResultMessage<DepartmentsModel>("OK","删除部门信息成功");
	}
	//取得指定的
	@GetMapping("/get")
	public ResultMessage<DepartmentsModel> getDeptByNo(int deptno) throws Exception{
		ResultMessage<DepartmentsModel> result=new ResultMessage<DepartmentsModel>("OK","取得部门成功");
		result.setModel(departmentsService.getDeptByNo(deptno));
		return result;
	}
	//取得所有客户列表，有分页
	@GetMapping(value="/list/all/page")
	public ResultMessage<DepartmentsModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<DepartmentsModel> result=new ResultMessage<DepartmentsModel>("OK","取得部门表分页模式成功");
		result.setCount(departmentsService.getCountByAll());
		result.setPageCount(departmentsService.getPageCountByAll(rows));
		result.setList(departmentsService.getDeptListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		
		return result;
	}
	
	//取得所有客户列表，无分页
	@GetMapping(value="/list/all")
	public List<DepartmentsModel> getListByAll() throws Exception{
		return departmentsService.getDeptListByAll();
	}
	//检查此部门能否被删除
	@GetMapping(value="/checkDelete")
	public ResultMessage<DepartmentsModel> checkForDelete(int no) throws Exception{
		ResultMessage<DepartmentsModel> result=new ResultMessage<DepartmentsModel>("OK","此部门可以删除");
		if(!departmentsService.checkCanDelete(no)) {
			result.setStatus("NO");
			result.setMessage("此部门不能删除");
		}
		return result;
	}
}
