package com.jj;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Array {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader filreader = new FileReader("C:\\Users\\msiva\\eclipse-workspace\\Api\\src\\test\\resources\\jsonFfiles\\fileuser.json");

		JSONParser parse = new JSONParser();

     	Object objctfile = parse.parse(filreader);
		JSONObject objctfile1 = (JSONObject) objctfile;
		
//		Object obj1 = objctfile1.get("page");
//		JSONObject pa = (JSONObject)obj1;
//		System.out.println(pa);
		
		
		
		Object object = objctfile1.get("data");
		JSONArray arraydata = (JSONArray)object;
		
		for (int i = 0; i < arraydata.size(); i++) {
			Object objEach = arraydata.get(i);
			JSONObject jsoneach = (JSONObject) objEach;
//			Object obje = jsoneach.get("name");
			
			System.out.println(jsoneach.get("id"));	
			System.out.println(jsoneach.get("first_name"));	
			System.out.println(jsoneach.get("last_name"));	
			System.out.println(jsoneach.get("email"));	
			System.out.println(jsoneach.get("avatar"));	
		}
		Object object2 = objctfile1.get("support");
		JSONObject support = (JSONObject) object2;
		System.out.println(support.get("url"));
		System.out.println(support.get("text"));
		
		
		
	}

}
