package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleViewFirstName;
	
	@And("verify FirstName")
	public ViewLead verifyFirstName() {
		// TODO Auto-generated method stub
		verifyExactText(eleViewFirstName, temp);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='frameSectionExtra'])[2]/a[3]")
	private WebElement eleEditBtn;
	
	@And("click edit button")
	public CRM clickEditBtn() {
		click(eleEditBtn);
		return new CRM();		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteBtn;
	
	@And("click delete button")
	public MyLeads clickDeleteBtn() {
		click(eleDeleteBtn);
		return new MyLeads();		
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	
	@Then("verify the updated company name as (.*)")
	public ViewLead verifyCompanyName(String companyNameNew){
	verifyPartialText(eleCompanyName, companyNameNew);
	return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLeadBtn;
	
	@And("click Duplicate Lead button")
	public DuplicateLead clickDuplicateLeadBtn() {
		click(eleDuplicateLeadBtn);
		return new DuplicateLead();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadLink;
	
	@And("click FindLead link")
	public FindLeads clickFindLeadLink() {
		click(eleFindLeadLink);
		return new FindLeads();		
	}


	
	
	
	
	
}
	
	
	
	


