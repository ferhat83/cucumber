

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
//public class LoginStepDefinitions {
//	WebDriver driver= null;
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
//	public void user_enters_username_and_password() {
//		driver.findElement(By.id("email")).sendKeys("Saadi.Ferhat@live.fr");
//		driver.findElement(By.id("pass")).sendKeys("04142016");
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
//  @Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();//if one of the steps fail it will skip the next steps(it's our case)
//	}

//}
