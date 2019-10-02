//package stepDefinition;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
// // data table with list for parameterization of test cases 
//public class DataDrivenTableList {
//WebDriver driver= null;
//	
//	@Given("^User is already in login page$")
//    public void user_is_already_in_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\saadi\\eclipse-workspace\\seleniumAutomation\\CucumberBDDFramework\\driver\\chromeDriver\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//	}
//	@When("^title of login page is facebook logins$")
//	public void title_of_login_page_is_facebook_logins() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Facebook - Log In or Sign Up",title);
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable crendentials) {// DataTable is cucumber Api
//		List<List<String>> dataList = crendentials.raw();
//		driver.findElement(By.id("email")).sendKeys(dataList.get(0).get(0));// get row
//		driver.findElement(By.id("pass")).sendKeys(dataList.get(0).get(1));
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//
//	@Then("^user is in home page$")
//	public void user_is_in_home_page() {
//	  String homeTitle = driver.getTitle();
//	  System.out.println("home page title "+homeTitle);
//	  Assert.assertEquals("Facebook",homeTitle);
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();//if one of the steps fail it will skip the next steps(it's our case)  
//	}
//
//
//}
