package com.paw.ArtyParty.DTO;

import java.util.List;
public class CustomerDTO {
    private String emailId;
    private String name;
    private String password;
    private String phoneNumber;

//    private List<AddressDTO> addresses;
//    private List<CustomerCartDTO> customerCarts;
//    private String errorMessage;


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
