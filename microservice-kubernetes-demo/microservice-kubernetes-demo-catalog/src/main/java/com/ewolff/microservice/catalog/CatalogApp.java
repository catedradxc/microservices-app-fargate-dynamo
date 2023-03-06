package com.ewolff.microservice.catalog;

import javax.annotation.PostConstruct;

import com.ewolff.microservice.catalog.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@EnableAutoConfiguration
@Component
public class CatalogApp {

	public static void main(String[] args) {
		SpringApplication.run(CatalogApp.class, args);
	}

}
