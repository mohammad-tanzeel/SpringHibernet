package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.entity.CabEntity;

public interface CabManager {
	public void addCab(CabEntity cabentity);
	public List<CabEntity> getAllCabs();
	public void deleteCab(Integer cabId);
}
