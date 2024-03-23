package javaWeek3;

public class MethodExampleFromTuesday {
 /**
  * Calculate the total of all values
  * @param numbers the numbers of total
  * @return the total of all number
  */
  
  public static int calculateTotal(int[] numbers) {
    int total = 0;
    for (int number : numbers) {
     total += number;
    }
    return total;
  }
  
  
  public static double calculateAverage(int[] numbers) {
    int total = 0;
    for (int number : numbers) {
     total += number;
    }
    return calculateTotal(numbers)/ (double) numbers.length;
  }
    
  
  
  
  
  
  
  public static void main(String[] args) {
    
        
 //   write a method that will calculate the total of the value in an array of integers
    
    
    int [] values = new int [] {
      10, 45, 934, 34, 5, 9, 978, 500, 300, 220, 29
    };
    
    int total = calculateTotal(values);
    System.out.println(total);
    
    
    double average = calculateAverage(values);
    System.out.println("Average is: " + average);
    
    
  }

}
