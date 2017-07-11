package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.regvo;

@Repository
public class regdao {

	@Autowired
	SessionFactory sessionFactory;

	public void insert(regvo vo) {

		try {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(vo);
			System.out.println("done !!!!");
			tr.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	

}
