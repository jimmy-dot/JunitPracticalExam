package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.RemoveButtonPage;
import Page.RemoveSingleListItemPage;
import Util.BrowserFactory;

public class RemoveSingleListItemTest {
	WebDriver driver;
	
	@Test
	public void RemoveSingleListItem() {

		driver = BrowserFactory.launchBrowser();

		RemoveSingleListItemPage RemoveSingleListItem = PageFactory.initElements(driver,
				RemoveSingleListItemPage.class);
		RemoveButtonPage remove = PageFactory.initElements(driver, RemoveButtonPage.class);
	
		RemoveSingleListItem.clickSingleItemCheckBox();
		remove.clickRemoveButton();
		
			
	}

}
