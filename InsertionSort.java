import java.util.*;
public class InsertionSort
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array:");
      int n=sc.nextInt();
      int a=new int[n];
      System.out.println("Enter the array element:");
      for(int i=0;i<a.length;i++)
      {
           a[i]=sc.nextInt();
      }
      {
        for(i=0;i<n;i++)
        {
          key=a[i];
          j=i-1;
        }
        while(j>=0 && a[j]>key)
        {
           a[j+1]=a[j];
           j--;
        }
        a[j+1]=key;
      }
      for(i=0;i<n;i++)
      {
          System.out.println("The sorted array is:"+a[j+1]);
      }
   }
}