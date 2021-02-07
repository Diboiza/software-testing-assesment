package projectreact.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import projectreact.pages.*;

@RunWith(SerenityRunner.class)
public class MyStepdefs
{
    @Steps
    Homepage homepage;
    Products products;
    Cart cart;
    Checkout checkout;
    Overview overview;

    @Given(": I launch the swag labs website")
    public void i_launch_the_swag_labs_website()
    {
        homepage.navigate_to_homepage();
        homepage.i_am_on_the_homepage();
    }

    @When(": I enter a valid {string} and {string}")
    public void i_enter_a_valid_and(String username, String password)
    {
        homepage.enter_username_and_password(username,password);
    }

    @Then(": I should be successfully logged in")
    public void i_should_be_successfully_logged_in()
    {
        homepage.verify_i_am_logged_in();
    }

    @And(": I add two products to a cart")
    public void iAddTwoProductsToACart()
    {
        products.add_product_to_cart();
    }

    @And(": I verify that the correct products are added and checkout")
    public void iVerifyThatTheCorrectProductsAreAddedAndCheckout()
    {
        products.click_cartBtn();
        cart.confirm_correct_products_are_added();
        cart.click_checkout_btn();
    }

    @And(": I fill in my {string} and {string} and {string}")
    public void iFillInMyAndAnd(String firstname, String lastname, String code)
    {
        checkout.capture_details(firstname, lastname, code);
    }

    @And(": I click on continue")
    public void iClickOnContinue()
    {
        checkout.click_continueBtn();
    }

    @And(": I verify the total price")
    public void iVerifyTheTotalPrice()
    {
        overview.calculate_total_price();
    }

    @And(": I finish the order")
    public void iFinishTheOrder()
    {
        overview.finishOrder();
    }

    @Then(": My order should be completed")
    public void myOrderShouldBeCompleted()
    {
        overview.completeMsg();
    }
}
