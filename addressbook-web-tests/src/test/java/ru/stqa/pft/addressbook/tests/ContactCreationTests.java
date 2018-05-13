package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

     @Test
     public void testContactCreation() {
         app.getNavigationHelper().goToContactPage();
         app.getGroupHelper().fillContactForm(new ContactData("Hanna", "Kondratiuk", "Ingenico", "anutaaks@gmail.com"));
         app.getGroupHelper().submitContactCreation();

     }


}
