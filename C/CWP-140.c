#include<stdio.h>
int string_length(char []);
void string_concat(char [],char []);
void main()
{
char s1[80],s2[80];
printf("Enter the string s1:");
gets(s1);
printf("Enter the string s2:");
gets(s2);
string_concat(s2,s1);
printf("Concatenated string is:");
puts(s2);
}
int string_length(char str[])
{
int i=0;
while (str[i]!='\0')
    i++;
return i;
}
void string_concat(char s2[],char s1[])
{
int i,n1,n2;
n1=string_length(s1);
n2=string_length(s2);
for(i=0;i<=n1;i++)
    s2[n2+i]=s1[i];
}
