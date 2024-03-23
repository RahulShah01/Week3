package javaWeek3;

public class Week3ClassExample {
  
public static boolean isDivisibleBy(int number, int divisor){
  return (number % divisor == 0);
}  


public static boolean isDivisibleBy15(int number){
 return isDivisibleBy(number, 15);  
}

public static boolean isDivisibleBy5(int number){
  return isDivisibleBy(number, 5);
 }

public static boolean isDivisibleBy3(int number){
  return isDivisibleBy(number, 3); 
 }
 
  
  
  public static void main(String[] args) {
    

  
   for ( int i = 1; i <= 50; i ++) {
       if ( isDivisibleBy(i, 15)) {
       System.out.println("CocaCola");
     } 
       else if (isDivisibleBy3(i)) {
       System.out.println("Cola");
     } 
       else if (isDivisibleBy5(i)) {
       System.out.println("Coca");         
     } 
       else {
       System.out.println(i);
     }
  }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//     
// same example with while loop
// 
//  int i =1;
//  while ( i < =50) {
//    
//    
//   }
   
  // ARRAYS
    
//    String [] names = new String [10];
//    names[0] = "George";
//    names[1] = "Rahul";
//    names[2] = "Britteny";
//    names[3] = "Rahul";
    
//    String[] names = new String [] {
//        "George", "Rahul", "Brettney", "Jason", "Anthony", "Jessica", "Angel", "Kimber", "Eden", "Chris", "Ava"
//    };
//    
//    System.out.println("Length = " + names.length);
//    for(int index = 0; index <= names.length -1 ; index++) {
//      System.out.printf("[%d] %s%n", index, names[index]);
//    }
//    
//    System.out.println("--------------------------------------");
//    
//    
//    for(String name : names) {
//      System.out.println(name);
//    }
//  
//   // Object can have string and numbers and a mixture 
//    
//    Object [] stuff = new Object [] {
//        "Geroge", 48, 8.6
//    };
    
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  }
}
