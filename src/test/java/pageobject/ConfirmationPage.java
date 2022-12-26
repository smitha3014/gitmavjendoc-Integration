package pageobject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfirmationPage  {

	    public WebDriver driver;
		public ConfirmationPage(WebDriver driver) {
			this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	}
		@FindBy(xpath="//input[@id='inputName']")
		    WebElement name;
		 @FindBy(xpath="//input[@id='address']")
		    WebElement address;
		 @FindBy(xpath="//input[@id='city']")
		    WebElement city;
		 @FindBy(xpath="//input[@id='state']")
		    WebElement state ;
		 @FindBy(xpath="//input[@id='zipCode']")
		    WebElement zipcode ;
		 @FindBy(xpath="//select[@id='cardType']")
		    WebElement fcardtype ;
		 @FindBy(xpath="//input[@id='creditCardNumber']")
		    WebElement creditcardnumber ;
		 @FindBy(xpath="//input[@id='creditCardMonth']")
		    WebElement month ;
		 @FindBy(xpath="//input[@id='creditCardYear']")
		    WebElement year ;
		 @FindBy(xpath="//input[@id='nameOnCard']")
		    WebElement nameoncard ;
		 @FindBy(xpath="//input[@value='Purchase Flight']")
		    WebElement purchase ;
		 @FindBy(xpath="//div/h1")
		    WebElement confirmationtext ;

		    
		    public WebElement Mname() {
		    	return name;
		    }
		    public WebElement Maddress() {
		    	return address;
		    }
		    public WebElement Mcity() {
		    	return city;
		    }
		    public WebElement Mstate() {
		    	return state;
		    }
		    public WebElement Mzipcode() {
		    	return zipcode;
		    }
		    
		    public void select_fromlist(String cardtype){
			     Select dropdown=new Select(fcardtype);
			     dropdown.selectByVisibleText(cardtype);
			    }
		    
		    public WebElement Mcreditcardnumber() {
		    	return creditcardnumber;
		    }
		    public WebElement Mmonth() {
		    	return month;
		    }
		    public WebElement Myear() {
		    	return year;
		    }
		    public WebElement Mnameoncard() {
		    	return nameoncard;
		    }
		    public WebElement Mpurchase() {
		    	return purchase;
		    }
		    public WebElement Mconfirmationtext() {
		    	
		    	return confirmationtext;
		    }
		 
		 
		 



}
