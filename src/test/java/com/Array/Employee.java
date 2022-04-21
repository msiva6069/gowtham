package com.Array;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee {

	public static void main(String[] args) throws IOException {
		File file = new File(
				"C:\\Users\\msiva\\eclipse-workspace\\Api\\src\\test\\resources\\jsonFfiles\\fileuser.json");
		ObjectMapper mapper = new ObjectMapper();

		Root d = mapper.readValue(file, Root.class);
		System.out.println(d.getPage());
		System.out.println(d.getPer_page());
		System.out.println(d.getTotal());
		System.out.println(d.getTotal_pages());
		
		ArrayList<Datum> data = d.getData();

		for (Datum s : data) {
			System.out.println(s.getId());
			System.out.println(s.getEmail());
			System.out.println(s.getFirst_name());
			System.out.println(s.getLast_name());
			System.out.println(s.getAvatar());

		}

		Support sup = d.getSupport();
		System.out.println(sup.getText());
		System.out.println(sup.getUrl());

	}

}
