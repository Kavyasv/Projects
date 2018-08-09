package differentAcc;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.cap.model.Account;
import org.cap.model.Address;
import org.cap.model.Customer;
import org.cap.service.AccountServiceImpl;
import org.cap.service.IAccountService;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	private Customer customer;
	private double openingBalance;
	private Account account;
	IAccountService accService;
	
	@Before
	public void setUp() {
		customer=new Customer();
		
		accService=new AccountServiceImpl();
			
	}
	
	@Given("^customer details and opening balance$")
	public void customer_details_and_opening_balance() throws Throwable {
		customer.setFirstName("kavya");
		customer.setLastName("sh");
		Address address= new Address();
		address.setDoorNo("21/5");
		address.setCity("Chennai");
		customer.setAddress(address);
		openingBalance=1000;
	}

	@When("^for valid cutomer with minimum opening balance (\\d+)$")
	public void for_valid_cutomer_with_minimum_opening_balance(int amount) throws Throwable {
	   this.openingBalance=amount;
	}

	@Then("^create new savings account$")
	public void create_new_savings_account() throws Throwable {
	  account= accService.createAccount(customer, openingBalance);
	   assertNotNull(account);
	   assertEquals("savings", account.getAccountType());
	}

	@Then("^create new current account$")
	public void create_new_current_account() throws Throwable {
		account=accService.createAccount(customer, openingBalance);
		   assertNotNull(account);
		   assertEquals("current",  account.getAccountType());
	}

	@Then("^create new RD account$")
	public void create_new_RD_account() throws Throwable {
		account=accService.createAccount(customer, openingBalance);
		   assertNotNull(account);
		   assertEquals("rd",  account.getAccountType());
	}

	@Then("^create new FD account$")
	public void create_new_FD_account() throws Throwable {
		account=accService.createAccount(customer, openingBalance);
		   assertNotNull(account);
		   assertEquals("fd",  account.getAccountType());
		
	}

	
	} 
	 
	
	 



