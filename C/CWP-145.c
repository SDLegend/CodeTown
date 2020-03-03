#include<stdio.h>
void main()
{
int a[100],i,x,n,ans;
int count(int *,int ,int );
printf("Enter no of elements\n");
scanf("%d",&n);
printf("Enter elements one by one\n");
for(i=0;i<n;i++)
    scanf("%d",(a+i));
printf("Enter element to be searched\n");
scanf("%d",&x);
ans=count(a,n,x);
if (ans==0)
    printf("%d is present\n",x);
else
    printf("%d is present %d times\n",x,ans);
}
int count(int *a,int n,int x)
{
int count=0,i;
for(i=0;i<n;i++)
    if (*(a+i)==x)
        count++;
return count;
}
