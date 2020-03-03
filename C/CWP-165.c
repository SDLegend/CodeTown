#include<stdio.h>
#include<ctype.h>
void main()
{
char c;
FILE *fp;
char str[40];
fflush(stdin);
printf("Enter file name:");
gets(str);
fp=fopen(str,"w");
printf("Enter the string:");
while  ((c=fgetchar())!='\n')
    {
    fputc(toupper(c),fp);
    }
fclose(fp);
}
