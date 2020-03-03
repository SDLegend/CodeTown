#include<stdio.h>
void main()
{
int n,x,y,z;
printf("Enter three digit psitive inter:");
scanf("%d",&n);
if (n>999||n<100)
    printf("Invalid data\n");
else
    {
    x=(n/10)/10;
    y=(n/10)%10;
    z=n%10;
    if (x*x*x+y*y*y+z*z*z==n)
        printf("%d is Armstrong number",n);
    else
        printf("%d is not Armstrong number",n);
    }
}
