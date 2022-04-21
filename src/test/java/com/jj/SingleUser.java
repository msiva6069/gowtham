package com.jj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SingleUser {

	public static void main(String[] args) throws IOException, ParseException {

		// read json file
		FileReader filreader = new FileReader(
				"C:\\Users\\msiva\\eclipse-workspace\\Api\\src\\test\\resources\\jsonFfiles\\file.json");

		// json file convert into object

		JSONParser parse = new JSONParser();

//		// objectt file convert int jsonobject
     	Object objctfile = parse.parse(filreader);
//		//class cast
		JSONObject objctfile1 = (JSONObject) objctfile;

		Object object = objctfile1.get("data");
		JSONObject dataobj = (JSONObject) object;
		
		System.out.println(dataobj.get("id"));
		System.out.println(dataobj.get("email"));
		System.out.println(dataobj.get("first_name"));
		System.out.println(dataobj.get("last_name"));
		System.out.println(dataobj.get("avatar"));

		Object object2 = objctfile1.get("support");
		JSONObject support = (JSONObject) object2;
		System.out.println(support.get("url"));
		System.out.println(support.get("text"));
		

	}

}
