package com.microservice.ratings.controller;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.ratings.entity.Ratings;
import com.microservice.ratings.service.RatingService;

@RestController
public class RatingMap {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/postRating")
	public void postRating(@RequestBody Ratings rating)
	{
		ratingService.postRating(rating);
	}
	
	@GetMapping("/getRatings")
	public List<Ratings> getRatings()
	{
		return ratingService.getRatings();
	}
	
	@GetMapping("/getRatings/{id}")
	public Ratings getRating(@PathVariable int id)
	{
		return ratingService.getRating(id);
	}

}
