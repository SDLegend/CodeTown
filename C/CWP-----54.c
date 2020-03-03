#include<stdio.h>
void main()
{
int i,j;
for(i=1;i<=9;i+=2)
    {
    for(j=(i+1)/2;j<=i;j++)
        printf("%2d",j);
    printf("\n");
    }
}
