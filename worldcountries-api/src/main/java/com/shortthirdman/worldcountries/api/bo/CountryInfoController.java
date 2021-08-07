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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author shortthirdman-org
 *
 */
@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*")
@Tag(name = "Country", description = "API endpoints related to country information details")
public class CountryInfoController {

	private final Logger LOGGER = LoggerFactory.getLogger(CountryInfoController.class);

	@Autowired
	private CountryInfoService service;
	
	@GetMapping("/all")
	@Operation(description = "List of all countries", method = "GET", operationId = "allCountries", tags = {"countries"})
	public ResponseEntity<ResponseTransfer> allCountries() {
		ResponseTransfer rt = null;
		List<CountryInfoDetail> list = new ArrayList<>();
		try {
			service.getAllCountries().forEach(list::add);
		} catch (Exception e) {
			LOGGER.warn("Exception caught: ", e);
			rt = new ResponseTransfer("error", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		rt = new ResponseTransfer("success", HttpStatus.OK.value(), Collections.singletonMap("countries", list));
		return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.OK);
	}
	
	@GetMapping("/name")
	@Operation(description = "Country by name", method = "GET", operationId = "countryByName", tags = {"countries"})
	public ResponseEntity<ResponseTransfer> countryByName(@Parameter(description = "Country name")
		@RequestParam(value = "name", required = true) String name) {
		ResponseTransfer rt = null;
		CountryInfoDetail country = new CountryInfoDetail();
		try {
			country = service.getCountryByName(name);
		} catch (Exception e) {
			LOGGER.warn("Exception caught: ", e);
			rt = new ResponseTransfer("error", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		rt = new ResponseTransfer("success", HttpStatus.OK.value(), Collections.singletonMap("country", country));
		return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.OK);
	}
	
	@GetMapping("/alpha2")
	@Operation(description = "Country by ISO 3166 Alpha-2 Code", method = "GET", operationId = "countryByAlpha2", tags = {"countries"})
	public ResponseEntity<ResponseTransfer> countryByAlpha2(@Parameter(description = "ISO 3166 Alpha-2 country code")
		@RequestParam(value = "code", required = true) String code) {
		ResponseTransfer rt = null;
		CountryInfoDetail country = new CountryInfoDetail();
		try {
			country = service.getCountryByAlpha2Code(code);
		} catch (Exception e) {
			LOGGER.warn("Exception caught: ", e);
			rt = new ResponseTransfer("error", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		rt = new ResponseTransfer("success", HttpStatus.OK.value(), Collections.singletonMap("country", country));
		return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.OK);
	}
	
	@GetMapping("/alpha3")
	@Operation(description = "Country by ISO 3166 Alpha-3 Code", method = "GET", operationId = "countryByAlpha3", tags = {"countries"})
	public ResponseEntity<ResponseTransfer> countryByAlpha3(@Parameter(description = "ISO 3166 Alpha-3 country code")
		@RequestParam(name = "code", required = true) String code) {
		ResponseTransfer rt = null;
		CountryInfoDetail country = new CountryInfoDetail();
		try {
			country = service.getCountryByAlpha3Code(code);
		} catch (Exception e) {
			LOGGER.warn("Exception caught: ", e);
			rt = new ResponseTransfer("error", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		rt = new ResponseTransfer("success", HttpStatus.OK.value(), Collections.singletonMap("country", country));
		return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.OK);
	}
	
	@GetMapping("/region")
	@Operation(description = "Countries by continental region", method = "GET", operationId = "countriesByContinent", tags = {"countries"})
	public ResponseEntity<ResponseTransfer> countriesByContinent(@Parameter(description = "Continental region")
		@RequestParam(value = "region", required = true) String region) {
		ResponseTransfer rt = null;
		List<CountryInfoDetail> list = new ArrayList<>();
		try {
			service.getCountriesByContinent(region).forEach(list::add);
		} catch (Exception e) {
			LOGGER.warn("Exception caught: ", e);
			rt = new ResponseTransfer("error", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		rt = new ResponseTransfer("success", HttpStatus.OK.value(), Collections.singletonMap("countries", list));
		return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.OK);
	}
	
	@GetMapping("/subregion")
	@Operation(description = "Countries by sub-continental region", method = "GET", operationId = "countriesBySubContinentRegion", tags = {"countries"})
	public ResponseEntity<ResponseTransfer> countriesBySubContinentRegion(@Parameter(description = "Continental subregion")
		@RequestParam(value = "subregion", required = true) String subregion) {
		ResponseTransfer rt = null;
		rt = new ResponseTransfer("success", HttpStatus.OK.value(), Collections.singletonMap("countries", null));
		return new ResponseEntity<ResponseTransfer>(rt, HttpStatus.OK);
	}
}
