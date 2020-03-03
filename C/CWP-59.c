#include<stdio.h>
void main()
{
int i,j,k;
for(i=1;i<=6;i++)
    {
    for(k=0;k<12-2*i;k++)
        printf(" ");
    for(j=i;j<=2*i-1;j++)
        printf("%2d",j%10);
    for(j=2*i-2;j>=i;j--)
        printf("%2d",j%10);
    printf("\n");
    }
}
