//package stepDefinition;
//
//import java.util.List;
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
//public class DealStepDefinition {
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
//				@Then("^User enters username and password$")
//				public void User_enters_user_name_and_password(DataTable credentials) 
//				{
//				 List<List<String>> data = credentials.raw();
//				 driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//				 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//				}
//				
//		@Then("^User clicks on login button$")
//				public void User_clicks_on_login_button() 
//				{
//				  WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//				  JavascriptExecutor js = (JavascriptExecutor)driver;
//				  js.executeScript("arguments[0].click();", loginBtn);
//				}
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
//		 public void user_enters_deal_details(DataTable details){
//			 List<List<String>> dealData = details.raw();
//			 driver.findElement(By.id("title")).sendKeys(dealData.get(0).get(0));
//			 driver.findElement(By.id("amount")).sendKeys(dealData.get(0).get(1));
//			 driver.findElement(By.id("probability")).sendKeys(dealData.get(0).get(2));
//			 driver.findElement(By.id("commission")).sendKeys(dealData.get(0).get(3));
//		 }
//		
//		@Then("^Close the browser$")
//		 public void close_the_browser(){
//			 driver.quit();
//		 }
//}
