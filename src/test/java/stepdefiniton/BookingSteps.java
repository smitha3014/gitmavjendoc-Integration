package stepdefiniton;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pageobject.BookingPage;
import utils.TestSetup;


public class BookingSteps  {
	TestSetup testsetup;
	public BookingPage bookingpage;
	
	public BookingSteps(TestSetup testsetup) {
		this.testsetup=testsetup;
		this.bookingpage=testsetup.pageobjectmanager.getBookingPage();
	}
	

    @Given("^user select departure city$")
    public void user_select_departure_city() throws Throwable {
       bookingpage.select_fromlist("Boston");
    }
    
    @And("^user select destination city$")
    public void user_select_destination_city() throws Throwable {
    	 bookingpage.select_tolist("Rome");
    }

    @And("^list of flights are shown to choose$")
    public void list_of_flights_are_shown_to_choose() throws Throwable {
    	 bookingpage.findingflight().click();
    }


    @Then("^choose the flight with lowest price$")
    public void choose_the_flight_with_lowest_price() throws Throwable {
      bookingpage.pricing();
    }

   



}
