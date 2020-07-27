package com.dxctechnology.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dxctechnology.model.CapitalModel;

@FeignClient (name = "capital-service")
@RibbonClient (name = "capital-service")
public interface CountryServiceProxy {
	
	@GetMapping("/capital-service/code/{code}")
	public CapitalModel getCapitalDetails(@PathVariable String code);
	
	@GetMapping("/capital-service/all")
	public List<CapitalModel> getAllCapitalDetails();

}
