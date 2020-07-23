package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class AddNewContactTest extends TestBase {

  @Test
  public void testAddNewContact() throws Exception {

    app.getContactHelper().initAddContact();
    app.getContactHelper().fillContactForm(new ContactData("Ivanov", "Petr", "Moscow, Petrovka 38", "mail1@mail.ru", "79020000001"));
    app.getContactHelper().submitAddContact();
    app.getContactHelper().ReturnToHomePage();

  }

}
