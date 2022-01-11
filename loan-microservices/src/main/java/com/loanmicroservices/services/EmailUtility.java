package com.loanmicroservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmailUtility {

	   @Autowired
	   RestTemplate restTemplate;

	   public String sendEmailForApprovedLoan(EmailTemplate email) {
		   
		   String uri="http://localhost:9090/v1/notification/textemail/";
	  //   restTemplate.exchange(uri, HttpMethod.POST, email, String.class).getBody();
	   ResponseEntity<String> data=  restTemplate.postForEntity(uri, email, String.class);
	        return data.getBody(); 
	   }

}
