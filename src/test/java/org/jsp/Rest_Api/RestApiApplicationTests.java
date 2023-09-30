package org.jsp.Rest_Api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jsp.Rest_Api.classes.SimpleCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests 
{
   @Autowired
   private SimpleCalculator calculator;
   
   public void add()
   {
	   int add = calculator.add(7, 5);
	   assertEquals(12, add);
   }
}
