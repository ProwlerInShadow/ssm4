package com.seven.service;

import com.seven.entity.Dept;

public interface IDeptService {
	public Dept selectOne(int id);
	
	public int insertOne(Dept dept);
}
