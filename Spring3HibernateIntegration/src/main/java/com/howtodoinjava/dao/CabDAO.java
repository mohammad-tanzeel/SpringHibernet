package com.howtodoinjava.dao;

import java.util.List;

import com.howtodoinjava.entity.CabEntity;

public interface CabDAO {
	public void addCab(CabEntity cabentity);
	public List<CabEntity> getAllCabs();
	public void deleteCab(Integer cabId);
}
