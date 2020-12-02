import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllResultsPage extends ResultsPage{
    public boolean isResultPositionContainsLinkText(int i, String text) {
        List<WebElement> listaWynikow = driver.findElements(By.cssSelector("#rso>div.g h3"));
        if (listaWynikow.get(i-1).getText().equals(text)) {
            return true;
        }
        else
            return false;
    }

    public String getLinkTextFromPosition(int i) {

        List<WebElement> list = driver.findElements(By.cssSelector("#rso>div.g h3"));
        return list.get(i-1).getText();

        //return  driver.findElement(By.cssSelector("#rso>div.g:nth-of-type("+i+") h3")).getText();
    }
}
