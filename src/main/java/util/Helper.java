package util;

import java.util.Random;


import org.junit.*;


public class Helper {
	
	public static int generateRandomNumber(int boundaryNum)
	{
		Random rnd = new Random();
		int number=rnd.nextInt(boundaryNum);
		return number;
	}
	
	
	
	public static boolean compareUrls(String url1,String url2)
	{
		Assert.assertEquals(url2, url1);
		return url1.equals(url2);
	}
	
	
	
	
}
