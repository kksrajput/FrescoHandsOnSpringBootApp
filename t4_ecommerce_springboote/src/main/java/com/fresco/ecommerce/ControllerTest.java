package com.fresco.ecommerce;

import static org.junit.Assert.assertEquals;

import java.util.ListIterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fresco.ecommerce.repo.CartProductRepo;
import com.fresco.ecommerce.repo.CartRepo;
import com.fresco.ecommerce.repo.CategoryRepo;
import com.fresco.ecommerce.repo.ProductRepo;
import com.fresco.ecommerce.repo.UserRepo;

@RestController
public class ControllerTest {
	@Autowired
	CartRepo cartRepo;
	@Autowired
	CategoryRepo categoryRepo;
	@Autowired
	ProductRepo productRepo;
	@Autowired
	UserRepo userRepo;
	@Autowired
	CartProductRepo cpRepo;

	@GetMapping("/check")
	public String check() throws JsonProcessingException, ParseException {
		String[] users = { "","jack", "bob", "apple", "glaxo" };
		for (ListIterator<?> it = ((JSONArray) new JSONParser()
				.parse(new ObjectMapper().writeValueAsString(userRepo.findAll()))).listIterator();
				it.hasNext();) 
		{
			System.out.println(((JSONObject) it.next()).get("username").toString());
			System.out.println(it.nextIndex());
			
			System.out.println(((JSONObject) it.next()).get("username").toString().equals(users[it.nextIndex()]));
			
//			assertEquals(users[it.nextIndex()], ((JSONObject) it.next()).get("username").toString());
//			assertEquals("pass_word", ((JSONObject) it.next()).get("password").toString());
		}
		return "s" ;
	}

}
