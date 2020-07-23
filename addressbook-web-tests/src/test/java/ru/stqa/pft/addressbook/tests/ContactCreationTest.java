package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Ivanov", "Petr", "Moscow, Petrovka 38", "mail1@mail.ru", "79020000001"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().ReturnToHomePage();

  }

}
