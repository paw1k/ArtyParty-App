package com.paw.ArtyParty.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity(name = "ART_CUSTOMER")
public class Customer {
    @Id
    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

//    private List<Address> address;
//    private List<CustomerCart> customerCarts;
//    private List<Order> orders;


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
