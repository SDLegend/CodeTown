#include<stdio.h>
void main()
{
    int xo[3][3];
    int i,j;
    for(i=0;i<=2;i++)
        for(j=0;j<=2;j++)
            scanf("%d",&xo[i][j]);
    for(i=0;i<=2;i++)
       {
        for(j=0;j<=2;j++)
            {
                if (j==2)
                    printf("%2d",xo[i][j]);
                else
                    printf("%2d|",xo[i][j]);
            }
        printf("\n");
        if (i!=2)
            printf("--+--+--\n");
        }
}
