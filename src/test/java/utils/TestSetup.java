package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


import pageobject.PageobjectManager;

public class TestSetup {
	//here ,mention what are the variables or properties that are gonna be shared with other step defintion
	//we need to share the driver in the confirmation step definition also,so
	public WebDriver driver;
	public PageobjectManager pageobjectmanager;
	public TestBase testbase;
	public TestSetup() throws IOException {
		testbase=new TestBase();
		pageobjectmanager=new  PageobjectManager(testbase.webdrivermanager());
	}

}
