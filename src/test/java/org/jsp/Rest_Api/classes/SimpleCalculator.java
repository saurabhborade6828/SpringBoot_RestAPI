package org.jsp.Rest_Api.classes;

import org.springframework.boot.test.context.SpringBootTest;

public class SimpleCalculator 
{
   public int add(int a, int b)
   {
	   return (a+b);
   }

   public void add(int a, int b){
       int c = a + b;
       System.out.println(c);
   }

}
