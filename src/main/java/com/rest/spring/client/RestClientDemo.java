package com.rest.spring.client;

import org.springframework.web.client.RestTemplate;

import com.rest.spring.server.StockQuoteResponse;

public class RestClientDemo {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		
		 String string = restTemplate.getForObject("http://localhost:8080/webservices-restful-spring-demo/hello/Test",
				String.class);
		
		 System.out.println(string);
		 
		StockQuoteResponse stockQuoteResponse = restTemplate.getForObject("http://localhost:8080/webservices-restful-spring-demo/hello/stockQuote/Test",
				StockQuoteResponse.class);
		
		System.out.println(stockQuoteResponse.getFirmName());
		System.out.println(stockQuoteResponse.getStockValue());
		
	}

}
