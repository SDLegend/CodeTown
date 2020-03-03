#include<stdio.h>
void main()
{
static int a[11];
int n,m,i;
printf("Enter no of students\n");
scanf("%d",&n);
printf("Enter marks of students one by one\n");
for(i=0;i<n;i++)
    {
    scanf("%d",&m);
    a[m/10]++;
    }
for(i=0;i<11;i++)
    printf("No of students of grade %d is %d\n",i,a[i]);
}
