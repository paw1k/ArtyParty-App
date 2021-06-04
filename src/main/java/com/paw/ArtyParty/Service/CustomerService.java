package com.paw.ArtyParty.Service;

import com.paw.ArtyParty.DTO.CustomerDTO;
import com.paw.ArtyParty.Entity.Customer;
import com.paw.ArtyParty.Exception.ArtyException;
import com.paw.ArtyParty.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "customerService")
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public String registerNewCustomer(CustomerDTO customerDTO) throws ArtyException{

        String registeredWithEmailId = null;

        boolean isEmailNotAvailable = customerRepository.findById(customerDTO.getEmailId().toLowerCase()).isEmpty();

        boolean isPhoneNumberNotAvailable = customerRepository.findByPhoneNumber(customerDTO.getPhoneNumber()).isEmpty();

        if(isEmailNotAvailable){
            if(isPhoneNumberNotAvailable){
                Customer customer = new Customer();
                customer.setEmailId(customerDTO.getEmailId());
                customer.setName(customerDTO.getName());
                customer.setPassword(customerDTO.getPassword());
                customer.setPhoneNumber(customerDTO.getPhoneNumber());
                customerRepository.save(customer);
                registeredWithEmailId = customer.getEmailId();
            }else{
                throw new ArtyException("CustomerService.PHONE_NUMBER_ALREADY_IN_USE");
            }
        }else{
            throw new ArtyException("CustomerService.EMAIL_ID_ALREADY_IN_USE");
        }
        return registeredWithEmailId;
    }
}
