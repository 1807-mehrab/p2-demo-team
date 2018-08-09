package com.revature.review.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.revature.review.beans.Cave;
import com.revature.review.util.HibernateUtil;

public class CaveDao {
	public List<Cave> getAllCaves() {
		List<Cave> caves = new ArrayList<>();
		Session s = HibernateUtil.getSession();
		caves = s.createQuery("from Cave").list();
		return caves;
	}
	
	public int saveCave(Cave c) {
		Session s = HibernateUtil.getSession();
		s.beginTransaction();
		int result = (int) s.save(c);
		s.getTransaction().commit();
		return result;
	}
}
