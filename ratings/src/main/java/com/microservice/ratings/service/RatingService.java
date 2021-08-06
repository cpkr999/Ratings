package com.microservice.ratings.service;

import org.springframework.stereotype.Service;

import com.microservice.ratings.dao.RatingDAO;
import com.microservice.ratings.entity.Ratings;

import java.util.*;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RatingService {

	@Autowired
	private RatingDAO RatingDAO;
	
	@Transactional
	public void postRating(Ratings rating)
	{
		RatingDAO.postRating(rating);
	}
	@Transactional
	public List<Ratings> getRatings() {
		
		return RatingDAO.getRatings();
		
	}
	@Transactional
	public Ratings getRating(int id) {
		
		return RatingDAO.getRating(id);
	}

}
