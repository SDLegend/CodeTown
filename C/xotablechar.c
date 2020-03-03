#include<stdio.h>
void main()
{
    char xo[3][3];
    int i,j;
    for(i=0;i<=2;i++)
        for(j=0;j<=2;j++)
            scanf("%c",&xo[i][j]);
    for(i=0;i<=2;i++)
       {
        for(j=0;j<=2;j++)
            {
                if (j==2)
                    printf("%2c",xo[i][j]);
                else
                    printf("%2c|",xo[i][j]);
            }
        printf("\n");
        if (i!=2)
            printf("--+--+--\n");
        }
}
