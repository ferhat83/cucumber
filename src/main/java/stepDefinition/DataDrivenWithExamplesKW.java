//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DataDrivenWithExamplesKW {
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
//	//regular expressions to use as username and password:1-  \"(.*)\"  ,2-  \"([^\"]*)\"
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")//we use the 1st code \"(.*)\" to represent the username and password we add in feature file
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(password);
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
