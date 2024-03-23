package javaWeek3;

public class Array {

  public static void main(String[] args) {
    
//    String studentName1 ="Tom Sawyer";
//    String studentName2 ="Jack Smith";
//    String studentName3 ="Bill Turner";
//    
//    System.out.println(studentName1);
//    System.out.println(studentName2);
//    System.out.println(studentName3);
//    
//    String[] students = new String[3];
//    
//    students[0] = "Tom Sawyer";
//    students[1] = "Jack Smith";
//    students[2] = "Bill Turner";
//   
//  //  System.out.println(students[0]);
//  //  System.out.println(students[1]);
//  //  System.err.println(students[2]);
//    
//    for (int i =0; i < students.length; i ++) {
//      System.out.println(students[i]);
//    }
//    
//    // to print out every element in an array ==> enhanced for loop ==> will perform an iteration for each element inside the array 
//    
//    System.out.println("Echanced for loop");
//    for (String student : students) {
//      System.out.println(student);
//    }
    
    // string array
//    
//    String [] products = new String [5];
//    products [0] = "Carrots";
//    products [1] = "Pineapple";
//    products [2] = "Tomatoes";
//    products [3] = "Potatoes";
//    products [4] = "Cereal";
//    
//    for(String groceryList : products) {
//      System.out.println("Product: " + groceryList);
//    }
    
    // integer array
//    

  //  int [] multiplesOf3 =  new int[10];
    
//    for(int i = 1; i <= multiplesOf3.length; i++) {
//      multiplesOf3[i -1] = i*3;
//      System.out.println("number: " + multiplesOf3[i-1]);
//    }
//    
    
//   

    // Methods 
    
    String firstName = "Bob";
    String lastName = "Ross";
    String fullName = createFullName(firstName, lastName);
    String fullName2 = createFullName("Sam", lastName);
     System.out.println(fullName);
     System.out.println(fullName2);
  }
  
  public static String createFullName(String x, String y) {
    String fullName = x + " " + y;
    return fullName;
    // or you can just write return x + " " + y
  }
  
  }


