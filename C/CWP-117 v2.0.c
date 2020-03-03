#include<stdio.h>
void main()
{
int a[10][10],b[10][10],c[10][10],d[10][10];
int i,j,m1,n1,m2,n2;
printf("Enter oder of first matrix\n");
scanf("%d %d",&m1,&n1);
printf("Enter order of second matrix\n");
scanf("%d %d",&m2,&n2);
if (m1==m2&&n1==n2)
    {
    printf("Enter the first matrix");
    for(i=0;i<m1;i++)
        for(j=0;j<n1;j++)
            scanf("%d",&a[i][j]);
    for(i=0;i<m1;i++)
        for(j=0;j<n1;j++)
            scanf("%d",&b[i][j]);
    for(i=0;i<m1;i++)
        for(j=0;j<n1;j++)
            {
            c[i][j]=a[i][j]+b[i][j];
            d[i][j]=a[i][j]-b[i][j];
            }
    printf("Addition matrix is\n");
    for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
                printf("%d\t",c[i][j]);

        printf("\n");
        }
    printf("subtraction matrix is\n");
    for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
                printf("%d\t",d[i][j]);

        printf("\n");
        }
    }
else
    printf("Order must be same\n");
}
