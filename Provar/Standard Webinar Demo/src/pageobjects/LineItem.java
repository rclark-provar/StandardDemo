package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Line Item"                                
               , summary=""
               , connection="Richard"
               , lightningComponent="LineItem"
               , namespacePrefix=""
     )             
public class LineItem {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value = '{!v.lineItem.Quantity}']")
	public WebElement Quantity;
	
}
