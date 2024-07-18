package com.vunh;

import lombok.Getter;

import java.util.Random;

public class SELENIUM_UTIL {
    @Getter
    public enum OPTION {
        KEY("webdriver.chrome.driver"),
        VALUE("D:\\FPT_POLY\\SOF304\\Code\\Lab6Test\\chromedriver.exe"),
        URL("http://localhost:8080/"),
        USER("admin"),
        COPYRIGHT("Nong Hoang Vu - Lab 6"),
        SLEEP("1500"),
        CODE(SELENIUM_UTIL.generateRandomCode()),
        NAME(SELENIUM_UTIL.generateRandomProductName()),
        EXIT("3000"),
        HTML_BODY("/html/body");
        private final String value;

        OPTION(String value) {
            this.value = value;
        }
    }

    @Getter
    enum XPATH {
        INPUT_LOGIN_USERNAME("//*[@id=\"check-admin\"]/div[1]/input"),
        INPUT_LOGIN_PASSWORD("//*[@id=\"check-admin\"]/div[2]/input"),
        BUTTON_LOGIN("//*[@id=\"loginButton\"]"),
        MENU_PRODUCT("/html/body/div[1]/ul/li[4]/a"),
        MENU_LIST_PRODUCT("/html/body/div[1]/ul/li[4]/ul/li[1]/a"),
        BUTTON_NEW_PRODUCT("/html/body/main/div/div/div/div[1]/a"),
        INPUT_ID_PRODUCT("//*[@id=\"maSanPham\"]"),
        INPUT_NAME_PRODUCT("//*[@id=\"tenSanPham\"]"),
        OPTION_CLICK("//*[@id=\"danhMuc\"]"),
        SET_STATUS("//*[@id=\"trangThai\"]"),
        SAVE_PRODUCT("//*[@id=\"newProductPost\"]/div/div[5]/button"),
        CLICK_OK_NOTIFICATION("/html/body/div[3]/div/div[4]/div/button"),
        SEND_KEY_TO_SEARCH("/html/body/main/div/div/div/form/div/div/div/div[1]/div/input"),
        BUTTON_SEARCH_CLICK("//*[@id=\"btnSearch\"]"),
        CLICK_MENU("/html/body/div[1]/ul/li[3]/a"),
        CLICK_SELL("/html/body/div[1]/ul/li[3]/ul/li[1]/a"),
        CLICK_FIRST_INVOICE("/html/body/main/div/div/div[1]/div[1]/div[1]/div/div[1]/table/tbody/tr[1]/td[4]/a"),
        CLICK_AVATAR("/html/body/main/div/nav/div[2]/div/img"),
        CLICK_LOGOUT("/html/body/main/div/nav/div[2]/ul/li[2]/a"),
        SET_COPYRIGHT("//*[@id=\"check-admin\"]/div[1]/input"),
        SELECT_CATEGORY("//*[@id=\"danhMuc\"]/option[" + SELENIUM_UTIL.generateRandomNumber() + "]");
        private final String xpath;

        XPATH(String xpath) {
            this.xpath = xpath;
        }
    }

    public static String generateRandomCode() {
        Random random = new Random();
        int codeLength = random.nextInt(6) + 5;
        StringBuilder code = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < codeLength; i++) {
            int index = random.nextInt(characters.length());
            code.append(characters.charAt(index));
        }
        return code.toString();
    }

    public static String generateRandomProductName() {
        Random random = new Random();
        int nameLength = random.nextInt(11) + 10;
        StringBuilder name = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
        for (int i = 0; i < nameLength; i++) {
            int index = random.nextInt(characters.length());
            name.append(characters.charAt(index));
        }
        return name.toString();
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(8) + 2;
    }
}
