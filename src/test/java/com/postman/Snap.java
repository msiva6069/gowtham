package com.postman;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Snap {
	public void Create() {
		System.out.println(".....post.....");
		Response responce = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("msiva6069@gmail.com", "AfazUqcAaprih4eA6YniF42F")
				.body("{\r\n" + "    \"fields\": {\r\n" + "       \"project\":\r\n" + "       {\r\n"
						+ "          \"key\": \"SNAP\"\r\n" + "       },\r\n" + "       \"summary\": \"Rest\",\r\n"
						+ "       \"description\": \"Take\",\r\n" + "       \"issuetype\": {\r\n"
						+ "          \"name\": \"Bug\"\r\n" + "       }\r\n" + "   }\r\n" + "}")
				.post("https://msiva6069.atlassian.net/rest/api/2/issue/");
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getBody().asPrettyString());
	}

	public void Update() {
		System.out.println(".....put.....");
		Response responce = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("msiva6069@gmail.com", "AfazUqcAaprih4eA6YniF42F")
				.body("{\r\n" + "    \"fields\": {\r\n" + "       \"project\":\r\n" + "       {\r\n"
						+ "          \"key\": \"SNAP\"\r\n" + "       },\r\n" + "       \"summary\": \"Hulk\",\r\n"
						+ "       \"description\": \"Take\",\r\n" + "       \"issuetype\": {\r\n"
						+ "          \"name\": \"Bug\"\r\n" + "       }\r\n" + "   }\r\n" + "}")
				.put("https://msiva6069.atlassian.net/rest/api/2/issue/SNAP-4");
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getBody().asPrettyString());

	}

	public void Delete() {
		System.out.println(".....DELETE.....");

		Response responce = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("msiva6069@gmail.com", "AfazUqcAaprih4eA6YniF42F")
				.delete("https://msiva6069.atlassian.net/rest/api/2/issue/SNAP-11");
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getBody().asPrettyString());
	}

	public void GetAllIssue() {
		System.out.println(".....AllIssue.....");

		Response responce = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("msiva6069@gmail.com", "AfazUqcAaprih4eA6YniF42F")
				.get("https://msiva6069.atlassian.net/rest/api/2/issue/SNAP");
		System.out.println(responce.getStatusCode());
	//	System.out.println(responce.getBody().asPrettyString());

	}

	public static void main(String[] args) {
		Snap snap = new Snap();
		snap.Create();
		snap.Update();
		snap.Delete();
		snap.GetAllIssue();

	}

}
