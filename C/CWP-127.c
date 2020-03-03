#include<stdio.h>
void main()
{
int i,j,m,n,max,temp;
int a[10][10];
printf("Enter order of matrix");
scanf("%d %d",&m,&n);
printf("Enter elements one by one\n");
for(i=0;i<m;i++)
    for(j=0;j<n;j++)
        scanf("%d",&a[i][j]);
printf("Orignal matrix is\n");
for(i=0;i<m;i++)
    {
    for(j=0;j<n;j++)
        printf("%d\t",a[i][j]);
    printf("\n");
    }
max=(m>n)?m:n;
for(i=0;i<max;i++)
    for(j=0;j<max;j++)
        if (i<j)
            {
            temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
            }
printf("Transposed matrix is\n");
for(i=0;i<n;i++)
    {
    for(j=0;j<m;j++)
        printf("%d\t",a[i][j]);
    printf("\n");
    }
}
