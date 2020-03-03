#include<stdio.h>
void readmat(int [][3]);
void printmat(int [][3]);
int checkmat(int [][3]);
void main()
{
    int xo[3][3]={
                    {-1,-1,-1},
                    {-1,-1,-1},
                    {-1,-1,-1}
                 };
    char ch;
    printf("Enter * to start:");
    scanf("%c",&ch);
    if (ch=='*')
    {
        printmat(xo);
        do
        {
            readmat(xo);
            printmat(xo);
        }
            while (checkmat(xo)==0);
    if (checkmat(xo)==1)
        printf("X Wins");
    else
        printf("O Wins");
    }
    else
        printf("Timepass kitna hai re\n");
}
void readmat(int xo[3][3])
{
    char in;
    int i,j,pos,flag=1;
    do
    {
        printf("Put:");
        fflush(stdin);
        scanf("%c",&in);
        if (in=='x'||in=='X'||in=='o'||in=='O')
        {
                printf("in position:");
                scanf("%d",&pos);
        }
        else
        {
            printf("Invalid data\n");
            flag=0;
        }
    }
    while (flag=0);
    switch(pos)
        {
        case 1:if (in=='x'||in=='X')
                    xo[0][0]=1;
                else
                    xo[0][0]=0;
                break;
        case 2:if (in=='x'||in=='X')
                    xo[0][1]=1;
                else
                    xo[0][1]=0;
                break;
        case 3:if (in=='x'||in=='X')
                    xo[0][2]=1;
                else
                    xo[0][2]=0;
                break;
        case 4:if (in=='x'||in=='X')
                    xo[1][0]=1;
                else
                    xo[1][0]=0;
                break;
        case 5:if (in=='x'||in=='X')
                    xo[1][1]=1;
                else
                    xo[1][1]=0;
                break;
        case 6:if (in=='x'||in=='X')
                    xo[1][2]=1;
                else
                    xo[1][2]=0;
                break;
        case 7:if (in=='x'||in=='X')
                    xo[2][0]=1;
                else
                    xo[2][0]=0;
                break;
        case 8:if (in=='x'||in=='X')
                    xo[2][1]=1;
                else
                    xo[2][1]=0;
                break;
        case 9:if (in=='x'||in=='X')
                    xo[2][2]=1;
                else
                    xo[2][2]=0;
                break;
        }
}
void printmat(int xo[3][3])
{
    int i,j;
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
int checkmat(int xo[3][3])
{
    int i,j;
    if (xo[0][0]==xo[0][1]&&xo[0][0]==xo[0][2]&&xo[0][0]==1)
        return 1;
    else if (xo[1][0]==xo[1][1]&&xo[1][0]==xo[1][2]&&xo[1][0]==1)
        return 1;
    else if (xo[2][0]==xo[2][1]&&xo[2][0]==xo[2][2]&&xo[2][0]==1)
        return 1;
    else if (xo[0][0]==xo[1][0]&&xo[1][0]==xo[2][0]&&xo[0][0]==1)
        return 1;
    else if (xo[0][1]==xo[1][1]&&xo[0][1]==xo[2][1]&&xo[0][1]==1)
        return 1;
    else if (xo[0][2]==xo[1][2]&&xo[0][2]==xo[2][2]&&xo[0][2]==1)
        return 1;
    else if (xo[0][0]==xo[1][1]&&xo[0][0]==xo[2][2]&&xo[0][0]==1)
        return 1;
    else if (xo[0][2]==xo[1][1]&&xo[0][2]==xo[2][0]&&xo[0][2]==1)
        return 1;
    else if (xo[0][0]==xo[0][1]&&xo[0][0]==xo[0][2]&&xo[0][0]==0)
        return -1;
    else if (xo[1][0]==xo[1][1]&&xo[1][0]==xo[1][2]&&xo[1][0]==0)
        return -1;
    else if (xo[2][0]==xo[2][1]&&xo[2][0]==xo[2][2]&&xo[2][0]==0)
        return -1;
    else if (xo[0][0]==xo[1][0]&&xo[0][0]==xo[2][0]&&xo[0][0]==0)
        return -1;
    else if (xo[0][1]==xo[1][1]&&xo[0][1]==xo[2][1]&&xo[0][1]==0)
        return -1;
    else if (xo[0][2]==xo[1][2]&&xo[0][2]==xo[2][2]&&xo[0][2]==0)
        return -1;
    else if (xo[0][0]==xo[1][1]&&xo[0][0]==xo[2][2]&&xo[0][0]==0)
        return -1;
    else if (xo[0][2]==xo[1][1]&&xo[0][2]==xo[2][0]&&xo[0][2]==0)
        return -1;
    else
        return 0;
}
