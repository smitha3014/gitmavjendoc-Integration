package stepdefiniton;

import java.util.List;


import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobject.ConfirmationPage;
import utils.TestSetup;


public class ConfirmationSteps   {
	
    TestSetup testsetup;
	public ConfirmationPage confirmationpage;
	
	public ConfirmationSteps(TestSetup testsetup) {
		this.testsetup=testsetup;
		this.confirmationpage=testsetup.pageobjectmanager.getConfirmationPage();
	}

	//ConfirmationPage confirmationpage=new ConfirmationPage(null); 
	 @Then("^user entered the following details$")
	    public void user_entered_the_following_details(DataTable data) throws Throwable {
		 List<List<String>> obj=data.asLists();
		 confirmationpage.Mname().sendKeys(obj.get(0).get(0));
		 confirmationpage.Maddress().sendKeys(obj.get(0).get(1));
		 confirmationpage.Mcity().sendKeys(obj.get(0).get(2));
		 confirmationpage.Mstate().sendKeys(obj.get(0).get(3));
		 confirmationpage.Mzipcode().sendKeys(obj.get(0).get(4));
		 confirmationpage.select_fromlist(obj.get(0).get(5));
		 confirmationpage.Mcreditcardnumber().sendKeys(obj.get(0).get(6));
		 confirmationpage.Mmonth().sendKeys(obj.get(0).get(7));
		 confirmationpage.Myear().sendKeys(obj.get(0).get(8));
		 confirmationpage.Mnameoncard().sendKeys(obj.get(0).get(9));
		 
			
	    }

	    @When("^user clicked on purchase flight$")
	    public void user_clicked_on_purchase_flight() throws Throwable {
	       confirmationpage.Mpurchase().click();
	    }

	    @Then("^booking confirmation is displayed$")
	    public void booking_confirmation_is_displayed() throws Throwable {
	    	confirmationpage.Mconfirmationtext().getText();
	        
	    }

}

  
