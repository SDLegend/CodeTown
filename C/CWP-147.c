#include<stdio.h>
void main()
{
int a[100],i,x,n,pos;
int search(int *,int ,int );
printf("Enter no of elements\n");
scanf("%d",&n);
printf("Enter elements one by one\n");
for(i=0;i<n;i++)
    scanf("%d",a+i);
printf("Enter the number to be searched");
scanf("%d",&x);
pos=search(a,n,x);
if (pos==-1)
    printf("%d is not present",x);
else
    printf("%d is present at position %d",x,pos);
}
int search(int *a,int n,int x)
{
int i,count=0;
for(i=0;i<n;i++)
    if (*(a+i)==x)
    {
        count++;
        break;
    }
if (count==0)
    return -1;
else
    return i;
}
