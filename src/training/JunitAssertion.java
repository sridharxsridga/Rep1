package training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitAssertion {

	public JunitAssertion() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void firstMethod(){
		System.out.println("first method");
	}
	
	@Test
	public void secondMethod(){
		System.out.println("second method"); 	
	}
	
	@Test
	public void thirdMethod(){
		System.out.println("second method"); 	
	}
	
	@Before
	public void BeforeTest(){
		System.out.println("second method"); 	
	}
	
	@After
	public void AfterTest(){
		System.out.println("second method"); 	
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("second method"); 	
	}
	
	
	@AfterClass
	public void AfterClass(){
		System.out.println("second method"); 	
	}
}
