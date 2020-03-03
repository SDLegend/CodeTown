#include<stdio.h>
void main()
{
int palindrome(char []),ans;
char str[80];
printf("Enter the string\n");
gets(str);
printf("Entered string is\n");
puts(str);
ans=palindrome(str);
if (ans==0)
    printf("%s is not palindome\n",str);
else
    printf("%s is palindrome\n",str);
}
int palindrome(char str[])
{
int i,flag=1,n;
n=strlen(str);
for(i=0;i<(n/2);i++)
    if (str[i]!=str[n-1-i])
        {
        flag=0;
        break;
        }
return flag;
}
