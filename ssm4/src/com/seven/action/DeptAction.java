package com.seven.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seven.entity.Dept;
import com.seven.service.IDeptService;
import com.seven.service.impl.DeptServiceImpl;

@Controller
@RequestMapping(value="/dept")
public class DeptAction {
	
	@Autowired
	private IDeptService deptService;
	
	@RequestMapping(value="/add")
	public String add(Dept dept){
		int i = deptService.insertOne(dept);
		System.out.println("影响了" + i + "行");
		return "forward:/jsp/target01.jsp";
	}
	
	@RequestMapping(value="/select")
	public String selectOne(){
		Dept dept = deptService.selectOne(1);
		System.out.println(dept);
		return "forward:/jsp/target01.jsp";
	}
	
	@RequestMapping(value="/test")
	public String test(String name,String email){
		System.out.println("测试成功" + name + email);
		return "forward:/jsp/target01.jsp";
	}
}
