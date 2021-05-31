package com.ethical.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import com.ethical.ms.service.RestaurantService;

import com.ethical.ms.model.Restaurant;


@RestController
@RequestMapping("api/restaurant")
@Api(value="Restaurant Service", description="Restaurant's Micro Services")
public class RestaurantController {
	
	@Autowired
	private RestaurantService service;
	
	//adding single restaurant's detail
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return service.saveRestaurant(restaurant);
	}
	
	//adding multiple restaurant's details
	@PostMapping("/all")
	public List<Restaurant> addRestaurants(@RequestBody List<Restaurant> restaurants){
		return service.saveAllRestaurants(restaurants);
	}
	
	//getting all restaurant's detail
	@GetMapping("/all")
	public List<Restaurant> getAllRestaurants(){
		return service.getRestaurants();
	}
	
	//getting single restaurant's detail based on ID
	@GetMapping("/{id}")
	public Restaurant getRestaurantByID(@PathVariable int id){
		return service.getRestaurantById(id);
	}
	
	//getting single restaurant's detail based on Name
	@GetMapping("/name/{name}")
	public Restaurant getRestaurantByID(@PathVariable String name){
		return service.getRestaurantByName(name);
	}
	
	
	//Deleting single restaurant's detail based on ID
	@DeleteMapping("/{id}")
	public String deleteRestaurant(@PathVariable int id){
		return service.deleteRestaurant(id);
	}
	
	
	//Updating single restaurant's detail based on ID
	@PutMapping("/update")
	public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
		return service.updateRestaurant(restaurant);
	}
}
