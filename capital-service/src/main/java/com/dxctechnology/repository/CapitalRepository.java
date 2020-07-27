package com.dxctechnology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxctechnology.model.CapitalModel;

@Repository
public interface CapitalRepository extends JpaRepository<CapitalModel, Integer> {

	CapitalModel findByZipcode(String zipCode);
	CapitalModel findByCountryCode(String code);
}
