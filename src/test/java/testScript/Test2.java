package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test2 {

	/**
	 * @param args
	 */

	@BeforeTest
	public void TestBefore() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test2 Execution Started.");
		
	}
	
	@BeforeClass
	public void TestBeforeClass() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test2 Class Execution Started.");
		
	}
	@Test
	public void TestX() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Welcome X to Eclipse");
		
	}

	@Test
	public void TestY() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Welcome Y to Eclipse");

	}
	
	@Test
	public void TestZ() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Welcome Z to Eclipse");

	}

	@AfterClass
	public void TestAfterClass() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test2 Class Execution Ended.");
		
	}
	
	@AfterTest
	public void TestEnd() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Test2 Execution Ended.");
		
	}
	
	
}
