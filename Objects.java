package javaWeek3;

import java.util.Scanner;

public class Objects {

  public static void main(String[] args) {
    
    int age = 34; // is a primitive data type. Its just a piece of data and nothing more. 
    
    
    // all primitive data types are lower case and all objects are upper case. 
    
    String name = "Sally Mae"; // is a object, it has various properties and methods. Any time, you call a method you have to have parentheses. 
    System.out.println(name.length());
    System.out.println(name.charAt(6));
    
    
    Scanner s = new Scanner(System.in);
    
    int [] numbers = new int[3];
    System.out.println(numbers.length);       // over here length is a property so you  don't need any parentheses. 
    
    
    
    
    

  }

}
