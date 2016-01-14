package ru.spb.herzen.ivt3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App
{
    public static void main( String[] args )
    {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.herzen.spb.ru/main/");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);

        WebElement element;
        try {
            element = driver.findElement(By.className("news_header_link"));

            System.out.println("Page title: " + driver.getTitle() + ".");
            System.out.println("Page URL: " + driver.getCurrentUrl() + ".");

            element.click();
            System.out.println();

            System.out.println("Page title after click: " + driver.getTitle() + ".");
            System.out.println("Page URL after click: " + driver.getCurrentUrl() + ".");
        } catch(Exception e){
            System.out.println("Element not found");
        }

        driver.quit();
    }
}