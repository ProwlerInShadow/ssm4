package com.seven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seven.dao.IDeptDao;
import com.seven.entity.Dept;
import com.seven.service.IDeptService;

@Service("deptService")
public class DeptServiceImpl implements IDeptService{
	
	@Autowired
	private IDeptDao deptDao;
	
	public Dept selectOne(int id){
		return deptDao.selectOne(id);
	}
	
	public int insertOne(Dept dept){
		return deptDao.insertOne(dept);
	}
}
