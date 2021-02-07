package projectreact.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:home.page/checkout-step-one.html")
public class Checkout extends PageObject
{
    @FindBy(xpath = "//*[@id=\"contents_wrapper\"]/div[2]")
    private WebElement checkout_header;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    private WebElement firstname_input;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    private WebElement lastname_input;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    private WebElement postalCode_input;

    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
    private WebElement continue_btn;

    @Title("fill in details")
    public void capture_details(String firstname, String lastname, String code)
    {
        shouldBeVisible(checkout_header);
        typeInto(firstname_input,firstname);
        typeInto(lastname_input, lastname);
        typeInto(postalCode_input,code);
        waitABit(2000);
    }

    @Title("click continue")
    public void click_continueBtn()
    {
        clickOn(continue_btn);
        waitABit(2000);
    }
}
