package com.kittypet.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kittypet.demo.model.PetFood;

@Repository
public interface PetFoodRepository  extends MongoRepository <PetFood,String>{
	
	List<PetFood> findByAnimalType(String animalType);
}
