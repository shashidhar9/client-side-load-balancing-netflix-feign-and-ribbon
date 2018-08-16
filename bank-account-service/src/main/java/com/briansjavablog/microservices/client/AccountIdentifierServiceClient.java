package com.briansjavablog.microservices.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.briansjavablog.microservices.bankaccountservice.model.AccountIdentifier;

@FeignClient(name="account-identifier-service", url = "${account-identifier-service.url}")
//@RibbonClient(name="account-identifier-service")
public interface AccountIdentifierServiceClient {
	
	@GetMapping(path = "accountType/{accountType}")
	public AccountIdentifier getAccountIdentifier(@PathVariable("accountType") String accountType);
	
}