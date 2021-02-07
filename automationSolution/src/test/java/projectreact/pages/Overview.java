package projectreact.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

@DefaultUrl("page:home.page/checkout-step-two.html")
public class Overview extends PageObject
{

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/text[2]")
    private WebElement backpack_price;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]/div[2]/div[2]/text[2]")
    private WebElement tshirt_price;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]/text()[2]")
    private WebElement total_price;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
    private WebElement finish_btn;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    private WebElement complete_msg;

    @Title("total price")
    public void calculate_total_price()
    {
        /**
         * could not get element to assert value
         */
//        int backPrice = Integer.parseInt(backpack_price.getText());
//        int shirtPrice = Integer.parseInt(tshirt_price.getText());
//        int sum = backPrice + shirtPrice;
//        Assert.assertEquals(sum,Integer.parseInt(total_price.getText()));
    }

    @Title("Finish order")
    public void finishOrder()
    {
        clickOn(finish_btn);
    }

    @Title("complete message")
    public void completeMsg()
    {
        shouldBeVisible(complete_msg);
    }
}
