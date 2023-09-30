package org.jsp.Rest_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.jsp.Rest_Api.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AddressBookResource 
{
	
    ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();
	
	
   @GetMapping("/{id}")
   public Contact getContact(@PathVariable String id)
   {
	   return contacts.get(id);
   }
   
   @GetMapping("/")
   public List<Contact> getAllContacts()
   {
	   return new ArrayList<Contact>(contacts.values());
   }
   
   @PostMapping("/")
   public Contact addContact(@RequestBody Contact contact)
   {
	   contacts.put(contact.getId(), contact);
	   return contact;
   }
   
}
