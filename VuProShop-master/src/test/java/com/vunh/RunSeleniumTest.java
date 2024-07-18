package com.vunh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunSeleniumTest {
    private WebDriver hacker;

    @BeforeEach void setup() { this.hacker = new ChromeDriver();
        System.setProperty(SELENIUM_UTIL.OPTION.KEY.getValue(), SELENIUM_UTIL.OPTION.VALUE.getValue()); this.hacker.get(SELENIUM_UTIL.OPTION.URL.getValue());
    }

    @Test void createNewProductTest() throws InterruptedException {
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.INPUT_LOGIN_USERNAME.getXpath())).sendKeys(SELENIUM_UTIL.OPTION.USER.getValue());
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.INPUT_LOGIN_PASSWORD.getXpath())).sendKeys(SELENIUM_UTIL.OPTION.USER.getValue());
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.BUTTON_LOGIN.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.MENU_PRODUCT.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.MENU_LIST_PRODUCT.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.BUTTON_NEW_PRODUCT.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.INPUT_ID_PRODUCT.getXpath())).sendKeys(SELENIUM_UTIL.OPTION.CODE.getValue());
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.INPUT_NAME_PRODUCT.getXpath())).sendKeys(SELENIUM_UTIL.OPTION.NAME.getValue());
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.OPTION_CLICK.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.SELECT_CATEGORY.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.SET_STATUS.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.SAVE_PRODUCT.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.CLICK_OK_NOTIFICATION.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.SEND_KEY_TO_SEARCH.getXpath())).sendKeys(SELENIUM_UTIL.OPTION.CODE.getValue());
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.BUTTON_SEARCH_CLICK.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.CLICK_MENU.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.CLICK_SELL.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.CLICK_FIRST_INVOICE.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.CLICK_AVATAR.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.CLICK_LOGOUT.getXpath())).click();
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.SLEEP.getValue())); this.hacker.findElement(By.xpath(SELENIUM_UTIL.XPATH.SET_COPYRIGHT.getXpath())).sendKeys(SELENIUM_UTIL.OPTION.COPYRIGHT.getValue());
        Thread.sleep(Integer.parseInt(SELENIUM_UTIL.OPTION.EXIT.getValue())); this.hacker.close();
    }
}
