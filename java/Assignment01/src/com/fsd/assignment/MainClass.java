package com.fsd.assignment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
				
		MyInterface readData = (text)->{		
		BufferedReader br = null;
		try {

			System.out.println(text);
			br = new BufferedReader(new InputStreamReader(System.in));
			return new BigDecimal(br.readLine());
		}
		catch (IOException e) {
			System.out.println(e);
		}
		return null;
	};	
	
	System.out.println(readData.read("Enter the Salary:"));

}
}
