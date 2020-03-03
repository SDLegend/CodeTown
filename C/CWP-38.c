#include<stdio.h>
void main()
{
int n1,n2,gcd=1,i,lcm,min;
printf("Enter two postive integer:");
scanf("%d %d",&n1,&n2);
min=(n1<n2)?n1:n2;
for(i=2;i<=min;i++)
    {
    if (n1%i==0&&n2%i==0)
        gcd=i;
    }
lcm=(n1*n2)/gcd;
printf("GCD=%d\n",gcd);
printf("LCM=%d",lcm);
}
