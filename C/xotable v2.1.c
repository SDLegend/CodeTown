#include<stdio.h>
void main()
{
    int xo[3][3]={{-1,-1,-1},
                  {-1,-1,-1},
                  {-1,-1,-1}
                 };
    int i,j;
    for(i=0;i<=2;i++)
        for(j=0;j<=2;j++)
            scanf("%d",&xo[i][j]);
    for(i=0;i<=2;i++)
       {
        for(j=0;j<=2;j++)
            {
                if (j==2)
                    if (xo[i][j]==1)
                        printf(" X");
                    else if (xo[i][j]==0)
                        printf(" O");
                    else
                        printf("  ");
                else
                    if (xo[i][j]==1)
                        printf(" X|");
                    else if (xo[i][j]==0)
                        printf(" O|");
                    else
                        printf("  |");
                }
        printf("\n");
        if (i!=2)
            printf("--+--+--\n");
        }
}
