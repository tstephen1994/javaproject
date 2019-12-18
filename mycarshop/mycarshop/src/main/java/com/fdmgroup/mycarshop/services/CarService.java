package com.fdmgroup.mycarshop.services;

import com.fdmgroup.mycarshop.models.Car;


import java.util.Optional;


public interface CarService {
	public Car addCar(Car newCar);

	public void deleteACar(Long id);

	public Car findCarByTitle(String title);

	public Iterable<Car> getAllCars();

	public Optional<Car> findById(Long id);
	
	public Iterable<Car> findCarsByTitle(String title);
	
}
