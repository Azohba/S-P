package pages;

import org.openqa.selenium.By;
import utils.BaseActions;

public class HomePage extends BaseActions {

    public void clickHrefLink(String link){
        By testLink = By.xpath("//*[@href='/"+link+"']");
        clickWithAction(testLink);
    }

}