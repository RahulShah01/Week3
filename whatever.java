package javaWeek3;

import java.io.Console;
import java.util.Arrays;

public class whatever {

  public static void main(String[] args) {
   
    
//    int[] numbers = {1,2,3,4,5};
//    int sum = 0;
//    for(int i = 0; i < numbers.length; i++) { 
//       sum = sum + numbers[i];
//    } System.out.println(sum); 
//    
//
//    int[] number = {1, 2, 3, 4, 5};
//    int firstNumber = number[4];
//    System.out.println(firstNumber);
    
    
//    int[] numbers = {1,2,3,4,5}; 
//    for(int i = 0; i < numbers.length; i++) {
//      System.out.println(numbers[i]); }
    
//    int[] arr = { 3, 7, 0, 4, -6, 10, 55 };
//      arr [0] = 1;
//      arr [6] = 1;
//      for(int i = 0; i < arr.length; i++) {
//        System.out.println(arr[i]); }
  
  // String userWord = "Hello";
//  char[] letter = new char[5];
//    for (int i = 0; i < userWord.length(); i++) {
//      System.out.println(letter[i]); }
//  
   
    
//    int[] arr = new int[5];
//    for ( int i = 1; i <= 5; i++){
//        arr[i - 1] = i;
//    }
//    System.out.println(arr[2]);
    
//    String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
//    String [] newArr = {"word1", "word2", "word3"};
//    for (String name : arr)
//    {
//        System.out.println(name);
//    }
//    for (String name : newArr)
//    {
//         System.out.println(name);
//    }
  
//    int[] arr = {1, 2, 3, 4, 5};
//    int[] reverseArr = {5, 4, 3, 2, 1};
//    for (int i =0; i <= arr.length; i++) 
//    {
//    System.out.println(arr[i]);
//    }
//            for ( int j =0; j <= reverseArr.length; j++)
//    {
//    System.out.println(reverseArr[j]);
//    }
  
  
           
       System.out.println(concatenate("cat", 4));  
            
            
  //  System.out.println(power(3 , 4));        
  
  
  }
 
//  public static int power(int base , int exponent) {
//    int result = 1;
//    for (int index =1; index <= exponent; index ++) {
//      result = result * base ;
//    }
//    return result; 
 // }
  
  
  public static String concatenate(String word, int number) {
   String result = "";
   for (int index =1; index <= number; index ++) {
     result = result + word;
   }
     return result;
  

  
  }
}
  

