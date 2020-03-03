#include<stdio.h>
void fun_count(char []);
int string_length(char []);
void main()
{
char str[80];
printf("Enter the string:");
gets(str);
fun_count(str);
}
void fun_count(char str[])
{
int i,n,vc=0,cc=0,dc=0,oc=0;
n=string_length(str);
for(i=0;i<n;i++)
    if(str[i]>='A'&&str[i]<='Z'||str[i]>='a'&&str[i]<='z')
        if(str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'||str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
            vc++;
        else
            cc++;
    else if(str[i]>='0'||str[i]<='9')
            dc++;
        else
            oc++;
    printf("Number of vowels are %d\n",vc);
    printf("Number of consonents are %d\n",cc);
    printf("Number of digits are %d\n",dc);
    printf("Number of other characters are %d\n",oc);
}
int string_length(char str[])
{
    int i=0;
    while (str[i]!='\0')
            i++;
    return i;
}
