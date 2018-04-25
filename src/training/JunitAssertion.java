package training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.AfterClass;

public class JunitAssertion {

	public JunitAssertion() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void firstMethod(){
		System.out.println("first method");
		//Assert.
	}
	
	@Test
	@Ignore
	public void secondMethod(){
		System.out.println("second method"); 	
	}
	
	@Test
	public void thirdMethod(){
		System.out.println("third method"); 	
	}
	
	@Before
	public void BeforeTest(){
		System.out.println("Before Test"); 	
	}
	
	@After
	public void AfterTest(){
		System.out.println("After Test"); 	
	}
	
	@BeforeClass
	public static void BeforeClass(){
		System.out.println("Before Class"); 	
	}
	
	
	@AfterClass
	public static  void AfterClass(){
		System.out.println("After Class"); 	
	}
	
}
