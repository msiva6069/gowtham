package com.Pojo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PojoSample {
	
	public void create() {

		System.out.println(".....post.....");

		Project project = new Project("SNAP");
		Issuetype issuetype = new Issuetype("Bug");

		Fields fields = new Fields(project, "SnapDeal-Not able to login", "SnapDeal-Not able to login", issuetype);

		Root root = new Root(fields);

		Response response = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("msiva6069@gmail.com", "AfazUqcAaprih4eA6YniF42F").body(root)
				.post("https://msiva6069.atlassian.net/rest/api/2/issue/");
		
		Output as = response.as(Output.class);
		String id = as.getId();
		System.out.println(id);
		String key = as.getKey();
		System.out.println(key);
		String self = as.getSelf();
		System.out.println(self);
		
		
		int i = response.getStatusCode();
		System.out.println(i);
		
		Assert.assertEquals("Verify Status Code", 201, i);	
//		System.out.println(responce.getBody().asPrettyString());
				
	}
	public void Update() {
		System.out.println(".....put.....");
		Project project = new Project("SNAP");
		Issuetype issuetype = new Issuetype("Bug");

		Fields fields = new Fields(project, "SnapDeal-Not able to click", "SnapDeal-Not able to click", issuetype);

		Root root = new Root(fields);
		
		Response responce = RestAssured.given().header("content-Type", "application/json").auth().preemptive()
				.basic("msiva6069@gmail.com", "AfazUqcAaprih4eA6YniF42F")
				.body(root)
				.put("https://msiva6069.atlassian.net/rest/api/2/issue/SNAP-20");
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getBody().asPrettyString());

	}

	public static void main(String[] args) {
		PojoSample Sample = new PojoSample();
		Sample.create();
		Sample.Update();

	}

}