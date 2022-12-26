package pageobject;

import org.openqa.selenium.WebDriver;

public class PageobjectManager {
	public BookingPage bookingpage;
	public ConfirmationPage confirmationpage;
	public WebDriver driver;
	
	
	
	
	public PageobjectManager(WebDriver driver) {  //driver from test setup
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public BookingPage getBookingPage() {
		bookingpage=new BookingPage(driver);
		return bookingpage;
	}
	
	public ConfirmationPage getConfirmationPage() {
		confirmationpage=new ConfirmationPage(driver);
		return confirmationpage;
	}
	

}
