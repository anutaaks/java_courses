package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test

    public  void testContactModification (){

        app.getGroupHelper().selectContact();
        app.getGroupHelper().initContactModification();
        app.getGroupHelper().fillContactForm(new ContactData("Hanna1", "Kondratiuk1", "Ingenico", "anutaaks@gmail.com"));
        app.getGroupHelper().submitContactModification();
    }
}
