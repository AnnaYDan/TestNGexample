package testNGGrID.testNGArID;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;

public class RegPageTest {

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("////before suite reg page");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("////after suite reg page");	  
  }

  @BeforeGroups
  public void beforeGroup() {
	  System.out.println("////before group reg page");
  }

  @AfterGroups
  public void afterGroup() {
	  System.out.println("////after group reg page");	  
  } 
  
  @Test(groups = {"email", "both"})
  public void emailRegPageTest1() {
	  System.out.println("////test code reg page 1");
  } 

  @Test(groups = {"email", "both"})
  public void emailRegPageTest2() {
	  System.out.println("////test code reg page 2");
  } 

  @Test(dependsOnMethods = "phoneRegPageTest4", priority = 3, groups = {"email"})
  public void emailRegPageTest3() {
	  System.out.println("////test code reg page 3");
  } 

  @Test(priority = 1, groups = {"email"})
  public void emailRegPageTest4() {
	  System.out.println("////test code reg page 4");
  } 
    
  @Test(groups = {"phone", "both"})
  public void phoneRegPageTest1() {
	  System.out.println("////test phone reg page 1");
  } 

  @Test(groups = {"phone", "both"})
  public void phoneRegPageTest2() {
	  System.out.println("////test phone reg page 2");
  } 

  @Test(groups = {"phone"})
  public void phoneRegPageTest3() {
	  System.out.println("////test phone reg page 3");
  } 

  @Test(priority = 2, groups = {"phone"})
  public void phoneRegPageTest4() {
	  System.out.println("////test phone reg page 4");
	  Assert.assertEquals("123", "123");
  } 

  
}
