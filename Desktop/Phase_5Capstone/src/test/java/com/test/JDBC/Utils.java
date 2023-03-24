package com.test.JDBC;

import java.util.Random;

public class Utils {
	
	
	public int generateRandomNumber(){
		Random random = new Random();
		int rNum = random.nextInt(1000);
		System.out.println(rNum);
		return rNum;
		
		
	}

}
