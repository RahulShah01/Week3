package javaWeek3;

public class CocaColaExample {

  public static void main(String[] args) {
    
    for (int i = 0; i <= 50; i ++) {
      if (i % 15 == 0) {
        System.out.println("CocaCola");
      } else if (i % 3 == 0) {
        System.out.println("Coca");
      } else if (i % 5 == 0) {
        System.out.println("Cola");
      } else {
        System.out.println(i);
      }
    }
  }

}
