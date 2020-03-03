#include<stdio.h>
void main()
{
int i,j,x=1,n;
printf("Enter one positive integer:");
scanf("%d",&n);
for(i=1;i<=n;i++)
    {
    for(j=1;(j<=i&&x<=n);j++)
        {
        printf("%3d",x);
        x++;
        }
    printf("\n");
    }
}
