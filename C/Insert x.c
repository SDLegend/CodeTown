#include<stdio.h>
void main()
{
int a[100],i,n,j,x;
printf("Enter number of elements of array\n");
scanf("%d",&n);
printf("Enter elements one by one\n");
for(j=0;j<n;j++)
    scanf("%d",&a[j]);
printf("Enter the element to be inserted\n");
scanf("%d",&x);
printf("Enter the position to insert\n");
scanf("%d",&j);
for(i=n;i>=j;i--)
    a[i+1]=a[i];
a[j]=x;
n++;
printf("Modified array is\n");
for(j=0;j<n;j++)
    printf("%d\t",a[j]);
}
