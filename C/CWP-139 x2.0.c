#include<stdio.h>
int string_length(char []);
void string_copy(char[],char []);
void main()
{
char s1[80],s2[80];
printf("Enter s1:");
gets(s1);
string_copy(s2,s1);
printf("Copied string s2 is:");
puts(s2);
}
int string_length(char str[])
{
int i=0;
while (str[i]!='\0')
    i++;
return i;
}
void string_copy(char s2[],char s1[])
{
int n,i;
n=string_length(s1);
for(i=0;i<=n;i++)
    s2[i]=s1[i];
}
