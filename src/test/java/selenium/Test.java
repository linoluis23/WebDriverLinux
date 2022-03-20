//implementacion de pasos de los escenarios de prueba

package selenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test {

    //private ChromeDriver driver;
    private WebDriver driver= Driver.getDriver();
    @Given("Usuario se encuentra en {string}")
    public void usuario_se_encuentra_en(String string) {
        System.out.println("inicio prueba");
    }

    @When("ingreso usuario {string}")
    public void ingreso_usuario(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement user = driver.findElement(By.id("user-name"));
        user.click();
        // driver.findElement(By.id("user-name")).clear();
        user.clear();
        user.sendKeys("standard_user");
    }

    @When("ingreso password {string}")
    public void ingreso_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        driver.findElement(By.id("password")).click();
        // driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("preciono boton {string}")
    public void preciono_boton(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        driver.findElement(By.id("login-button")).click();
    }

    @Then("debera mostrar la pagina principal")
    public void debera_mostrar_la_pagina_principal() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement paginaPrincipal = driver.findElement(By.className("title"));
        Assert.assertTrue("Error: No se tiene pagina principal", paginaPrincipal.isDisplayed());
        Assert.assertEquals("PRODUCTS",paginaPrincipal.getText());
    }

    @Then("Inicio de sesion exitoso")
    public void inicio_de_sesion_exitoso() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}


/*
selectores:
By element =
By.id
By.name
By.classname
By.xpath
By.linkText
By.TagName
By.cssSelector
 */