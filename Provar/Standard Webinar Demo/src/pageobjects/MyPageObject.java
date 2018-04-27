package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Geraint"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(id = "first_name")
	public WebElement FirstName;
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
	@FindBy(id = "phone")
	public WebElement Phone;
	@ChoiceListType(values = { @ChoiceListValue(value = "Afghanistan"), @ChoiceListValue(value = "Albania"),
			@ChoiceListValue(value = "Algeria"), @ChoiceListValue(value = "American Samoa"),
			@ChoiceListValue(value = "Andorra"), @ChoiceListValue(value = "Angola"),
			@ChoiceListValue(value = "Anguilla"), @ChoiceListValue(value = "Antarctica"),
			@ChoiceListValue(value = "Antigua and Barbuda"), @ChoiceListValue(value = "Argentina"),
			@ChoiceListValue(value = "Armenia"), @ChoiceListValue(value = "Aruba"),
			@ChoiceListValue(value = "Australia"), @ChoiceListValue(value = "Austria"),
			@ChoiceListValue(value = "Azerbaijan"), @ChoiceListValue(value = "Bahamas"),
			@ChoiceListValue(value = "Bahrain"), @ChoiceListValue(value = "Bangladesh"),
			@ChoiceListValue(value = "Barbados"), @ChoiceListValue(value = "Belarus"),
			@ChoiceListValue(value = "Belgium"), @ChoiceListValue(value = "Belize"), @ChoiceListValue(value = "Benin"),
			@ChoiceListValue(value = "Bermuda"), @ChoiceListValue(value = "Bhutan"),
			@ChoiceListValue(value = "Bolivia"), @ChoiceListValue(value = "Bosnia and Herzegovina"),
			@ChoiceListValue(value = "Botswana"), @ChoiceListValue(value = "Brazil"),
			@ChoiceListValue(value = "Brunei Darussalam"), @ChoiceListValue(value = "Bulgaria"),
			@ChoiceListValue(value = "Burkina Faso"), @ChoiceListValue(value = "Burundi"),
			@ChoiceListValue(value = "Cambodia"), @ChoiceListValue(value = "Cameroon"),
			@ChoiceListValue(value = "Canada"), @ChoiceListValue(value = "Cape Verde"),
			@ChoiceListValue(value = "Cayman Islands"), @ChoiceListValue(value = "Central African Republic"),
			@ChoiceListValue(value = "Chad"), @ChoiceListValue(value = "Chile"), @ChoiceListValue(value = "China"),
			@ChoiceListValue(value = "Christmas Island"), @ChoiceListValue(value = "Cocos (Keeling) Islands"),
			@ChoiceListValue(value = "Colombia"), @ChoiceListValue(value = "Comoros"),
			@ChoiceListValue(value = "Congo"), @ChoiceListValue(value = "Cook Islands"),
			@ChoiceListValue(value = "Costa Rica"), @ChoiceListValue(value = "Croatia"),
			@ChoiceListValue(value = "Cuba"), @ChoiceListValue(value = "Cyprus"),
			@ChoiceListValue(value = "Czech Republic"), @ChoiceListValue(value = "Denmark"),
			@ChoiceListValue(value = "Djibouti"), @ChoiceListValue(value = "Dominica"),
			@ChoiceListValue(value = "Dominican Republic"), @ChoiceListValue(value = "Ecuador"),
			@ChoiceListValue(value = "Egypt"), @ChoiceListValue(value = "El Salvador"),
			@ChoiceListValue(value = "Equatorial Guinea"), @ChoiceListValue(value = "Eritrea"),
			@ChoiceListValue(value = "Estonia"), @ChoiceListValue(value = "Ethiopia"),
			@ChoiceListValue(value = "Falkland Islands"), @ChoiceListValue(value = "Faroe Islands"),
			@ChoiceListValue(value = "Fiji"), @ChoiceListValue(value = "Finland"), @ChoiceListValue(value = "France"),
			@ChoiceListValue(value = "French Guiana"), @ChoiceListValue(value = "French Polynesia"),
			@ChoiceListValue(value = "French Southern Territories"), @ChoiceListValue(value = "Gabon"),
			@ChoiceListValue(value = "Gambia"), @ChoiceListValue(value = "Georgia"),
			@ChoiceListValue(value = "Germany"), @ChoiceListValue(value = "Ghana"),
			@ChoiceListValue(value = "Gibraltar"), @ChoiceListValue(value = "Great Britain"),
			@ChoiceListValue(value = "Greece"), @ChoiceListValue(value = "Greenland"),
			@ChoiceListValue(value = "Grenada"), @ChoiceListValue(value = "Guadeloupe"),
			@ChoiceListValue(value = "Guam"), @ChoiceListValue(value = "Guatemala"), @ChoiceListValue(value = "Guinea"),
			@ChoiceListValue(value = "Guinea-Bissau"), @ChoiceListValue(value = "Guyana"),
			@ChoiceListValue(value = "Haiti"), @ChoiceListValue(value = "Holy See"),
			@ChoiceListValue(value = "Honduras"), @ChoiceListValue(value = "Hong Kong"),
			@ChoiceListValue(value = "Hungary"), @ChoiceListValue(value = "Iceland"), @ChoiceListValue(value = "India"),
			@ChoiceListValue(value = "Indonesia"), @ChoiceListValue(value = "Iran"), @ChoiceListValue(value = "Iraq"),
			@ChoiceListValue(value = "Ireland"), @ChoiceListValue(value = "Israel"), @ChoiceListValue(value = "Italy"),
			@ChoiceListValue(value = "Ivory Coast"), @ChoiceListValue(value = "Jamaica"),
			@ChoiceListValue(value = "Japan"), @ChoiceListValue(value = "Jordan"),
			@ChoiceListValue(value = "Kazakhstan"), @ChoiceListValue(value = "Kenya"),
			@ChoiceListValue(value = "Kiribati"), @ChoiceListValue(value = "Kosovo"),
			@ChoiceListValue(value = "Kuwait"), @ChoiceListValue(value = "Kyrgyzstan"), @ChoiceListValue(value = "Lao"),
			@ChoiceListValue(value = "Latvia"), @ChoiceListValue(value = "Lebanon"),
			@ChoiceListValue(value = "Lesotho"), @ChoiceListValue(value = "Liberia"), @ChoiceListValue(value = "Libya"),
			@ChoiceListValue(value = "Liechtenstein"), @ChoiceListValue(value = "Lithuania"),
			@ChoiceListValue(value = "Luxembourg"), @ChoiceListValue(value = "Macau"),
			@ChoiceListValue(value = "Macedonia"), @ChoiceListValue(value = "Madagascar"),
			@ChoiceListValue(value = "Malawi"), @ChoiceListValue(value = "Malaysia"),
			@ChoiceListValue(value = "Maldives"), @ChoiceListValue(value = "Mali"), @ChoiceListValue(value = "Malta"),
			@ChoiceListValue(value = "Marshall Islands"), @ChoiceListValue(value = "Martinique"),
			@ChoiceListValue(value = "Mauritania"), @ChoiceListValue(value = "Mauritius"),
			@ChoiceListValue(value = "Mayotte"), @ChoiceListValue(value = "Mexico"),
			@ChoiceListValue(value = "Micronesia"), @ChoiceListValue(value = "Moldova"),
			@ChoiceListValue(value = "Monaco"), @ChoiceListValue(value = "Mongolia"),
			@ChoiceListValue(value = "Montenegro"), @ChoiceListValue(value = "Montserrat"),
			@ChoiceListValue(value = "Morocco"), @ChoiceListValue(value = "Mozambique"),
			@ChoiceListValue(value = "Myanmar, Burma"), @ChoiceListValue(value = "Namibia"),
			@ChoiceListValue(value = "Nauru"), @ChoiceListValue(value = "Nepal"),
			@ChoiceListValue(value = "Netherlands"), @ChoiceListValue(value = "Netherlands Antilles"),
			@ChoiceListValue(value = "New Caledonia"), @ChoiceListValue(value = "New Zealand"),
			@ChoiceListValue(value = "Nicaragua"), @ChoiceListValue(value = "Niger"),
			@ChoiceListValue(value = "Nigeria"), @ChoiceListValue(value = "Niue"),
			@ChoiceListValue(value = "North Korea"), @ChoiceListValue(value = "Northern Mariana Islands"),
			@ChoiceListValue(value = "Norway"), @ChoiceListValue(value = "Oman"), @ChoiceListValue(value = "Pakistan"),
			@ChoiceListValue(value = "Palau"), @ChoiceListValue(value = "Palestinian territories"),
			@ChoiceListValue(value = "Panama"), @ChoiceListValue(value = "Papua New Guinea"),
			@ChoiceListValue(value = "Paraguay"), @ChoiceListValue(value = "Peru"),
			@ChoiceListValue(value = "Philippines"), @ChoiceListValue(value = "Pitcairn Island"),
			@ChoiceListValue(value = "Poland"), @ChoiceListValue(value = "Portugal"),
			@ChoiceListValue(value = "Puerto Rico"), @ChoiceListValue(value = "Qatar"),
			@ChoiceListValue(value = "Reunion Island"), @ChoiceListValue(value = "Romania"),
			@ChoiceListValue(value = "Russian Federation"), @ChoiceListValue(value = "Rwanda"),
			@ChoiceListValue(value = "Saint Kitts and Nevis"), @ChoiceListValue(value = "Saint Lucia"),
			@ChoiceListValue(value = "Saint Vincent and the Grenadines"), @ChoiceListValue(value = "Samoa"),
			@ChoiceListValue(value = "San Marino"), @ChoiceListValue(value = "Sao Tome and Principe"),
			@ChoiceListValue(value = "Saudi Arabia"), @ChoiceListValue(value = "Senegal"),
			@ChoiceListValue(value = "Serbia"), @ChoiceListValue(value = "Seychelles"),
			@ChoiceListValue(value = "Sierra Leone"), @ChoiceListValue(value = "Singapore"),
			@ChoiceListValue(value = "Slovakia"), @ChoiceListValue(value = "Slovenia"),
			@ChoiceListValue(value = "Solomon Islands"), @ChoiceListValue(value = "Somalia"),
			@ChoiceListValue(value = "South Africa"), @ChoiceListValue(value = "South Korea"),
			@ChoiceListValue(value = "South Sudan"), @ChoiceListValue(value = "Spain"),
			@ChoiceListValue(value = "Sri Lanka"), @ChoiceListValue(value = "Sudan"),
			@ChoiceListValue(value = "Suriname"), @ChoiceListValue(value = "Swaziland"),
			@ChoiceListValue(value = "Sweden"), @ChoiceListValue(value = "Switzerland"),
			@ChoiceListValue(value = "Syria"), @ChoiceListValue(value = "Taiwan"),
			@ChoiceListValue(value = "Tajikistan"), @ChoiceListValue(value = "Tanzania"),
			@ChoiceListValue(value = "Thailand"), @ChoiceListValue(value = "Tibet"),
			@ChoiceListValue(value = "Timor-Leste"), @ChoiceListValue(value = "Togo"),
			@ChoiceListValue(value = "Tokelau"), @ChoiceListValue(value = "Tonga"),
			@ChoiceListValue(value = "Trinidad and Tobago"), @ChoiceListValue(value = "Tunisia"),
			@ChoiceListValue(value = "Turkey"), @ChoiceListValue(value = "Turkmenistan"),
			@ChoiceListValue(value = "Turks and Caicos Islands"), @ChoiceListValue(value = "Tuvalu"),
			@ChoiceListValue(value = "Uganda"), @ChoiceListValue(value = "Ukraine"),
			@ChoiceListValue(value = "United Arab Emirates"), @ChoiceListValue(value = "United Kingdom"),
			@ChoiceListValue(value = "United States (Alaska Time)"),
			@ChoiceListValue(value = "United States (Central Time)"),
			@ChoiceListValue(value = "United States (Eastern Time)"),
			@ChoiceListValue(value = "United States (Hawaii-Aleutian Time)"),
			@ChoiceListValue(value = "United States (Mountain Time)"),
			@ChoiceListValue(value = "United States (Pacific Time)"), @ChoiceListValue(value = "Uruguay"),
			@ChoiceListValue(value = "Uzbekistan"), @ChoiceListValue(value = "Vanuatu"),
			@ChoiceListValue(value = "Vatican City"), @ChoiceListValue(value = "Venezuela"),
			@ChoiceListValue(value = "Vietnam"), @ChoiceListValue(value = "Virgin Islands"),
			@ChoiceListValue(value = "Wallis and Futuna Islands"), @ChoiceListValue(value = "Western Sahara"),
			@ChoiceListValue(value = "Yemen"), @ChoiceListValue(value = "Zambia"),
			@ChoiceListValue(value = "Zimbabwe") })
	@FindBy(id = "country")
	public WebElement Location;
	@TextType()
	@FindBy(id = "leadSource")
	public WebElement LeadSource;
	@TextType()
	@FindBy(id = "00N0N00000F5kso")
	public WebElement Description;
	@ButtonType()
	@FindByLabel(label = "SUBMIT")
	public WebElement SubmitBtn;
			
}
