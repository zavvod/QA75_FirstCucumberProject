package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters correct data")
    public void enters_correct_data() {
        new LoginPage(driver).enterData("zava@gmail.com","52290Zava!");
    }

    @And("User clicks on Yalla button")
    public void clicks_on_Yalla() {
        new LoginPage(driver).clickOnYalla();
    }

    @Then("User verifies Success message is displayed")
    public void verifu_Success_message() {
        new LoginPage(driver).verifyMessage("Logged in success");
    }

    @And("User enters correct email and wrong botton")
    public void enter_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongData(table);
    }

    @Then("User verifies Error message is displayed")
    public void verify_Error(){
        new LoginPage(driver).verifyMessage("Login or Password incorrect");

    }


}

