import java.util.*;
public class Area_of_rectangle
{
  public static void main(String args[])
  {
     float len,bre,area;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Length:");
     len=sc.nextInt();
     System.out.print("Enter the Breadth:");
     bre=sc.nextInt();
     area=len*bre;
     System.out.print("Area of rectangle:"+area);
  }
}