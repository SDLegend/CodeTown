#include<stdio.h>
int main()
{
int n,i,sum=0;
printf("Enter one positive integer");
scanf("%d",&n);
if (n<=0)
    printf("Invalid data");
else
    {
    for(i=1;i<=(2*n-1);i=i+2)
        sum=sum+i;
    }
    printf("Sum is %d",sum);
return 0;
}
