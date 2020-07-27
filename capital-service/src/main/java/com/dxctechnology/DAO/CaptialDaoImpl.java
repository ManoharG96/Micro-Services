package com.dxctechnology.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctechnology.model.CapitalModel;
import com.dxctechnology.repository.CapitalRepository;

@Component
public class CaptialDaoImpl implements CapitalDao {
	
	@Autowired
	private CapitalRepository repo;

	@Override
	public String addCapital(CapitalModel capital) {
		 repo.save(capital);
		 return "Added Successfully";	
	}

	@Override
	public CapitalModel getByZipcode(String zipcode) {
		return repo.findByZipcode(zipcode);
	}

	@Override
	public List<CapitalModel> getCapitals() {
		return repo.findAll();
	}

	@Override
	public CapitalModel getByCountryCode(String code) {
		return repo.findByCountryCode(code);
	}

}
