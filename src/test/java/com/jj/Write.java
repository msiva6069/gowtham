package com.jj;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Write {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file=new File("C:\\Users\\msiva\\eclipse-workspace\\Api\\src\\test\\resources\\jsonFfiles\\Hellow.json");
		ObjectMapper mapper=new ObjectMapper();	
		
		ArrayList<EmpDetails> details=new ArrayList<EmpDetails>();
		
		EmpDetails e1=new EmpDetails("siva", "siva@gmail.com", "java");
		EmpDetails e2=new EmpDetails("siva", "siva@gmail.com", "java");
		EmpDetails e3=new EmpDetails("siva", "siva@gmail.com", "java");
		details.add(e1);
		details.add(e2);
		details.add(e3);
		
		Task1 task1=new Task1("siva", "kumar", "hgyudc@gmail.com", 8973110021l, details);
		
		mapper.writeValue(file,task1);
		
		
	}

}
