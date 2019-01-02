//package stepDefinition;
//
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealStepWithMapDefinition {
//		WebDriver driver;
//		
//		@Given("^User is already on Login page$")
//		public void user_already_on_login_page()
//		{
//			System.setProperty("webdriver.chrome.driver","/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/chromedriver");
//			driver= new ChromeDriver();
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
//		@Then("^User enters username and password$")
//		public void User_enters_user_name_and_password(DataTable credentials) 
//		{
//		  for(Map<String, String> data: credentials.asMaps(String.class, String.class))
//		   {
//			 driver.findElement(By.name("username")).sendKeys(data.get("username"));
//			 driver.findElement(By.name("password")).sendKeys(data.get("password"));
//			 }
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
//		@Then("^user moves to new deal page$")
//		 public void user_moves_to_new_deal_page() {
//			driver.switchTo().frame("mainpanel");
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//			}
//		
//		@Then("^user enters deal details$")
//		 public void user_enters_deal_details(DataTable details)
//		{
//			for(Map<String, String> data: details.asMaps(String.class, String.class))
//			{
//			 driver.findElement(By.id("title")).sendKeys(data.get("title"));
//			 driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//			 driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//			 driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//			 driver.findElement(By.xpath("//input[@value='Save' and @type='submit']")).click();
//			 
//			 //move to new deai page
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//			}
//		 }
//		
//		@Then("^Close the browser$")
//		 public void close_the_browser(){
//			 driver.quit();
//		 }
//}
