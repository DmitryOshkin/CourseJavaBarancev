package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends BaseHelper {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void ReturnToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitAddContact() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("firstname"),contactData.getFirstname());
    type(By.name("address"),contactData.getAddress());
    type(By.name("email"),contactData.getEmail());
    type(By.name("home"),contactData.getPhonehome());
    }

  public void initAddContact() {
    click(By.linkText("add new"));
  }
}
