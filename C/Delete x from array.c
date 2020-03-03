#include<stdio.h>
void main()
{
int a[100],i,j,n,x;
printf("Enter no of elements of array\n");
scanf("%d",&n);
printf("Enter elements one by one");
for(i=0;i<n;i++)
    scanf("%d",&a[i]);
printf("Enter the element to be deleted\n");
scanf("%d",&x);
for(i=0;i<n;i++)
    if (a[i]==x)
        break;
for(j=i;j<(n-1);j++)
    a[i]=a[i+1];
n--;
printf("Modified Array is\n");
for(i=0;i<n;i++)
    printf("%d\t",a[i]);
}
