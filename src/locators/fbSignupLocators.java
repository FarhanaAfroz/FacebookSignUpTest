package locators;

public class fbSignupLocators {
	
	// Facebook Signup userInfo
		public String fbfirstnameLocator = "//input[@name='firstname']";
		public String fblastnameLocator = "//input[@name='lastname']";
		public String fbemailLoactor ="//input[@name='reg_email__']";
		public String fbconfemailLocator = "//input[@name='reg_email_confirmation__']";
		public String fbpasswordLoactor = "//input[@name= 'reg_passwd__']";
		
		//Facebook Signup drop down list
		public String fbddMonthLoactor = "//select[@id='month']";
		public String fbddDayLoactor = "//select[@id='day']";
		public String fbddYearLoactor = "//select[@id='year']";
		
		//Facebook Signup radio button for gender
		public String fbRBtnFemaleLocator = "//input[@value='1']";
		public String fbRBtnMaleLocator = "//input[@value='2']";
		
		
		// buttons
		public String fbCreateAccountLocator = "//button[@name='websubmit']";


}
