package com.dxctechnology.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxctechnology.dao.CountryDao;
import com.dxctechnology.model.CapitalModel;
import com.dxctechnology.model.CountryModel;
import com.dxctechnology.proxy.CountryServiceProxy;

@Service
public class CountryService {
		
	@Autowired
	private CountryDao dao;
	
	@Autowired
	private CountryServiceProxy proxy;
	
	public CapitalModel getCapitalDetails(String code) {
		return proxy.getCapitalDetails(code);	
	}
	
	public List<CapitalModel> getAllCapitals(){
		return proxy.getAllCapitalDetails();
	}
	
	public CountryModel getCountryDetails(String name) {
		return dao.getCountryDetails(name);
	}
	
	public CountryModel addCountry(CountryModel model) {
		return dao.addCountry(model);
	}
	
	public List<CountryModel> getAllCountryDetails(){
		return dao.getAllCountryDetails();
	}

}
