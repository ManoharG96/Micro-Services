package com.dxctechnology.service;

import java.util.List;

import com.dxctechnology.model.CapitalModel;

public interface CapitalService {
	String addCapital(CapitalModel capital);
	CapitalModel getByZipcode(String zipCode);
	List<CapitalModel> getCapitals();
	CapitalModel getByCountryCode(String code);

}
