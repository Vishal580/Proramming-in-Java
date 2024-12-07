import java.util.*;
class Maximum
{
  public static void main(String args[])
  {
     int a[]={50,20,40,60,80,30};
     int max=a[0];
     for(int i=1;i<a.length;i++)
     {
       if(a[i]>max)
       {
          max=a[i];
       }
     }
     System.out.println("Maximum element in array:"+max);
  }
}