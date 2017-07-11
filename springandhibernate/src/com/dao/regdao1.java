 package com.dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.regvo;

@Repository
public class regdao1 {

	@Autowired
	SessionFactory sessionFactory;

	public List search(regvo c)
	{
		
		Session session = sessionFactory.openSession();
		Query q=session.createQuery("from regvo where fn='"+c.getFn()+"'");
	List ls=q.list();
	return ls;
	}
	
	public List update(regvo v)
	{
		
		Session session = sessionFactory.openSession();
		Query q=session.createQuery("from regvo where id='"+v.getId()+"'");
	List ls=q.list();
	return ls;
	}
	public void edit(regvo vo) {

		try {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(vo);
			System.out.println("done !!!!");
			tr.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	

}