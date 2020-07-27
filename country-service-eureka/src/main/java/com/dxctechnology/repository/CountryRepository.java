package com.dxctechnology.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxctechnology.model.CountryModel;

public interface CountryRepository extends MongoRepository<CountryModel, Integer> {
	
	CountryModel findByCountryName(String countryName);

}
