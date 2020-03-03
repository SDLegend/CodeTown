#include<stdio.h>
void string_copy(char [],char []);
int string_length(char []);
void main()
{
char s1[80],s2[80];
printf("Enter string s1:");
gets(s1);
string_copy(s2,s1);
printf("Copied string s2 is:");
puts(s2);
}
void string_copy(char s2[],char s1[])
{
int i,n;
n=string_length(s1);
for(i=0;i<=n;i++)
    s2[i]=s1[i];
}
int string_length(char s[])
{
int i=0;
while (s[i]!='\0');
    i++;
return i;
}
