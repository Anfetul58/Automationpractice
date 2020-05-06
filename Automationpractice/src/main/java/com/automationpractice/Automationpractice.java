package com.automationpractice;





import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Automationpractice {

	WebDriver driver;
	
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void maximizebrowser() {
		driver.manage().window().maximize();
	}

    public void geturl() {
    	driver.get("http://automationpractice.com/index.php");
    }

    public void getsignin() {
    	driver.findElement(By.xpath("//*[@class='login']")).click();
    	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("anfetul@gmail.com");
    	driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("01787844858");
    	WebElement signIn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(signIn).click().perform();
    }
    
  
    public String getTitleofPage() {
    	return driver.getTitle();
    }
    
    public void selectdress() {
    	driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]")).click();
    }
     public void getprices() {
    	 List<WebElement> Clothxpath = driver.findElements(By.xpath("//*[@class='price product-price']"));
    	 ArrayList<String> Stringprice =new ArrayList<String>();
    	 
    	 for( int i= 0;i< Clothxpath.size(); i++)  {
    	 Stringprice.add(Clothxpath.get(i).getText());
    	 }
    	System.out.println(Stringprice); 
     }
 
     public void getsecondprice() {
    	 driver.findElement(By.xpath("(//*[@itemprop='url'])[5]")).click();
     }
   
     public void addtocart() {
    	 WebElement CartBtn = driver.findElement(By.xpath("//*[@name='Submit']"));
    	 Actions actions =new Actions(driver);
    	 actions.moveToElement(CartBtn).click().perform();
    	
     }
     
    



     public void checkout() {
    	 WebElement CheckoutBtn = driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']"));
    	 Actions actions = new Actions(driver);
    	 actions.moveToElement(CheckoutBtn).click().perform();
     }

     public String verifyprice() {
    		WebElement price = driver.findElement(By.xpath("(//*[@class='price'])[6]"));
    		String priceString = price.getText(); 
    		System.out.println("price is on page" + price.getText());
    		return priceString; 
    		
     }




   public String verifyaddress() {
	   WebElement address = driver.findElement(By.xpath("//*[@class='address_address1']")); 
	   String addressString = address.getText();
	   System.out.println("address is on page"+ address.getText());
	   return addressString;
	}


public void signout() {
	driver.findElement(By.xpath("//*[@class='logout']")).click();
	
}






































































}
