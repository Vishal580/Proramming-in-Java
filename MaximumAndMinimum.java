import java.util.*;
class MaximumAndMinimum
{
  public static void main(String args[])
  {
     int a[]={60,30,50,40,80,100,90,20};
     int max=a[0];
     int min=a[0];
     for(int i=1;i<a.length;i++)
     {
          if(a[i]>0)
          {
               max=a[i];
          }
          if(a[j]<0)
          {
               min=a[j];
          }
     }
     System.out.println("Maximum element in array is:"+max);
     System.out.println("Minimum element in array is:"+min);
  }
}
