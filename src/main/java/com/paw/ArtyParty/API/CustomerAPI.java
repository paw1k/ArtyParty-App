package com.paw.ArtyParty.API;

import com.paw.ArtyParty.DTO.CustomerDTO;
import com.paw.ArtyParty.Exception.ArtyException;
import com.paw.ArtyParty.Service.CustomerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/customer-api")
public class CustomerAPI {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private Environment environment;

//    static Log logger = LogFactory.getLog(CustomerAPI.class);

    @PostMapping(value = "/customers")
    public ResponseEntity<String> registerCustomer (@RequestBody CustomerDTO customerDTO) throws ArtyException {

//        logger.info("Customer trying to register. Customer Email ID: " + customerDTO.getEmailId());

        String registeredWithEmailID = customerService.registerNewCustomer(customerDTO);

        registeredWithEmailID = environment.getProperty("CustomerAPI.CUSTOMER_REGISTRATION_SUCCESS") + registeredWithEmailID;

        return new ResponseEntity<>(registeredWithEmailID, HttpStatus.OK);
    }
}
