#include<stdio.h>
int main()
{
int n,i,fact=1;
printf("Enter one non-negative integer");
scanf("%d",&n);
if (n<0) printf("Invalid data\n");
else
    {
    for(i=1;i<=n;i++)
        fact=fact*i;
    }
    printf("Factorial of %d is %d",n,fact);
}
