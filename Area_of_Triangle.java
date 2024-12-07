import java.util.*;
public class Area_of_triangle
{
   public static void main(String args[])
   {
      int bredth,hight;
      float area;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Bredth:");
      bredth=sc.nextInt();
      System.out.print("Enter the Hight:");
      hight=sc.nextInt();
      area=(bredth*hight)/2;
      System.out.print("Area of triangle:"+area);
   }
}