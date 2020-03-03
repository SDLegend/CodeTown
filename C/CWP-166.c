#include<stdio.h>
void main()
{
char c;
char str[40];
FILE *fp;
fflush(stdin);
printf("Enter file name:");
gets(str);
fp=fopen(str,"r");
if (fp==NULL)
    printf("File does not exists");
else
    {
    while ((c=fgetc(fp))!=EOF)
        putchar(c);

    }
fclose(fp);
}
