package com.microservice.ratings.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import  com.microservice.ratings.entity.Ratings;

@Repository
public class RatingDAO {

	@Autowired
	private EntityManager EntityManager;
	
	public void postRating(Ratings rating)
	{
		Session currentSession = EntityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(rating);
	}

	public List<Ratings> getRatings() {
		Session currentSession = EntityManager.unwrap(Session.class);
		Query<Ratings> qlist = currentSession.createQuery("From Ratings", Ratings.class);
		List<Ratings> list = qlist.getResultList();
		return list;
		
	}

	public Ratings getRating(int id) {
		Session currentSession = EntityManager.unwrap(Session.class);
		Ratings qid = currentSession.get(Ratings.class,id);
		return qid;
	}

	
}
