package com.dxctechnology.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxctechnology.model.CapitalModel;
import com.dxctechnology.model.CountryModel;
import com.dxctechnology.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService service;


	@GetMapping("/countryname/{countryName}")
	public CountryModel getDetail(@PathVariable String countryName) {

		CountryModel countryModel = service.getCountryDetails(countryName);
		String countryCode = countryModel.getCountryCode();
		CapitalModel model = service.getCapitalDetails(countryCode);

		countryModel.setCapital(model);
		return countryModel;

	}

	@PutMapping("/add")
	public CountryModel addCountry(@RequestBody CountryModel model) {
		return service.addCountry(model);
	}

	@GetMapping("/country")
	public List<CountryModel> getAllCountryDetails(){
		List<CountryModel> countryList = service.getAllCountryDetails();
		List<CountryModel> list = new ArrayList<CountryModel>();
		for(CountryModel model : countryList) {
			String code = model.getCountryCode();
			CapitalModel capitalModel = service.getCapitalDetails(code);
			model.setCapital(capitalModel);
			list.add(model);
		}
		return list;
	}

	@GetMapping("/capitals")
	public List<CapitalModel> getAllCapitalDetails(){
		return service.getAllCapitals();
	}

}
