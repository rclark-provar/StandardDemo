package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Richard"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"toastMessage\")]")
	public WebElement toastMessage;
			
}
