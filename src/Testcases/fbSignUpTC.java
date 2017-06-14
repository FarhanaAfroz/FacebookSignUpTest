package Testcases;

import org.testng.annotations.Test;

import base.configuration;
import locators.fbSignupLocators;
import values.fbSignupValues;

public class fbSignUpTC extends configuration {
	fbSignupLocators fbSignupl = new fbSignupLocators ();
	fbSignupValues   fbSignupv = new fbSignupValues ();

	
	
	@Test
	public void signUp (){
		
		// type first name
		typeByXpath (fbSignupl.fbfirstnameLocator, fbSignupv.firstnameValue);
		// type last name
		typeByXpath (fbSignupl.fblastnameLocator, fbSignupv.lastnameValue);
		// type email
		typeByXpath (fbSignupl.fbemailLoactor, fbSignupv.emailValue);
		//type email confirmation
		typeByXpath (fbSignupl.fbconfemailLocator, fbSignupv.confemailValue);
		// type password
		typeByXpath (fbSignupl.fbpasswordLoactor, fbSignupv.passwordValue);
		//select month from drop down
		dropdownMonth(fbSignupl.fbddMonthLoactor, fbSignupv.ddMonthValue);
		//select day from drop down
		dropdownDay(fbSignupl.fbddDayLoactor, fbSignupv.ddDayValue);
		//select year from drop down
		dropdownYear(fbSignupl.fbddYearLoactor, fbSignupv.ddYearValue);
		//select female radio button
		radioButton(fbSignupl.fbRBtnFemaleLocator, fbSignupl.fbRBtnMaleLocator);
		
		
		
		
		// click on login button
		clickByXpath (fbSignupl.fbCreateAccountLocator);
		
		
	}

}
