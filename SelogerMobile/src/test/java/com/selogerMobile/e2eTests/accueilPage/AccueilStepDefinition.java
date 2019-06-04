package com.selogerMobile.e2eTests.accueilPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;


import com.selogerMobile.e2eTests.utility.Hook;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AccueilStepDefinition {
	
private WebDriver driver;
	
	public AccueilStepDefinition() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^Ouvrir l application$")
	public void ouvrir_l_application() throws Throwable {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@index='1']")).click();
		Thread.sleep(2000);

	}
	
	@And("^Verifier la page Accueil$")
	public void verifier_la_page_Accueil() throws Throwable {
	    
		String TextHomePage = driver.findElement(By.xpath("//*[@index='1']")).getText();
		System.out.println(TextHomePage);
		Assert.assertTrue(TextHomePage.contains("Que recherchez-vous ?"));
	}

	@When("^Cliquer sur le bouton Acheter$")
	public void cliquer_sur_le_bouton_Acheter() throws Throwable {
	    
		driver.findElement(By.xpath("//*[@text='Acheter']")).click();
		Thread.sleep(5000);
	}
	
	@When("^Cliquer sur ville$")
	public void cliquer_sur_ville() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Ville, adresse, métro, quartier...']")).click();
		Thread.sleep(5000);
	}

	@When("^saisir la ville$")
	public void saisir_la_ville() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Ville, adresse, métro, quartier…']")).sendKeys("paris");
		Thread.sleep(2000);
	   
	}

	@When("^Choisir la locatlité$")
	public void choisir_la_locatlité() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Paris - 75']")).click();
		Thread.sleep(3000);
	}

	@When("^cliquer sur suivant$")
	public void cliquer_sur_suivant() throws Throwable {
		driver.findElement(By.xpath("//*[@text='SUIVANT']")).click();
		Thread.sleep(2000);
		
	}
	
	@When("^taper sur suivant$")
	public void taper_sur_suivant() throws Throwable {
		driver.findElement(By.xpath("//*[@text='SUIVANT']")).click();
		Thread.sleep(2000);
	}

	@When("^taper encore sur suivant$")
	public void taper_encore_sur_suivant() throws Throwable {
		driver.findElement(By.xpath("//*[@text='SUIVANT']")).click();
		Thread.sleep(5000);
	}

	@When("^cliquer sur terminer$")
	public void cliquer_sur_terminer() throws Throwable {
		driver.findElement(By.xpath("//*[@text='TERMINER']")).click();
		Thread.sleep(2000);
	}


	/*************************/
	
	@Then("^la page principale s'affiche$")
	public void la_page_principale_s_affiche() throws Throwable {
		System.out.println("La page de 'Acheter' s'affiche");
	}

	@When("^Cliquer sur j'ai compris$")
	public void cliquer_sur_j_ai_compris() throws Throwable {
		driver.findElement(By.xpath("//*[@index='4']")).click();
		Thread.sleep(3000);
	}

	@When("^Cliquer sur Compte$")
	public void cliquer_sur_Compte() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Compte']")).click();
		Thread.sleep(3000);
	}
	
	@When("^cliquer sur Seconnecter$")
	public void cliquer_sur_Seconnecter() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Informations personnelles']")).click();
		Thread.sleep(3000);
	}

	@Then("^redirection vers la page de connexion$")
	public void redirection_vers_la_page_de_connexion() throws Throwable {
		System.out.println("La page de connexion s'affiche");
	}
	
	@When("^saisir adresse email$")
	public void saisir_adresse_email() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Adresse email']")).sendKeys("chaima2.mosbehi@gmail.com");
		Thread.sleep(2000);
	}

	@When("^Saisir le mot de passe$")
	public void saisir_le_mot_de_passe() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Mot de passe']")).sendKeys("Seloger2019");
		Thread.sleep(2000);
	}

	@When("^Cliquer sur connectez-vous$")
	public void cliquer_sur_connectez_vous() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Connectez-vous']")).click();
		Thread.sleep(3000);
	}
	
	@Then("^retour à la page principale de connexion$")
	public void retour_à_la_page_principale_de_connexion() throws Throwable {
		System.out.println("La page principale de connexion s'affiche");
		Thread.sleep(3000);
	}
}