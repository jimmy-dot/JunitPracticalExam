package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RemoveAllListItemsPage {
	WebDriver driver;

	public RemoveAllListItemsPage(WebDriver driver) {

		this.driver = driver;
		ToggleAllboxPage ToggleAllCheckBox = PageFactory.initElements(driver, ToggleAllboxPage.class);
		ToggleAllCheckBox.clickToggleAllBoxField();

	}

}
