package com.TestNG;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationpractice.Automationpractice;

public class TestNG extends Automationpractice {
    TestNG test;
    
@BeforeTest
 
public void runsetup() throws InterruptedException  {
	Thread.sleep(1000);
	
	
	test= new TestNG();
	test.openbrowser();
	test.maximizebrowser();
	test.geturl();
	}

@Test
public void gettrip() throws InterruptedException {
	Thread.sleep(1000);
	test.getsignin();
	Assert.assertEquals(test.getTitleofPage(), "My account - My Store");
	test.selectdress();
	test.getprices();
	test.getsecondprice();
	test.addtocart();
	Thread.sleep(1000);
	test.checkout();
	Assert.assertEquals(test.verifyprice(), "$52.99");
	Assert.assertEquals(test.verifyaddress(), "9236 168 PL");
    test.signout();
}

	
	
	
	
	
	
	
	
	











}
