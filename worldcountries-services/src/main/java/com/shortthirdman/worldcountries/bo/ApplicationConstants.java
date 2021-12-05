/**
 * 
 */
package com.shortthirdman.worldcountries.bo;

/**
 * @author SWMOHAN
 *
 */
public interface ApplicationConstants {

	String COUNTRY_BY_NAME_QUERY = "SELECT * FROM netstar.world_countries_demography WHERE short_name = ?1";
	
	String ALL_COUNTRIES_QUERY = "SELECT * FROM netstar.world_countries_demography ORDER BY short_name";
	
	String COUNTRY_BY_ALPHA2_QUERY = "SELECT * FROM netstar.world_countries_demography WHERE alpha2_code = ?1";
	
	String COUNTRY_BY_ALPHA3_QUERY = "SELECT * FROM netstar.world_countries_demography WHERE alpha3_code = ?1";
	
	String COUNTRY_BY_CONTINENT_QUERY = "SELECT * FROM netstar.world_countries_demography WHERE continental_region = ?1 ORDER BY short_name";
	
	String COUNTRIES_BY_DRIVINGSIDE_QUERY = "SELECT * FROM netstar.world_countries_demography WHERE driving_side = ?1 ORDER BY short_name";
	
	String YES_IND = "Y";
	
	String NO_IND = "N";
	
	String LEFT_IND = "L";
	
	String RIGHT_IND = "R";
	
	String STARTED = " Started";
	
	String COMPLETED = " Completed";
}
