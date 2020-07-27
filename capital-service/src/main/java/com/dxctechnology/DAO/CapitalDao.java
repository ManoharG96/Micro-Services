package com.dxctechnology.DAO;

import java.util.List;

import com.dxctechnology.model.CapitalModel;

public interface CapitalDao {
	
	String addCapital(CapitalModel capital);
	CapitalModel getByZipcode(String zipcode);
	List<CapitalModel> getCapitals();
	CapitalModel getByCountryCode(String code);

}
