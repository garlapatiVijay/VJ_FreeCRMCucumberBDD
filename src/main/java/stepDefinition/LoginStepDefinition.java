//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//
//		WebDriver driver;
//		
//		@Given("^User is already on Login page$")
//		public void user_already_on_login_page()
//		{
//			System.setProperty("webdriver.chrome.driver","/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/chromedriver");
//			driver = new ChromeDriver();
//			driver.get("https://www.freecrm.com/index.html");
//		}
//		
//		@When("^title of login page is Free CRM$")
//		public void title_of_login_page()
//		{
//			String title = driver.getTitle();
//			System.out.println(title);
//			Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
//		}
//		
//		//Note:- We do have two types of regular expression as \”(.*)\” or \”([^\”]*)\"
//		@Then("^User enters \"(.*)\" and \"(.*)\"$")
//		public void User_enters_user_name_and_password(String username, String password) 
//		{
//		 driver.findElement(By.name("username")).sendKeys(username);
//		 driver.findElement(By.name("password")).sendKeys(password);
//		}
//		
//		@Then("^User clicks on login button$")
//		public void User_clicks_on_login_button() 
//		{
//		  WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		  JavascriptExecutor js = (JavascriptExecutor)driver;
//		  js.executeScript("arguments[0].click();", loginBtn);
//		}
//
//		@Then("^user is on home page$")
//		public void user_is_on_home_page()
//		{
//		 String title = driver.getTitle();
//		 System.out.println(title);
//		 Assert.assertEquals("CRMPRO", title);
//		}
//		
//		@Then("^user moves to new contact page$")
//		 public void user_moves_to_new_contact_page() {
//			driver.switchTo().frame("mainpanel");
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//			}
//		
//		@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//		 public void user_enters_contacts_details(String firstname, String lastname, String position){
//			 driver.findElement(By.id("first_name")).sendKeys(firstname);
//			 driver.findElement(By.id("surname")).sendKeys(lastname);
//			 driver.findElement(By.id("company_position")).sendKeys(position);
//			 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		 }
//
//		@Then("^Close the browser$")
//		 public void close_the_browser(){
//			 driver.quit();
//		 }
//
//}
