import java.util.*;
public class Sum
{
    public static void main(String args[])
    {
         int a,b,sum;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter first number:");
         a=sc.nextInt();
         System.out.print("Enter second number:");
         b=sc.nextInt();
         sum=a+b;
         System.out.print("The sum of two number:"+sum);
    }
}