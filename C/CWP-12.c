#include<stdio.h>
void main()
{
int sum,dd,mm,yyyy,i,a[13]={0,31,28,31,30,31,30,31,31,30,31,30,31};
printf("Enter the date in dd/mm/yyyy format\n");
scanf("%d %d %d",&dd,&mm,&yyyy);
sum=sum+dd;
for(i=0;i<mm;i++)
    sum=sum+a[i];
if(mm>2)
    if(yyyy%400==0||yyyy%4==0&&yyyy%100!=0)
        sum++;
printf("It is day %d of the year\n",sum);
}
