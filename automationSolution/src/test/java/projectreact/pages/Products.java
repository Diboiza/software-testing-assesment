package projectreact.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:home.page/inventory.html")
public class Products extends PageObject
{
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
    private WebElement backpack_cartBtn;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")
    private WebElement tshirt_cartBtn;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement cart_btn;

    @Title("Add products to cart")
    public void add_product_to_cart()
    {
        clickOn(backpack_cartBtn);
        waitABit(2000);
        clickOn(tshirt_cartBtn);
    }

    @Title("click on cart button")
    public void click_cartBtn()
    {
        clickOn(cart_btn);
        waitABit(2000);
    }

}
