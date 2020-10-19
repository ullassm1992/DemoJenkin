package com.Jenkin.DemoTest;

import org.testng.annotations.Test;

public class JenKinTest 
{
  @Test
  public void urltest()
  {
	  String url=System.getProperty("url");
	  System.out.println("URL : "+ url);
  }
  @Test
  public void logintest()
  {
	  String username=System.getProperty("un");
	  System.out.println("User name : "+ username);
	  String password=System.getProperty("pw");
	  System.out.println("Password : "+ password);
  }
  
  
}
