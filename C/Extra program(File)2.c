#include<stdio.h>
#include<string.h>
void main()
{
char name[40],name1[40],c,str[30];
int i,n,roll_no,roll_no1;
FILE *fp;
fflush(stdin);
printf("Enter file name:");
gets(str);
fp=fopen(str,"w");
fflush(stdin);
printf("Enter the name of student:");
gets(name);
printf("Enter the roll no:");
scanf("%d",&roll_no);
n=strlen(name);
for(i=0;i<n;i++)
    {
    fputc(name[i],fp);
    }
fprintf(fp," %d",roll_no);
fclose(fp);
fp=fopen(str,"r");
while (!feof(fp))
    {
        fscanf(fp,"%s",&name1);
        fscanf(fp,"%d",&roll_no1);
        printf("%s\n",name1);
        printf("%d",roll_no1);
    }
fclose(fp);
}
