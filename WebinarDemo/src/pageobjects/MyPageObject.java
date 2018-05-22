package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="ProvarWebsiteDemo"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(id = "first_name")
	public WebElement firstName;
	@TextType()
	@FindBy(id = "last_name")
	public WebElement LastName;
	@TextType()
	@FindByLabel(label = "Company")
	public WebElement company;
	@TextType()
	@FindBy(id = "email")
	public WebElement Email;
	@TextType()
	@FindBy(id = "leadSource")
	public WebElement LeadSource;
	@TextType()
	@FindBy(id = "00N0N00000F5kso")
	public WebElement WhatCanWeHelpYouWith;
	@ButtonType()
	@FindByLabel(label = "SUBMIT")
	public WebElement SubmitBtn;
	@TextType()
	@FindBy(xpath = "//h2")
	public WebElement Result;
			
}
