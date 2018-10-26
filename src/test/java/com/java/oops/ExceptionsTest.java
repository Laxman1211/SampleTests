package com.java.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsTest {
	
	// 	Checked Exceptions
	
	public static void main(String[] args) throws IOException    {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("E:\\Users\\laxman_p\\Desktop\\PromoFeature.txt"); 
        BufferedReader fileInput = new BufferedReader(file); 
          
        // Print first 3 lines of file "PromoFeature.txt" 
        for (int counter = 0; counter < 3; counter++)  
            System.out.println(fileInput.readLine()); 
 
        fileInput.close(); 
	}

}
