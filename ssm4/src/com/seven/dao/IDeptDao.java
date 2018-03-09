package com.seven.dao;

import com.seven.entity.Dept;

public interface IDeptDao {
	
	public int insertOne(Dept dept);
	
	public Dept selectOne(int id);
}
