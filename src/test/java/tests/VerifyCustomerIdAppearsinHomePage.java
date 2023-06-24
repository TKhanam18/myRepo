package tests;

import base.Base;
import org.openqa.selenium.By;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;

public class VerifyCustomerIdAppearsinHomePage extends Base {
    //@Test(priority = 2)
    public void verifyFirstTest() {

        System.out.println("        First TEST");
        //Navigate to URL
        navigate("http://it.microtechlimited.com");
        //Login as Customer
        CustomerLoginPage.loginAsCustomer();
        //-------------------- Customer Home page
        //Verify Test's Home Page
        String customerMsg = getText( CustomerHomePage.labelCustomerMsg );
        //Assert.assertEquals(customerMsg, "Customer Id: 4");
    }

    //@Test(priority = 1)
    public void verifyMySecondTest() {
        System.out.println("        SECOND TEST");
        //Navigate to URL
        navigate("http://it.microtechlimited.com");
        //Login as Customer
        CustomerLoginPage.loginAsCustomer();
        //-------------------- Customer Home page
        //Verify Test's Home Page
        String customerMsg = getText( By.xpath("//h2[contains(text(),'Customer')]") );
        //System.out.println("actual msg: " + customerMsg);
       // Assert.assertEquals(customerMsg, "Customer Id: 4");
    }

}
