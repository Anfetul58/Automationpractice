package com.stepdef;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	
	

@Given("User  Opens Browser")
public void user_Opens_Browser() {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

@When("User goes to Automationpractice website")
public void user_goes_to_Automationpractice_website() {
	driver.get("http://automationpractice.com/index.php");

   
}

@Then("User enters username") 

public void user_enters_username() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@class='login']")).click();
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("anfetul@gmail.com");

   
}

@Then("User enters password")
public void user_enters_password() {
 	driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("01787844858");

   
}

@Then("User clicks signin")
public void user_clicks_signin() {
	WebElement signIn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(signIn).click().perform();

   
}

@Then("User verify title")
public String user_verify_title() {
	return driver.getTitle();

   
}

@Then("User select dresses")
public void user_select_dresses() {
	driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]")).click();

   
}

@Then("User get prices")
public void user_get_prices() {
	 List<WebElement> Clothxpath = driver.findElements(By.xpath("//*[@class='price product-price']"));
	 ArrayList<String> Stringprice =new ArrayList<String>();
	 
	 for( int i= 0;i< Clothxpath.size(); i++)  {
	 Stringprice.add(Clothxpath.get(i).getText());
	 }
	System.out.println(Stringprice); 

   
}

@Then("User gets second price")
public void user_gets_second_price() {
	 driver.findElement(By.xpath("(//*[@itemprop='url'])[5]")).click();

   
}

@Then("User add to cart")
public void user_add_to_cart() {
	 WebElement CartBtn = driver.findElement(By.xpath("//*[@name='Submit']"));
	 Actions actions =new Actions(driver);
	 actions.moveToElement(CartBtn).click().perform();
}


@Then("User able to checkout")
public void user_able_to_checkout() throws InterruptedException {
	Thread.sleep(1000);
	 WebElement CheckoutBtn = driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(CheckoutBtn).click().perform();
   
   
}

@Then("User able to verifyprice")
public String user_able_to_verifyprice() {
	WebElement price = driver.findElement(By.xpath("(//*[@class='price'])[6]"));
	String priceString = price.getText(); 
	System.out.println("price is on page" + price.getText());
	return priceString; 
   
   
}

@Then("User able to verifyaddress")
public String user_able_to_verifyaddress() {
	  WebElement address = driver.findElement(By.xpath("//*[@class='address_address1']")); 
	   String addressString = address.getText();
	   System.out.println("address is on page"+ address.getText());
	   return addressString;
   
   
}

@Then("User clicks signout")
public void user_clicks_signout() {
	driver.findElement(By.xpath("//*[@class='logout']")).click();

   
}































































}
