#include<stdio.h>
#include<string.h>
void main()
{
char s1[80],s2[80];
int n,flag;
printf("Enter s1:");
gets(s1);
printf("Enter s2;");
gets(s2);
flag=strcmp(s1,s2);
printf("%d",flag);
}
