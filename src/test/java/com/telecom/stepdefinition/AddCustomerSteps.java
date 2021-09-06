package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	AddCustomerPage a = new AddCustomerPage();
	/*static WebDriver driver;
	
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}*/

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
	    
		
		ca.button(a.getAddCustomerButton());
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
	   
		ca.button(a.getDoneButton());
		ca.insertValue(a.getFname(), "karthi");
		ca.insertValue(a.getLname(), "rajan");
		ca.insertValue(a.getMail(), "rajan@gmail.com");
		ca.insertValue(a.getAdd(), "tanjore");
		ca.insertValue(a.getPhno(), "65465333");
		
	}


	@When("user click on submit button")
	public void user_click_on_submit_button() {
		ca.button(a.getSubmitButton());
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		WebElement cusId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		
		Assert.assertTrue(cusId.isDisplayed());
	    
	}
	
	@When("user need to fill up the fields by {int}D list")
	public void user_need_to_fill_up_the_fields_by_D_list(Integer int1, DataTable datas) {
		
		List<String> details = datas.asList(String.class);
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		ca.insertValue(a.getFname(), details.get(0));
		driver.findElement(By.id("lname")).sendKeys(details.get(1));
		driver.findElement(By.id("email")).sendKeys(details.get(2));
		driver.findElement(By.name("addr")).sendKeys(details.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(details.get(4));
		
	   
	}
	
	@When("user need to fill up the fields by {int}D map")
	public void user_need_to_fill_up_the_fields_by_D_map(Integer int1, DataTable datas) {
		
		Map<String, String> details = datas.asMap(String.class, String.class);
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(details.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(details.get("Lname"));
		driver.findElement(By.id("email")).sendKeys(details.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(details.get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(details.get("phno"));
		
	   
	}
	
	@When("user need to fill up the fields {string},{string},{string},{string},{string}")
	public void user_need_to_fill_up_the_fields(String fname, String lname, String mail, String addr, String phno) {
	   
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.name("addr")).sendKeys(addr);
		driver.findElement(By.id("telephoneno")).sendKeys(phno);
		
	}


}
