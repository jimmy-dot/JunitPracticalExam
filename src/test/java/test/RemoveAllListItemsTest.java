package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.RemoveButtonPage;
import Page.ToggleAllboxPage;
import Util.BrowserFactory;

public class RemoveAllListItemsTest {
	WebDriver driver;
	
	@Test
	public void RemoveAlllistItems() {
		
		driver = BrowserFactory.launchBrowser();

		ToggleAllboxPage ToggleAllCheckBox = PageFactory.initElements(driver, ToggleAllboxPage.class);
		ToggleAllCheckBox.clickToggleAllBoxField();

//		RemoveButtonPage remove = PageFactory.initElements(driver, RemoveButtonPage.class);
//		remove.clickRemoveButton();

	}

}
