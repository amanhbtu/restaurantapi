package com.ethical.ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ethical.ms.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
	
	Restaurant findByName(String name);
	
	Restaurant findById(int id);
}
