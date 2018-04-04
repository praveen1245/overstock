package com.overstock.OverStock;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleTest {
  @Test
  public void f() {
	  
	  System.out.println("Test Block");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Block");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After Block");
  }

}
