#include<stdio.h>
void main()
{
char c;
char s1[40],s2[40];
FILE *fp1,*fp2;
fflush(stdin);
printf("Enter name of source file:");
gets(s1);
fflush(stdin);
printf("Enter name of destination file:");
gets(s2);
fp1=fopen(s1,"r");
fp2=fopen(s2,"w");
while ((c=fgetc(fp1))!=EOF)
    {
    fputc(c,fp2);
    }
fclose(fp1);
fclose(fp2);
}
