package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Models.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
	
	@Query(value = "select * from Car where owners = :a",nativeQuery = true)
	public List<Car> carqown(@Param ("a") int owner);
	@Query(value = "select * from Car where address = :a",nativeQuery = true)
	public List<Car> carqadd(@Param ("a") String add);
	@Query(value = "select * from Car where car_name = :a",nativeQuery = true)
	public List<Car> carqcar(@Param ("a") String car);
	@Query(value = "select * from Car where owners = :a and car_type = :b",nativeQuery = true)
	public List<Car> carqq(@Param ("a") int owner,@Param ("b") String cartype);
}
