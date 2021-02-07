package projectreact.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:home.page")
public class Homepage extends PageObject
{
    @FindBy(xpath = "/html/body/div[1]")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement username_input;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password_input;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement login_btn;

    @FindBy(xpath = "//*[@id=\"inventory_filter_container\"]/div")
    private WebElement products_logo;

    @Title("Launch browser and navigate to the Swaglabs homepage")
    public void navigate_to_homepage()
    {
        open();
        waitABit(3000);
    }

    @Title("Assert I am on the homepage")
    public void i_am_on_the_homepage()
    {
        shouldBeVisible(logo);
    }

    @Title("Login")
    public void enter_username_and_password(String username, String password)
    {
        typeInto(username_input, username);
        typeInto(password_input, password);
        clickOn(login_btn);
    }

    @Title("Verify i am on the products page")
    public void verify_i_am_logged_in()
    {
        shouldBeVisible(products_logo);
    }
}
