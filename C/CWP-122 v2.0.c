#include<stdio.h>
void main()
{
int i,j,k,m1,n1,m2,n2;
int a[10][10],b[10][10],c[10][10];
printf("Enter order   of first matrix\n");
scanf("%d %d",&m1,&n1);
printf("Enter order of second matrix\n");
scanf("%d %d",&m2,&n2);
if (n1==m2)
    {
    printf("Enter elements of first matrix\n");
    for(i=0;i<m1;i++)
        for(j=0;j<n1;j++)
            scanf("%d",&a[i][j]);
    printf("Enter elements of second matrix\n");
    for(i=0;i<m2;i++)
        for(j=0;j<n2;j++)
            scanf("%d",&b[i][j]);
    for(i=0;i<n1;i++)
        for(j=0;j<n2;j++)
        {
        c[i][j]=0;
        for(k=0;k<n2;k++)
            c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
    printf("Multiplication matrix is\n");
    for(i=0;i<m1;i++)
        {
        for(j=0;j<n2;j++)
            printf("%d\t",c[i][j]);
        printf("\n");
        }
    }
else
    printf("Order mismatch\n");
}
