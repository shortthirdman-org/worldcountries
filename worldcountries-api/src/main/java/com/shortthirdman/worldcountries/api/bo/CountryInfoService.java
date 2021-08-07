/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shortthirdman.worldcountries.api.bo;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shortthirdman-org
 *
 */
@Service
public class CountryInfoService {

	private final Logger LOGGER = LoggerFactory.getLogger(CountryInfoService.class);

	private final String CURRENT_CLASSNAME = Thread.currentThread().getStackTrace()[1].getClassName();
	
	@Autowired
	private CountryInfoRepository repository;
	
	public CountryInfoDetail getCountryByName(String name) throws Exception {
		CountryInfo entity = repository.getCountryByName(name);
		return processor(entity);
	}
	
	public CountryInfoDetail getCountryByAlpha2Code(String code) throws Exception {
		CountryInfo entity = repository.getCountryByAlpha2(code);
		return processor(entity);
	}
	
	public CountryInfoDetail getCountryByAlpha3Code(String code) throws Exception {
		CountryInfo entity = repository.getCountryByAlpha3(code);
		return processor(entity);
	}
	
	public List<CountryInfoDetail> getCountriesByContinent(String region) throws Exception {
		Collection<CountryInfo> entities = repository.getCountryByContinent(region);
		return entities.stream().map(c -> processor(c)).collect(Collectors.toList());
	}
	
	public List<CountryInfoDetail> getAllCountries() throws Exception {
		Collection<CountryInfo> entities = repository.getAllCountries();
		return entities.stream().map(c -> processor(c)).collect(Collectors.toList());
	}
	
	private CountryInfoDetail processor(CountryInfo entity) {
		CountryInfoDetail bean = new CountryInfoDetail();
		if (entity != null) {
			bean.setShortName(entity.getShortName());
			bean.setFullName(entity.getFullName());
			bean.setAlpha2Code(entity.getAlpha2Code());
			bean.setAlpha3Code(entity.getAlpha3Code());
			bean.setNumericCode(entity.getNumericCode());
			bean.setCapitalCity(entity.getCapitalCity());
			bean.setIsIndependent(entity.getIndependentStatus());
			bean.setContinentRegion(entity.getContinentRegion());
			bean.setSubContinentalRegion(entity.getSubContinentalRegion());
			bean.setAdministrativeLangs(toList(entity.getAdministrativeLangs()));
			bean.setAreaSqKm(entity.getAreaSqKm());
			bean.setLargestCities(toList(entity.getLargestCities()));
			bean.setDemonym(entity.getDemonym());
			bean.setCurrencyName(entity.getCurrencyName());
			bean.setCurrenyCode(entity.getCurrenyCode());
			bean.setDrivingSide(entity.getDrivingSide());
		}
		return bean;
	}
	
	private List<String> toList(String source) {
		return Stream.of(source.split(",")).map(String::trim).collect(Collectors.toList());
	}
}
