import java.util.*;
class IncrementAndDecrement
{
  public static void main(String []args)
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the element:");
       int a=sc.nextInt();
       System.out.println(++a);
       System.out.println(a++);
       System.out.println(--a);
       System.out.println(a--);    
  }
}