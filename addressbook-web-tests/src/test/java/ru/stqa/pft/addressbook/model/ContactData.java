package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String lastname;
  private final String firstname;
  private final String address;
  private final String email;
  private final String phonehome;

  public ContactData(String lastname, String firstname, String address, String email, String phonehome) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.address = address;
    this.email = email;
    this.phonehome = phonehome;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getPhonehome() {
    return phonehome;
  }
}
