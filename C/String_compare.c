#include<stdio.h>
int string_length(char []);
int string_compare(char [],char []);
void main()
{
int ans;
char s1[80],s2[80];
printf("Enter the string s1:");
gets(s1);
printf("Enter the string s2:");
gets(s2);
ans=string_compare(s1,s2);
if (ans<0)
    printf("s2 is larger");
else if (ans>0)
    printf("s1 is larger");
else
    printf("Both are equal");
}
int string_length(char str[])
{
int i=0;
while (str[i]!='\0')
    i++;
return i;
}
int string_compare(char s1[],char s2[])
{
int n1,n2,count=0,flag=0,min,i;
n1=string_length(s1);
n2=string_length(s2);
min=(n1<n2)?n1:n2;
for(i=0;i<min;i++)
    if (s1[i]!=s2[i])
        {
         flag=s1[i]-s2[i];
         count++;
        }
if (count==0)
    flag=n1-n2;
return flag;
}
