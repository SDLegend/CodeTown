#include<stdio.h>
void main()
{
int i,j,k;
for(i='E';i>='A';i--)
    {
    for(j='A';j<=i;j++)
        printf("%2c",j);
    printf("\n");
    }
}
