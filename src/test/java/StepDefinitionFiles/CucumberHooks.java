package StepDefinitionFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
	
	@Before("@Netbanking")   //Before running every scenario it runs hook
	public void NetBankingSetup()
	{
		System.out.println("Setup entries for NetBanking database");
	}

	@After("@Netbanking")   ///will be running for @NetBanking scenarios only
	public void NetBankingteardown()
	{
		System.out.println("clear the entries for NetBanking database");
	}
	@After //will be running for all scenarios
	public void teardown()
	{
		System.out.println("clear the entries for NetBanking database");
	}
	@Before("@Mortgage")
	public void MortgageSetup()
	{
		System.out.println("Setup entries for Mortgage database");
	}
	
}
