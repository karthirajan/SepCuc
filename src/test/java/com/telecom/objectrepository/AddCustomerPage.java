package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonactions;

public class AddCustomerPage extends Commonactions{
	
	public AddCustomerPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement addCustomerButton;
	
	@FindBy(xpath = "(//label[@for='done'])[1]")
	private WebElement doneButton;
	
	@FindBy(id = "fname")
	private WebElement fname;
	
	@FindBy(id = "lname")
	private WebElement lname;
	
	@FindBy(id = "email")
	private WebElement mail;
	
	@FindBy(name = "addr")
	private WebElement add;
	
	@FindBy(id = "telephoneno")
	private WebElement phno;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement submitButton;

	public WebElement getAddCustomerButton() {
		return addCustomerButton;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}
	
@FindBys({
	@FindBy(xpath = "//input[@id='email']"),
	@FindBy(name = "email")
})
private WebElement andOperator;

@FindAll({
	@FindBy(xpath = "//input[@id='email']"),
	@FindBy(name = "email")
})
private WebElement orOperator;
	
	
}
