package com.fdmgroup.mycarshop.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fdmgroup.mycarshop.models.Car;
import com.fdmgroup.mycarshop.repositories.CarRepository;


@Service
public class CarServiceImpl implements CarService {
	private CarRepository carRepository;

	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public Car addCar(Car newCar) {
		return this.carRepository.save(newCar);
	}

	@Override
	public void deleteACar(Long id) {
		this.carRepository.deleteById(id);
	}

	@Override
	public Car findCarByTitle(String title) {
		return this.carRepository.findByTitle(title);
	}

	@Override
	public Iterable<Car> getAllCars() {
		return this.carRepository.findAll();
	}

	@Override
	public Optional<Car> findById(Long id) {
		return this.carRepository.findById(id);
	}

	@Override
	public Iterable<Car> findCarsByTitle(String title) {
		return this.carRepository.findAllByTitle(title);
	}

}
