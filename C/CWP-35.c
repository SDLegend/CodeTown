#include<stdio.h>
int main()
{
int n,i,sum=0;
printf("Enter one positive integer");
scanf("%d",&n);
if (n<=0) printf("Invalid data");
else
{
    for(i=1;i<=n;i++)
   {

    if (i%2==0)
        sum=sum-i;
    else sum=sum+i;
   }
printf("Sum=%d",sum);
}
return 0;
}
