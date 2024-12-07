import java.util.*;
class Minimum
{
  public static void main(String args[])
  {
    int a[]={50,40,80,20,10,60};
    int min=a[0];
    for (int i=1;i<a.length;i++)
    {
      if(a[i]<min)
      {
         min=a[i];
      }
    }
    System.out.println("Minimum element in array is:"+min);
  }
}