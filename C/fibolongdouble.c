
#include<stdio.h>
void main()
{
   int count,i,j,count1=2;
   long double c;
   long double a=0.0;
   long double b=1.0;
   printf("%Lf \n",a);
       printf("%Lf \n",b);
       printf("%Lf \n\n\n",c);
   for(i=1;i<10;i++)
   {
       printf("%d\n",i);
       printf("%Lf \n",a);
       printf("%Lf \n",b);
       printf("%Lf \n\n\n",c);

      c=a+b;
      a=b;
      b=c;
      //printf("%Lf\t",c);
      //printf("\n %Lf \n",c);
   }

   printf("\n1000th digit fibo number is %Lf",c);
   printf("\nindex of numers is %d",count1);
}
