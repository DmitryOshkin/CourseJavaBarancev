package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() throws Exception {

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectedContacts();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ivanov", "Petr", "Moscow, Petrovka 38", "mail1@mail.ru", "79020000001"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().ReturnToHomePage();

  }

}
