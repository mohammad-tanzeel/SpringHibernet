package com.howtodoinjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.entity.CabEntity;

@Repository
public class CabDaoImpl implements CabDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCab(CabEntity cab) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(cab);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CabEntity> getAllCabs() {
		// TODO Auto-generated method stub
		//return this.sessionFactory.getCurrentSession().createQuery("from CabEntity").list();
		return this.sessionFactory.getCurrentSession().createQuery(" from CabEntity ").list();
	}

	@Override
	public void deleteCab(Integer cabId) {
		// TODO Auto-generated method stub
		CabEntity cab = (CabEntity) this.sessionFactory.getCurrentSession().load(CabEntity.class, cabId);
		if(cab!=null) {
			this.sessionFactory.getCurrentSession().delete(cab);
		}
	}

}
