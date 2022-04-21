package com.postman;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Postman {
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification given2 = RestAssured.given();
		given2.header("contant-Type","application/json");
		RequestSpecification pathParam = given.pathParam("petID", "8");
		Response response = given.get("https://petstore.swagger.io/v2/pet/{petID}");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asString = body.asString();
		System.out.println(asString);
		String ll = body.asPrettyString();
		System.out.println(ll);
		
		
		
		
		
	}

}
