#include<stdio.h>
void main()
{
int x,y,*p,*q;
int swap(int *,int *);
printf("Enter two numbers to be swapped\n");
scanf("%d %d",&x,&y);
printf("Before swapping\nx=%d,y=%d\n",x,y);
p=&x;
q=&y;
swap(p,q);
printf("After swapping\nx=%d,y=%d",x,y);
}
int swap(int*p,int*q)
{
int temp;
temp=*p;
*p=*q;
*q=temp;
return 0;
}
