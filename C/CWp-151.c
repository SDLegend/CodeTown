#include<stdio.h>
void readmat(int [][10],int,int);
void printmat(int [][10],int,int);
void multmat(int [][10],int[][10],int[][10],int,int,int);
void transpose(int [][10],int[][10],int,int);
int equal(int [][10],int[][10],int,int);
void main()
{
int a[10][10],b[10][10],c[10][10],at[10][10],bt[10][10],ct[10][10],abt[10][10];
int m1,n1,m2,n2,flag;
printf("Enter order of first matrix:");
scanf("%d %d",&m1,&n1);
printf("Enter order of second matrix:");
scanf("%d %d",&m2,&n2);
printf("Enter elements of first matrix:");
readmat(a,m1,n1);
printf("Enter elements of second matrix:");
readmat(b,m2,n2);
if (m2==n1)
    multmat(a,b,c,m1,n2,n1);
else
    printf("Order mismatch\n");
transpose(a,at,m1,n1);
transpose(b,bt,m2,n2);
transpose(c,ct,m1,n2);
printf("L.H.S=\n");
printmat(ct,n2,m1);
multmat(at,bt,abt,n1,m2,m1);
printf("R.H.S=\n");
printmat(abt,n2,m1);
flag=equal(ct,abt,n2,m1);
if(flag==1)
    printf("Property is satisfied");
else
    printf("Property not satisfied");
}
void readmat(int a[][10],int m,int n)
{
int i,j;
for(i=0;i<m;i++)
    for(j=0;j<n;j++)
        scanf("%d",&a[i][j]);
}
void printmat(int a[][10],int m,int n)
{
int i,j;
for(i=0;i<m;i++)
    {
    for(j=0;j<n;j++)
        printf("%d\t",&a[i][j]);
    printf("\n");
    }
}
void multmat(int a[][10],int b[][10],int c[][10],int m1,int n2,int n1)
{
int i,j,k;
for(i=0;i<m1;i++)
for(j=0;j<n2;j++)
    {
    c[i][j]=0;
    for(k=0;k<n1;k++)
        c[i][j]=c[i][j]+a[i][k]*b[k][j];
    }
}
void transpose(int a[][10],int at[][10],int m,int n)
{
int i,j;
for(i=0;i<m;i++)
    for(j=0;j<n;j++)
        at[j][i]=a[i][j];
}
int equal(int a[][10],int b[][10],int m,int n)
{
int i,j,flag=1;
for(i=0;i<m;i++)
    for(j=0;j<n;j++)
        if(a[i][j]!=b[i][j])
            {
            flag=0;
            break;
            }
return flag;
}
