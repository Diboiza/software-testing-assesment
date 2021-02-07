package projectreact.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:home.page/cart.html")
public class Cart extends PageObject
{
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement backpack_link;

    @FindBy(xpath = "//*[@id=\"item_1_title_link\"]/div")
    private WebElement tshirt_link;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
    private WebElement checkout_Btn;

    @Title("Confirm correct products are added to cart")
    public void confirm_correct_products_are_added()
    {
        shouldContainText(backpack_link.getText());
        shouldContainText(tshirt_link.getText());
    }

    @Title("click checkOut btn")
    public void click_checkout_btn()
    {
        clickOn(checkout_Btn);
        waitABit(2000);
    }
}
