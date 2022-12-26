package pageobject;


import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class BookingPage {
	public WebDriver driver;
	
    
   public BookingPage( WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//select[@name='fromPort']")
    WebElement departure;
    @FindBy(xpath="//select[@name='toPort']")
    WebElement destination;
    @FindBy(xpath="//input[contains(@value,'Flights')]")
    WebElement findflight;
    @FindBy(xpath="//td[6]") 
    public List<WebElement> prices;
    @FindBy(xpath="//td/input")
    WebElement flight;
    @FindBy(xpath="//tbody/tr[1]/td[1]")
    WebElement flight1;
    @FindBy(xpath="//tbody/tr[2]/td[1]")
    WebElement flight2;
    @FindBy(xpath="//tbody/tr[3]/td[1]")
    WebElement flight3;
    @FindBy(xpath="//tbody/tr[4]/td[1]")
    WebElement flight4;
    @FindBy(xpath="//tbody/tr[5]/td[1]")
    WebElement flight5;
   
    
    
    
    public void select_fromlist(String fromcity){
	     Select dropdown=new Select(departure);
	     dropdown.selectByVisibleText(fromcity);
	    }
    
    
    public void select_tolist(String tocity){
	     Select dropdown=new Select(destination);
	     dropdown.selectByVisibleText(tocity);
	    }
    
    public WebElement findingflight() {
    	return findflight;
    }
    public List<WebElement> pricing() {
    	//Double sum = 0.0;
    	for(int i = 0;i<prices.size();i++)
    	{
    		
    	//double d=Double.parseDouble(prices.get(i).getText().replace("$", "").trim());
    	//System.out.println(d);
    	//System.out.println(Math.asin(d));
    	//Java.lang.math.min (d)
    		double d0=Double.parseDouble(prices.get(0).getText().replace("$", "").trim());
    		
    		double d1=Double.parseDouble(prices.get(1).getText().replace("$", "").trim());
    		
    		double d2=Double.parseDouble(prices.get(2).getText().replace("$", "").trim());
    	
    		double d3=Double.parseDouble(prices.get(3).getText().replace("$", "").trim());
    	
    		double d4=Double.parseDouble(prices.get(4).getText().replace("$", "").trim());
    		
    		double min=Math.min(Math.min(d0, d1), Math.min(Math.min(d2, d3), d4));
    		System.out.println(min);
    	
    		if(min==d0) {
    			flight1.click();
    			System.out.println("flight1 booked");
    			
    		}
    		else if(min==d1) {
    			flight2.click();
    			System.out.println("flight2 booked");
    			
 
    		}
    		else if(min==d2){
    			flight3.click();
    			System.out.println("flight3 booked");
    			
    		}
    	    else if(min==d3) {
    	    	flight4.click();
    	    	System.out.println("flight4 booked");
    	    	
    	    }
    	    else
    	    {
    	    	flight5.click();
    	    	System.out.println("flight5 booked");
    	    	
    		}
    	
    	
    	
    	}
    	
    	
    	
		return prices;
		
    }
   
    
}