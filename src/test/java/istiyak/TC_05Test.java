package istiyak;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

public class TC_05Test extends BaseTest {

	@Test
	public void TC_05Test() {
		String expectedLogintitle="Demo Web Shop";
		String actualLogintitle = driver.getTitle();
		assertEquals(actualLogintitle, expectedLogintitle,"Login Page is unsuccessful");
		Reporter.log("login successfully with valid user name and password",true);
	}
}
