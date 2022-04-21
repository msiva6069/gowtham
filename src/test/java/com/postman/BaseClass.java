package com.postman;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification reqSpec;
	Response response;

	public void header(String Key, String Value) {
		reqSpec = RestAssured.given().header(Key, Value);
	}

	public void queryParam(String Key, String Value) {
		reqSpec = reqSpec.queryParam(Key, Value);
	}

	public void pathParam(String Key, String Value) {
		reqSpec = reqSpec.queryParam(Key, Value);
	}
	public void body(String body) {
		reqSpec = reqSpec.body(body);
	}
	public void basicAuth(String username, String Password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, Password);
	}
	public Response methodType(String type, String endpoint) {
        switch (type) {
		case "GET":
			response = reqSpec.get(endpoint);
			break;
		case"POST":
			response = reqSpec.post(endpoint);
			
			break;
		case"PUT":
			response = reqSpec.put(endpoint);
			break;
		case"DELETE":
			response = reqSpec.put(endpoint);
			break;		
		default:
			break;	
		}
		return response;	
	}
	public String getBodyAsString() {
		String asString = response.getBody().asString();
		return asString;
	}
	
	public String getBodyAsPretty() {
		String asString = response.getBody().asPrettyString();
		return asString;
	}
	public int responseCode() {
		int statusCode = response.getStatusCode();
		return statusCode;

	}
}