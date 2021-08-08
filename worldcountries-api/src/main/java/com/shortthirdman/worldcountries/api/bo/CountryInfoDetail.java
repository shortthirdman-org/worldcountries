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

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author shortthirdman-org
 *
 */
@SuppressWarnings("serial")
@JsonRootName(value = "country")
public class CountryInfoDetail implements Serializable {

	@JsonProperty("name")
	private String shortName;

	@JsonProperty("fullName")
	private String fullName;

	@JsonProperty("alpha2")
	private String alpha2Code;

	@JsonProperty("alpha3")
	private String alpha3Code;

	@JsonProperty("numeric")
	private String numericCode;

	@JsonProperty("captialCity")
	private String capitalCity;

	@JsonProperty("independent")
	private String isIndependent;

	@JsonProperty("region")
	private String continentRegion;

	@JsonProperty("subregion")
	private String subContinentalRegion;

	@JsonProperty("languages")
	private List<String> administrativeLangs;

	@JsonProperty("area")
	private Integer areaSqKm;

	@JsonProperty("largestCities")
	private List<String> largestCities;

	@JsonProperty("demonym")
	private String demonym;

	@JsonProperty("currencyName")
	private String currencyName;

	@JsonProperty("currencyCode")
	private String currenyCode;

	@JsonProperty("driving")
	private String drivingSide;

	@JsonProperty("timeZones")
	private List<String> timeZones;

	@JsonProperty("callingCodes")
	private List<String> callingCodes;

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
	 * @return the isIndependent
	 */
	public String getIsIndependent() {
		return isIndependent;
	}

	/**
	 * @param isIndependent the isIndependent to set
	 */
	public void setIsIndependent(String isIndependent) {
		this.isIndependent = isIndependent;
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
	public List<String> getAdministrativeLangs() {
		return administrativeLangs;
	}

	/**
	 * @param administrativeLangs the administrativeLangs to set
	 */
	public void setAdministrativeLangs(List<String> administrativeLangs) {
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
	public List<String> getLargestCities() {
		return largestCities;
	}

	/**
	 * @param largestCities the largestCities to set
	 */
	public void setLargestCities(List<String> largestCities) {
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
	public List<String> getTimeZones() {
		return timeZones;
	}

	/**
	 * @param timeZones the timeZones to set
	 */
	public void setTimeZones(List<String> timeZones) {
		this.timeZones = timeZones;
	}

	/**
	 * @return the callingCodes
	 */
	public List<String> getCallingCodes() {
		return callingCodes;
	}

	/**
	 * @param callingCodes the callingCodes to set
	 */
	public void setCallingCodes(List<String> callingCodes) {
		this.callingCodes = callingCodes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryInfoDetail [shortName=");
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
		builder.append(", isIndependent=");
		builder.append(isIndependent);
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
