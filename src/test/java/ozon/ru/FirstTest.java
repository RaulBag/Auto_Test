package ozon.ru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {


    @Test
    public void FirstTest() {
        driver.get("https://www.ozon.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("OZON — интернет-магазин. Миллионы товаров по выгодным ценам"));

    }
    @Test
    public void FirstTest2() {
                driver.get("https://www.ozon.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("OZON — интернет-магазин. Миллионы товаров по выгодным ценам"));
            }

    }

