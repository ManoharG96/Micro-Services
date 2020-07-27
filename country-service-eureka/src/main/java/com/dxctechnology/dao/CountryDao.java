package com.dxctechnology.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctechnology.model.CountryModel;
import com.dxctechnology.repository.CountryRepository;

@Component
public class CountryDao {
	
	@Autowired
	private CountryRepository repo;
	
	public CountryModel addCountry(CountryModel model) {
		return repo.save(model);
	}
	
	public CountryModel getCountryDetails(String name) {
		return repo.findByCountryName(name);
	}
	
	public List<CountryModel> getAllCountryDetails(){
		return repo.findAll();
	}

}
