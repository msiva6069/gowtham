package com.jj;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\msiva\\eclipse-workspace\\Api\\src\\test\\resources\\jsonFfiles\\file.json");
		
		ObjectMapper mapper= new ObjectMapper();
		SamplePojo pojo = mapper.readValue(file, SamplePojo.class);
		String name = pojo.getFirst_name();
		System.out.println(name);
		
		
		
		
	}

}
