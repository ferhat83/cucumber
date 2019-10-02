//package stepDefinition;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//
//public class Hooks {
//	              
//	
//	//1- GLOBAL HOOKS(or just hooks):(@Before and @After) 
//	      
//	
//	    //so the next two methods applicable  before all scenarios and after  
//	
//	@Before
//	public void setUp() {
//		System.out.println("open browser");
//	}
//	@After
//	public void cleanUp() {
//		System.out.println("close browser");
//		}
//	
//	//2-LOCAL HOOKS(or tagged hooks): (@Before("@First") and @After("@First") or @Before("@Second") and @After("@Second")...etc
//	     // the next methods will be applicable for specific scenario
//	
//	@Before("@First")// printed just in that specific scenario(1st)
//	public void setUp1() {
//		System.out.println("open browser");
//	}
//	@After("@First")// printed just in that specific scenario(1st)
//	public void cleanUp1() {
//		System.out.println("close browser");
//		}
//	@Before("@Second")// printed just in that specific scenario(2nd)
//	public void setUp2() {
//		System.out.println("open browser");
//	}
//	@After("@Second")// printed just in that specific scenario(2nd)
//	public void cleanUp2() {
//		System.out.println("close browser");
//		}
//	
//	
//	// global and tagged hooks are added in step definitions class
//
//}
