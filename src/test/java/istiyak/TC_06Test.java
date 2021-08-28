package istiyak;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import objectRepositiry.CartPage;
import objectRepositiry.ChekoutPage;
import objectRepositiry.HomePage;

public class TC_06Test extends BaseTest {

	@Test
	public void TC_06Test() {
		HomePage homePage=new HomePage(driver);
		homePage.getCartLink().click();
		CartPage cartpage=new CartPage(driver);
		cartpage.getCheckBox().click();
		cartpage.getCheckout().click();
		ChekoutPage chekoutPage=new ChekoutPage(driver);
		SelectClassUtil select=new SelectClassUtil();
		select.selectDropDownByVisibleText(chekoutPage.getCountrylistbox(), countryoption);
		chekoutPage.getBilingCity().sendKeys(city);
		chekoutPage.getBillingAddress().sendKeys(adresss1);
		chekoutPage.getBillingZipCode().sendKeys(postalcode);
		chekoutPage.getBillingPhoneNumber().sendKeys(phoneNo);
		chekoutPage.getBillingcontinueButton().click();
		chekoutPage.getShippingContinueButton().click();
		chekoutPage.getShippingMethodContinueButton().click();
		chekoutPage.getPaymentMethodcontinueButton().click();
		chekoutPage.getPaymentInfoContinueButton().click();
		chekoutPage.getConfirmOrderButton().click();
		String confirmatiomMessage=chekoutPage.getThankYouMessage().getText();
		assertEquals(confirmatiomMessage, comfirmMessage,"order is not confirmed");
		Reporter.log("order is placed successfully with valid shippng adress",true);
	}
}
