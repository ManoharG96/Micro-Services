package com.dxctechnology.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.dxctechnology.DAO.CapitalDao;
import com.dxctechnology.model.CapitalModel;

@Service
public class CapitalServiceImpl implements CapitalService {

	@Autowired
	private CapitalDao dao;

	@Autowired
	private Environment env;

	@Override
	public String addCapital(CapitalModel capital) {
		return dao.addCapital(capital);
	}

	@Override
	public CapitalModel getByZipcode(String zipcode) {
		CapitalModel model = dao.getByZipcode(zipcode);
		model.setPort(Integer.parseInt(env.getProperty("server.port")));
		return model;
	}

	@Override
	public List<CapitalModel> getCapitals() {
		List<CapitalModel> model = dao.getCapitals();
		for (CapitalModel capital : model) {
			capital.setPort(Integer.parseInt(env.getProperty("server.port")));
		}
		return model;
	}

	@Override
	public CapitalModel getByCountryCode(String code) {
		return dao.getByCountryCode(code);
	}

}
