package org.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Seleniumtests {

    WebDriver driver = null;

    @BeforeTest
    public void beforetest(){
        System.out.println("this is beforetest");
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", );
    }
    @Test (priority = 1)

    public void firsttest() {
        int i = 100;
        assert 2 < i;
    }

        @Test (priority = 0)

                public void Secondtest (){
            int i = 100;
                    assert 2 < i;

        }





}
