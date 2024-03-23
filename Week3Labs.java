package javaWeek3;

public class Week3Labs {

  public static void main(String[] args) {
    
    
    //
    // Arrays:
    //
    
    // 1. Create an array with the following values 1, 5, 2, 8, 13, 6

        int [] array = {1, 5, 2, 8, -3, 13, 6};
    
    // 2. Print out the first element in the array

     //   System.out.println(array[0]);
    
    // 3. Print out the last element in the array without using the number 5
        
    //    System.out.println(array[array.length -1]);
    
    
    // 4. Print out the element in the array at position 6, what happens?

     //    System.out.println(array[6]);
    
    // 5. Print out the element in the array at position -1, what happens?

      //   System.out.println(array[-1]); 
        
    // 6. Write a traditional for loop that prints out each element in the array
         for ( int i = 0; i < array.length ; i++) {
           System.out.println(array[i]);
         }

        
    // 7. Write an enhanced for loop that prints out each element in the array

         for (int number : array) {
           System.out.println(number);
         }
    
    // 8. Create a new variable called sum, write a loop that adds 
    //          each element in the array to the sum
         
         double sum = 0;
         for (int number : array) {
          sum = sum + number;
         } System.out.println(sum);

        
    // 9. Create a new variable called average and assign the average value of the array to it
         
         double average = sum / array.length;
          System.out.println(average);
          
    // 10. Write an enhanced for loop that prints out each number in the array only if the number is odd
          
          for (int number : array) {
            if (number%2 != 0) {
              System.out.println(number);
            }
          }

    
    // 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
          
             String [] names = {"Sam", "Sally", "Thomas", "Robert"};
    
    // 12. Calculate the sum of all the letters in the new array
              for (String name : names) {
              System.out.println(name);
              }
    
             int sumOfLetter = 0;
             for (String name : names) {
              sumOfLetter += name.length();
             } System.out.println(sumOfLetter);
              
                          

              
    //
    // Methods:
    //
    
    // 13. Write and test a method that takes a String name and prints out a greeting.  This method returns nothing.
              
             greet("Tom");
             greet("Sally");

    
    
    // 14. Write and test a method that takes a String name and  returns a greeting.  Do not print in the method.

               greet2("Nick");
               String greeting = greet2("Nick");
               System.out.println(greeting);
    
    // Compare method 13 and method 14:  
    //      a. Analyze the difference between these two methods.
    //      b. What do you find? 
    //      c. How are they different?
    
    
    // 15. Write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
               
          
    
    // 16. Write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
    
     //        System.out.println(doesArrayContainString(names, "Sam"));
    
    // 17. Write and test a method that takes an array of int and returns the smallest number in the array

       //      System.out.println(smallestNumber(array));
             
    // 18. Write and test a method that takes an array of double and returns the average
    
       //      System.out.println(isStringLongerThanNumber("Hello", 3));
             
             double [] doubles = {45.5, 30.2, 67.2};
             average(doubles);
             System.out.println(average(doubles));
    

    // 19. Write and test a method that takes an array of Strings and returns an array of int where each element  matches the length of the string at that position
             
             

            
    // 20. Write and test a method that takes an array of strings and 
    //          returns true if the sum of letters for all strings with an even amount of letters
    //          is greater than the sum of those with an odd amount of letters.


    // 21. Write and test a method that takes a string and  returns true if the string is a palindrome

    
    
  }

// Method 13:

  public static void greet(String name) {
    System.out.println("Hello, " + name);
  }

// Method 14:

  public static String greet2(String name) {
    return "Hi, " + name;
  }
  

// Method 15:

  public static boolean isStringLongerThanNumber(String string, int number) {
    return (string.length() > number); }
     

// Method 16:

  public static boolean doesArrayContainString (String [] array, String string) {
    for (String str : array) {
      if (str.equals(string)) {
        return true;
      }
    }
    return false;
  }
  

// Method 17:

  public static int smallestNumber(int [] numbers) {
    int smallest = numbers [0];
    for (int number : numbers) {
      if (number < smallest) {
        smallest = number;
      }
    }
    return smallest;
  }
  

// Method 18:

  public static double average(double [] array) {
    double sum = 0;
    for (double number : array) {
      sum += number;
    } return sum /array.length;
  }

// Method 19:

      
    
  }

// Method 20:


// Method 21:




  
  



