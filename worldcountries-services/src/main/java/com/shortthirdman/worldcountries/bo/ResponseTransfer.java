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
package com.shortthirdman.worldcountries.bo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author shortthirdman-org
 *
 */
@SuppressWarnings("serial")
@JsonInclude(value = Include.NON_NULL)
public class ResponseTransfer implements Serializable {

	private static final String DATETIME_FORMATTER = "dd-MMM-yyyy HH:mm:ss";
	
	@JsonProperty("message")
	private String message;

	@JsonProperty("timestamp")
	private String timestamp;

	@JsonProperty("exception")
	private String exception;

	@JsonProperty("errors")
	private List<String> errors;

	@JsonProperty("status")
	private Integer status;

	@JsonProperty("results")
	private Map<String, ?> results;
	
	public ResponseTransfer() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATETIME_FORMATTER);
        timestamp = now.format(formatter);
	}
	
	public ResponseTransfer(String message, String exception, Integer status) {
		this();
		this.message = message;
		this.exception = exception;
		this.status = status;
	}

	/**
	 * @param message
	 * @param timestamp
	 * @param errors
	 */
	public ResponseTransfer(String message, List<String> errors, Integer status) {
		this();
		this.message = message;
		this.errors = errors;
		this.status = status;
	}

	/**
	 * @param message
	 * @param errors
	 * @param status
	 * @param body
	 */
	public ResponseTransfer(String message, List<String> errors, Integer status, Map<String, ?> results) {
		this();
		this.message = message;
		this.errors = errors;
		this.status = status;
		this.results = results;
	}

	/**
	 * @param message
	 * @param status
	 * @param body
	 */
	public ResponseTransfer(String message, Integer status, Map<String, ?> results) {
		this();
		this.message = message;
		this.status = status;
		this.results = results;
	}
	
	/**
	 * @param message
	 * @param ex
	 */
	public ResponseTransfer(String message, Throwable ex) {
		this();
		this.message = message;
		this.errors.add(ex.getLocalizedMessage());
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	/**
	 * @return the method
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param method the method to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the body
	 */
	public Map<String, ?> getResults() {
		return results;
	}

	/**
	 * @param body the body to set
	 */
	public void setResults(Map<String, ?> results) {
		this.results = results;
	}
}
