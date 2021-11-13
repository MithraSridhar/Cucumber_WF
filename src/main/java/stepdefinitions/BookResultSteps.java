package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.BookResultPage;
import wrappers.GenericWrappers;

public class BookResultSteps  extends GenericWrappers{

	BookResultPage bookResultPage = new BookResultPage();
	
	@Then("Get title of the book")
	public void get_title_of_the_book() {
		bookResultPage.getTitle();
	}
	@Then("Click logout")
	public void click_logout() {
		bookResultPage.clickLogOut();
		driver.close();
	}


}
