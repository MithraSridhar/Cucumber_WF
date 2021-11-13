package stepdefinitions;

import io.cucumber.java.en.When;
import pages.BooksPage;
import wrappers.GenericWrappers;

public class BooksSteps  extends GenericWrappers{
	
	BooksPage booksPage=new BooksPage();

	@When("Click search result as \"([^\"]*)\"$")
	public void click_search_result_as_Git(String searchText) {
		booksPage.clickSearchResult(searchText);
	   
	}
}
