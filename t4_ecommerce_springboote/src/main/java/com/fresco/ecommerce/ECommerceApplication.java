package com.fresco.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}
//	@Bean
//	  public CommandLineRunner dataLoader(CartProductRepo cartProductrepo) {
//	    return new CommandLineRunner() {
//	      @Override
//	      public void run(String... args) throws Exception {
////	        repo.save(new Student("kks", "kks@gmail.com"));
////	        repo.save(new Student("ram", "ram@gmail.com"));
//	      }
//	    };
//	  }
	
}
