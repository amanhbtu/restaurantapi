package com.ethical.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ethical.ms.repository.RestaurantRepository;

import com.ethical.ms.model.Restaurant;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository repository;
	
	// Creating single Restaurant
	public Restaurant saveRestaurant(Restaurant restaurant) {
		return repository.save(restaurant);
	}
	
	// Creating Multiple Restaurants
	public List<Restaurant> saveAllRestaurants(List<Restaurant> restaurants) {
		return repository.saveAll(restaurants);
	}
	
	// Getting all Restaurant's details
	public List<Restaurant> getRestaurants(){
		return repository.findAll();
	}
	
	//Getting Restaurant by Restaurant ID
	public Restaurant getRestaurantById(int id){
		return repository.findById(id);
	}
	
	//Getting Restaurant by Player Name
	public Restaurant getRestaurantByName(String name){
		return repository.findByName(name);
	}
	
	//Deleting Player by Player ID
	public String deleteRestaurant(int id) {
		repository.deleteById(id);
		return "Restaurant Id : "+id+" is Removed";
	}
	
	
	//Updating existing Restaurant's Details
	public Restaurant updateRestaurant(Restaurant restaurant) {
		 
		 Restaurant existingPlayer=repository.findById(restaurant.getId());
		 
		 existingPlayer.setName(restaurant.getName());
		 existingPlayer.setCountry(restaurant.getCountry());
		 
		 return repository.save(existingPlayer);
	}
}
