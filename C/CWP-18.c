#include<stdio.h>
void main()
{
int n;
printf("Enter one positive integer:");
scanf("%d",&n);
if (n%7==0)
    printf("%d is divisible by 7",n);
else
    printf("%d is not divisible by 7",n);
}
