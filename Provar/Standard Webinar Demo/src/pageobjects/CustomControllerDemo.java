package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="CustomControllerDemo"                                
               , summary=""
               , connection="Richard"
               , lightningComponent="CustomControllerDemo"
               , namespacePrefix=""
     )             
public class CustomControllerDemo {

	@TextType()
	@AuraBy(componentXPath = "//lightning:formattedNumber[@value = '{!v.OpportunityTotal}']")
	public WebElement OppTotal;

	@PageRow()
	public static class LineItems {
		public LineItem lineItem;
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.lineItems']")
	@PageTable(firstRowContainsHeaders = false, row = LineItems.class)
	public List<LineItems> lineItems;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
