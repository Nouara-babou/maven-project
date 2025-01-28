package com.example;

import java.lang.Math;
/**
* this is a defaut Class constructor
*/

public class Greeter {

 public int v1 = 0;
  public String nom = "Alice";
 
  /**
  * this in contructor
  */
 
  public Greeter() {
   // contructeur par défaut
  }

   public void doSomeThing() {
     System.out.println("hello je suis moi");
   // do no thing yet !
  }
   public void doSomeThing2() {
    System.out.println("hello je suis moi");
   // do no thing yet !
  }
    public void doSomeThing3() {
   // do no thing yet !
      System.out.println("hello je suis moi");
  }
 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
   return String.format("Hello World, %s!", someone);
   
 }
}
