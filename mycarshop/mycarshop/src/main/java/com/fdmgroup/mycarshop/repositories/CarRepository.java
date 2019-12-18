package com.fdmgroup.mycarshop.repositories;


import org.springframework.data.repository.CrudRepository;

import com.fdmgroup.mycarshop.models.Car;



public interface CarRepository extends CrudRepository<Car, Long>{
	public Car findByTitle(String title);
	
	public Iterable<Car> findAllByTitle(String title);
}

