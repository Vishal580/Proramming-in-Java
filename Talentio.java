#include <stdio.h>

#include<math.h>

int main()

{

  int a,b,c;

  scanf("%d%d%d",&a,&b,&c);

  double radius;

  float s=((a+b+c)*1.0)/2.0;

  radius=sqrt((s-a)*(s-b)*(s-c)/s);

  printf("Radius=%.2f",radius);

 



            return 0;

}