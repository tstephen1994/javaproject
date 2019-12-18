package com.fdmgroup.mycarshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.mycarshop.models.Car;
import com.fdmgroup.mycarshop.services.CarService;

@Controller
public class CarController {
	private CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String register(@RequestParam String title, @RequestParam String year, @RequestParam double price,
			ModelMap map) {
		Car newCar = new Car(title, year, price);
		this.carService.addCar(newCar);
		Iterable<Car> result = this.carService.getAllCars();
		map.addAttribute("cars", result);
		return "all-cars";
	}

	@GetMapping("/all-cars")
	public String getAllCars(ModelMap map) {
		Iterable<Car> result = this.carService.getAllCars();
		map.addAttribute("cars", result);
		return "all-cars";
	}

	@GetMapping("/delete")
	public String deleteCar(@RequestParam Long id, ModelMap map) {
		this.carService.deleteACar(id);
		Iterable<Car> result = this.carService.getAllCars();
		map.addAttribute("cars", result);
		return "all-cars";
	}

	@GetMapping("/edit")
	public String updateCar(@RequestParam Long id, ModelMap map) {
		Car car = this.carService.findById(id).get();
		map.addAttribute("car", car);
		return "edit-car";
	}

	@PostMapping("/edit")
	public String updateCar(@RequestParam Long id, @RequestParam String title,
			@RequestParam String year, @RequestParam double price, ModelMap map) {
		Car car = new Car(title,year,price);
		car.setId(id);
		this.carService.addCar(car);
		Iterable<Car> cars = this.carService.getAllCars();
		map.addAttribute("cars", cars);
		return "all-cars";
	}

	@GetMapping("/search")
	public String searchCar(@RequestParam String title, ModelMap map) {
		Iterable<Car> cars = this.carService.findCarsByTitle(title);
		map.addAttribute("cars",cars);
		return "search";
	}
	
}