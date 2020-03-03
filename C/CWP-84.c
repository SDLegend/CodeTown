#include<stdio.h>
int main()
{
int n,r;
unsigned long int nf,rf,nrf;
unsigned long int factorial(int);
printf("Enter value of n and r");
scanf("%d %d",&n,&r);
if (n<0||r<0||n<r)
    printf("Invalid data\n");
else
    {
    nf=factorial(n);
    rf=factorial(r);
    nrf=factorial(n-1);
    printf("Answer=%lu",nf/(rf*nrf));
    }
return 0;
}
unsigned long int factorial(int n)
{
unsigned long int fact=1;
int i;
for(i=1;i<=n;i++)
    fact=fact*i;
return fact;
}
