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

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author shortthirdman-org
 *
 */
@Repository
@SuppressWarnings("unchecked")
public class CountryInfoRepository {

	private final Logger LOGGER = LoggerFactory.getLogger(CountryInfoRepository.class);

	@Autowired
	private EntityManager em;

	public CountryInfo getCountryByName(String name) throws Exception {
		LOGGER.info("CountryInfoRepository::getCountryByName Started");
		Query q = em.createNativeQuery("SELECT * FROM world_countries WHERE short_name = ?1", CountryInfo.class).setParameter(1, name);
		CountryInfo entity = (CountryInfo) q.getSingleResult();
		LOGGER.info("CountryInfoRepository::getCountryByName Completed");
		return entity;
	}
	
	public CountryInfo getCountryByAlpha2(String code) throws Exception {
		LOGGER.info("CountryInfoRepository::getCountryByAlpha2 Started");
		Query q = em.createNativeQuery("SELECT * FROM world_countries WHERE alpha2_code = ?1", CountryInfo.class).setParameter(1, code);
		CountryInfo entity = (CountryInfo) q.getSingleResult();
		LOGGER.info("CountryInfoRepository::getCountryByAlpha2 Completed");
		return entity;
	}
	
	public CountryInfo getCountryByAlpha3(String code) throws Exception {
		LOGGER.info("CountryInfoRepository::getCountryByAlpha3 Started");
		Query q = em.createNativeQuery("SELECT * FROM world_countries WHERE alpha3_code = ?1", CountryInfo.class).setParameter(1, code);
		CountryInfo entity = (CountryInfo) q.getSingleResult();
		LOGGER.info("CountryInfoRepository::getCountryByAlpha3 Completed");
		return entity;
	}
	
	public Collection<CountryInfo> getCountryByContinent(String region) throws Exception {
		LOGGER.info("CountryInfoRepository::getCountryByContinent Started");
		Query q = em.createNativeQuery("SELECT * FROM world_countries WHERE continent_region = ?1 ORDER BY short_name", CountryInfo.class).setParameter(1, region);
		Collection<CountryInfo> entities = q.getResultList();
		LOGGER.info("CountryInfoRepository::getCountryByContinent Completed");
		return entities;
	}
	
	public Collection<CountryInfo> getAllCountries() throws Exception {
		LOGGER.info("CountryInfoRepository::getAllCountries Started");
		Query q = em.createNativeQuery("SELECT * FROM world_countries ORDER BY short_name", CountryInfo.class);
		Collection<CountryInfo> entities = q.getResultList();
		LOGGER.info("CountryInfoRepository::getAllCountries Completed");
		return entities;
	}
}
