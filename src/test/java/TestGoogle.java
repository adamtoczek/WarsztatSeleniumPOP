import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestGoogle {
    @Before
    public void setUp () {
        WebDriverManager.chromedriver().setup();


        Strona.driver = new ChromeDriver();
        Strona.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @After
    public void cleanUp() throws InterruptedException {


        Strona.driver.close();
    }

    @Test
    public void test1 () {
        SearchPage sp = new SearchPage();
        sp.openSearchPage();
        assertTrue(sp.popUpisClosed());
    }

    @Test
    public void test2() {
        SearchPage sp = new SearchPage();
        sp.openSearchPage();
        AllResultsPage allResPage = sp.enterTextandSubmit("Selenium");

        assertTrue(allResPage.isResultPositionContainsLinkText(1, "Selenium WebDriver"));
        assertEquals("Link pod pozycja 4 nie jest tym co sie spodziewamy", "Selenium (software) -", allResPage.getLinkTextFromPosition(4));
        allResPage.nav.clickImages();

    }

}
