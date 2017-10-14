package com.rest.spring.server;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestServerDemo {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String sayHello(@PathVariable String name) {
		return "Hello " + name;

	}

	
	@RequestMapping(value = "/stockQuote/{firmName}", method = RequestMethod.GET)
	public StockQuoteResponse getStockQuote(@PathVariable String firmName) {
		StockQuoteResponse response = new StockQuoteResponse();
		response.setFirmName(firmName);
		response.setStockValue(100);
		return response;

	}

	
}
