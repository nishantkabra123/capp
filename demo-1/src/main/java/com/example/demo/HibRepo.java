package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibRepo {

	@Autowired
	private EntityManager entityManager;

	public List<UserInfo> getAllUsers() {		

		Session session = entityManager.unwrap(Session.class);
		Query<UserInfo> query = session.createQuery("from UserInfo",UserInfo.class);
		List<UserInfo>  users=query.getResultList();
		return users;
	}
	
	public String save(UserInfo user,UserInfo user1) {
		Session session = entityManager.unwrap(Session.class);
		session.save(user);
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();
		//session.close();
		return "saved user details";
	
	}
	public String save(Car car) {
		Session session = entityManager.unwrap(Session.class);
		//session.beginTransaction();
		session.save(car);
		//session.getTransaction().commit();
		session.close();
		return "saved car details";
	
	}

}
