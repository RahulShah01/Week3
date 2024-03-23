package javaWeek3;

public class week3VideoExamples {

  public static void main(String[] args) {
    
    
    
    String firstName = "Mary";
    String lastName = "Brown";
    int assignmentOne = 100;
    int assignmentTwo = 79;
    int assignmentThree = 80;
    int assignmentFour = 90;
    int assignmentFive = 100;
    
    System.out.println("Student: " + firstName + " " + lastName);
    System.out.println("Grades:");
    System.out.println("1: " + assignmentOne);
    System.out.println("2: " + assignmentTwo);
    System.out.println("3: " + assignmentThree);
    System.out.println("4: " + assignmentFour);
    System.out.println("5: " + assignmentFive);
    
//    String fullName = "Mary" + " " + "Brown";
//    int [] gradeArray = {100, 79, 80, 90, 100};
//    
//    System.out.println("Student: " + fullName);
//    System.out.println("Grades: ");
//    for (int i =0; i < gradeArray.length; i++) {
//      System.out.println((i+1) + ": " + gradeArray[i]);
//    }
    
    // same examples with the enhanced for loop
    
    String fullName = "Mary" + " " + "Brown";
    int [] gradeArray = {100, 79, 80, 90, 100};
    int counter = 1;
    
    System.out.println("Student: " + fullName);
    System.out.println("Grades: ");
    
    for (int grade : gradeArray) {
      System.out.println((counter++) + ":  " + grade);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
