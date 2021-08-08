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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author shortthirdman-org
 *
 */
@Entity
public class CountryInfo {

	@Id
	@Column(name = "short_name")
	private String shortName;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "alpha2_code")
	private String alpha2Code;

	@Column(name = "alpha3_code")
	private String alpha3Code;

	@Column(name = "numeric_code")
	private String numericCode;

	@Column(name = "capital_city")
	private String capitalCity;

	@Column(name = "independent_status")
	private String independentStatus;

	@Column(name = "continental_region")
	private String continentRegion;

	@Column(name = "subcontinental_region")
	private String subContinentalRegion;

	@Column(name = "administrative_languages")
	private String administrativeLangs;

	@Column(name = "area_sqkm")
	private Integer areaSqKm;

	@Column(name = "largest_cities")
	private String largestCities;

	@Column(name = "demonym_name")
	private String demonym;

	@Column(name = "currency_name")
	private String currencyName;

	@Column(name = "currency_code")
	private String currenyCode;

	@Column(name = "driving_side")
	private String drivingSide;

	@Column(name = "time_zones")
	private String timeZones;

	@Column(name = "calling_codes")
	private String callingCodes;

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the alpha2Code
	 */
	public String getAlpha2Code() {
		return alpha2Code;
	}

	/**
	 * @param alpha2Code the alpha2Code to set
	 */
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	/**
	 * @return the alpha3Code
	 */
	public String getAlpha3Code() {
		return alpha3Code;
	}

	/**
	 * @param alpha3Code the alpha3Code to set
	 */
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	/**
	 * @return the numericCode
	 */
	public String getNumericCode() {
		return numericCode;
	}

	/**
	 * @param numericCode the numericCode to set
	 */
	public void setNumericCode(String numericCode) {
		this.numericCode = numericCode;
	}

	/**
	 * @return the capitalCity
	 */
	public String getCapitalCity() {
		return capitalCity;
	}

	/**
	 * @param capitalCity the capitalCity to set
	 */
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	/**
	 * @return the independentStatus
	 */
	public String getIndependentStatus() {
		return independentStatus;
	}

	/**
	 * @param independentStatus the independentStatus to set
	 */
	public void setIndependentStatus(String independentStatus) {
		this.independentStatus = independentStatus;
	}

	/**
	 * @return the continentRegion
	 */
	public String getContinentRegion() {
		return continentRegion;
	}

	/**
	 * @param continentRegion the continentRegion to set
	 */
	public void setContinentRegion(String continentRegion) {
		this.continentRegion = continentRegion;
	}

	/**
	 * @return the subContinentalRegion
	 */
	public String getSubContinentalRegion() {
		return subContinentalRegion;
	}

	/**
	 * @param subContinentalRegion the subContinentalRegion to set
	 */
	public void setSubContinentalRegion(String subContinentalRegion) {
		this.subContinentalRegion = subContinentalRegion;
	}

	/**
	 * @return the administrativeLangs
	 */
	public String getAdministrativeLangs() {
		return administrativeLangs;
	}

	/**
	 * @param administrativeLangs the administrativeLangs to set
	 */
	public void setAdministrativeLangs(String administrativeLangs) {
		this.administrativeLangs = administrativeLangs;
	}

	/**
	 * @return the areaSqKm
	 */
	public Integer getAreaSqKm() {
		return areaSqKm;
	}

	/**
	 * @param areaSqKm the areaSqKm to set
	 */
	public void setAreaSqKm(Integer areaSqKm) {
		this.areaSqKm = areaSqKm;
	}

	/**
	 * @return the largestCities
	 */
	public String getLargestCities() {
		return largestCities;
	}

	/**
	 * @param largestCities the largestCities to set
	 */
	public void setLargestCities(String largestCities) {
		this.largestCities = largestCities;
	}

	/**
	 * @return the demonym
	 */
	public String getDemonym() {
		return demonym;
	}

	/**
	 * @param demonym the demonym to set
	 */
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}

	/**
	 * @return the currencyName
	 */
	public String getCurrencyName() {
		return currencyName;
	}

	/**
	 * @param currencyName the currencyName to set
	 */
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	/**
	 * @return the currenyCode
	 */
	public String getCurrenyCode() {
		return currenyCode;
	}

	/**
	 * @param currenyCode the currenyCode to set
	 */
	public void setCurrenyCode(String currenyCode) {
		this.currenyCode = currenyCode;
	}

	/**
	 * @return the drivingSide
	 */
	public String getDrivingSide() {
		return drivingSide;
	}

	/**
	 * @param drivingSide the drivingSide to set
	 */
	public void setDrivingSide(String drivingSide) {
		this.drivingSide = drivingSide;
	}

	/**
	 * @return the timeZones
	 */
	public String getTimeZones() {
		return timeZones;
	}

	/**
	 * @param timeZones the timeZones to set
	 */
	public void setTimeZones(String timeZones) {
		this.timeZones = timeZones;
	}

	/**
	 * @return the callingCodes
	 */
	public String getCallingCodes() {
		return callingCodes;
	}

	/**
	 * @param callingCodes the callingCodes to set
	 */
	public void setCallingCodes(String callingCodes) {
		this.callingCodes = callingCodes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryInfo [shortName=");
		builder.append(shortName);
		builder.append(", fullName=");
		builder.append(fullName);
		builder.append(", alpha2Code=");
		builder.append(alpha2Code);
		builder.append(", alpha3Code=");
		builder.append(alpha3Code);
		builder.append(", numericCode=");
		builder.append(numericCode);
		builder.append(", capitalCity=");
		builder.append(capitalCity);
		builder.append(", independentStatus=");
		builder.append(independentStatus);
		builder.append(", continentRegion=");
		builder.append(continentRegion);
		builder.append(", subContinentalRegion=");
		builder.append(subContinentalRegion);
		builder.append(", administrativeLangs=");
		builder.append(administrativeLangs);
		builder.append(", areaSqKm=");
		builder.append(areaSqKm);
		builder.append(", largestCities=");
		builder.append(largestCities);
		builder.append(", demonym=");
		builder.append(demonym);
		builder.append(", currencyName=");
		builder.append(currencyName);
		builder.append(", currenyCode=");
		builder.append(currenyCode);
		builder.append(", drivingSide=");
		builder.append(drivingSide);
		builder.append(", timeZones=");
		builder.append(timeZones);
		builder.append(", callingCodes=");
		builder.append(callingCodes);
		builder.append("]");
		return builder.toString();
	}
}
