package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test1 {

	/**
	 * @param args
	 */

	@BeforeTest
	public void TestBefore() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test Execution Started.");
		
	}
	
	@BeforeClass
	public void TestBeforeClass() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test Class Execution Started.");
		
	}
	@Test
	public void TestA() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Welcome Ashish to Eclipse");
		
	}

	@Test
	public void TestB() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Welcome Ankur to Eclipse");

	}
	
	@Test
	public void TestC() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Welcome Minki to Eclipse");

	}

	@AfterClass
	public void TestAfterClass() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test Class Execution Ended.");
		
	}
	
	@AfterTest
	public void TestEnd() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test Execution Ended.");
		
	}
	
	
}
