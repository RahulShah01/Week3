package javaWeek3;

public class Equality {

  public static void main(String[] args) {
    
    String a = new String("Hello");
    String b = new String("Hello");
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(a == b); // is false because its not pointing to the same this in memory because even if the value is the same they are different objects.
    System.out.println("equals() method: " + a.equals(b));
    
    
    int x = 5;
    int y = 5;
    
    System.out.println(x);
    System.out.println(y);
    System.out.println(x == y);
    
    String c = new String("Hello");
    String d = c;
    
    System.out.println(c);
    System.out.println(d);
    System.out.println(c == d); // is true because its pointing out to the same object in memory
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
