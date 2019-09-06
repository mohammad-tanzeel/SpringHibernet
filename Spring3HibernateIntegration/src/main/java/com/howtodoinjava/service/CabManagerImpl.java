package com.howtodoinjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.dao.CabDAO;
import com.howtodoinjava.entity.CabEntity;

@Service
public class CabManagerImpl implements CabManager {

	@Autowired
	private CabDAO cabDao;
	
	@Override
	@Transactional
	public void addCab(CabEntity cabentity) {
		// TODO Auto-generated method stub
		cabDao.addCab(cabentity);
	}

	@Override
	@Transactional
	public List<CabEntity> getAllCabs() {
		// TODO Auto-generated method stub
		return cabDao.getAllCabs();
	}

	@Override
	@Transactional
	public void deleteCab(Integer cabId) {
		// TODO Auto-generated method stub
		cabDao.deleteCab(cabId);
	}

}
