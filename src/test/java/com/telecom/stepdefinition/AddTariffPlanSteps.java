package com.telecom.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffPlanSteps {
  /*static WebDriver driver;
@Given("User Launches the Telecom application")
public void user_Launches_the_Telecom_application() {
	 WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
    Hooks.driver.get("http://www.demo.guru99.com/telecom/");
    Hooks.driver.manage().window().maximize();
}
*/
@Given("User click Add Tariff Plan Button")
public void user_click_Add_Tariff_Plan_Button() {
    Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
}

@When("User Need to fill up the fields")
public void user_Need_to_fill_up_the_fields() {
    Hooks.driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("10000");
    Hooks.driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("50");
    Hooks.driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("25");
    Hooks.driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("100");
    Hooks.driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("5");
    Hooks.driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("4");
    Hooks.driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("3");   
}

@When("User Click on the Submit button")
public void user_Click_on_the_Submit_button() {
   Hooks.driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
}

@Then("User Verify the customer Id is generated")
public void user_Verify_the_customer_Id_is_generated() {
   String S1=Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText();
   System.out.println(S1);
   
   Assert.assertEquals("Congratulation you add Tariff Plan", S1);
   
}
@When("User Need to fill up the fields by {int}D List")
public void user_Need_to_fill_up_the_fields_by_D_List(Integer int1,DataTable datas) {
   List<String> details=datas.asList(String.class);
   Hooks.driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(details.get(0));
   Hooks.driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(details.get(1));
   Hooks.driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(details.get(2));
   Hooks.driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(details.get(3));
   Hooks.driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(details.get(4));
   Hooks.driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(details.get(5));
   Hooks.driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(details.get(6));   
}




}