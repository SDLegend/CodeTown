#include<stdio.h>
struct date
{
int dd,mm,yy;
};
struct student
{
char name[40];
int roll_no;
int marks;
struct date dob;
};
int main()
{
struct student s[80];
int n,i,option;
void sort_name(struct student [],int);
void sort_roll_no(struct student [],int);
void sort_marks(struct student [],int);
void sort_dob(struct student[],int);
printf("Enter no of students:");
scanf("%d",&n);
printf("Enter information one by one\n");
for(i=0;i<n;i++)
    {
    fflush(stdin);
    printf("Name:");
    gets(s[i].name);
    printf("Roll no:");
    scanf("%d",&s[i].roll_no);
    printf("Total Marks:");
    scanf("%d",&s[i].marks);
    printf("Date of birth(dd/mm/yyyy):");
    scanf("%d %d %d",&s[i].dob.dd,&s[i].dob.mm,&s[i].dob.yy);
    }
printf("1.Sort acc to name\n2.Sort acc to roll no\n3.Sort acc to marks\n4.Sort acc to date of birth\n");
printf("Enter your option");
scanf("%d",&option);
switch(option)
{
    case 1: sort_name(s,n);
            break;
    case 2: sort_roll_no(s,n);
            break;
    case 3: sort_marks(s,n);
            break;
    case 4: sort_dob(s,n);
            break;
}
printf("After Sorting\n");
printf("Roll no Name                                    Marks Date of Birth\n");
for(i=0;i<n;i++)
    printf("%7d %-40s%5d %d/%d/%d\n",s[i].roll_no,s[i].name,s[i].marks,s[i].dob.dd,s[i].dob.mm,s[i].dob.yy);
}
void sort_name(struct student s[],int n)
{
int i,j;
struct student temp;
for(i=0;i<n-1;i++)
for(j=0;j<n-1-i;j++)
    if(strcmp(s[j].name,s[j+1].name)>0)
        {
        temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;
        }
}
void sort_roll_no(struct student s[],int n)
{
int i,j;
struct student temp;
for(i=0;i<n-1;i++)
for(j=0;j<n-1-i;j++)
    if(s[j].roll_no>s[j+1].roll_no)
        {
        temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;
        }
}
void sort_marks(struct student s[],int n)
{
int i,j;
struct student temp;
for(i=0;i<n-1;i++)
for(j=0;j<n-1-i;j++)
    if(s[j].marks<s[j+1].marks)
        {
        temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;
        }
}
void sort_dob(struct student s[],int n)
{
int i,j;
struct student temp;
for(i=0;i<n-1;i++)
for(j=0;j<n-1-i;j++)
    if(s[j].dob.yy>s[j+1].dob.yy||s[j].dob.yy==s[j+1].dob.yy&&s[j].dob.mm>s[j+1].dob.mm||s[j].dob.yy==s[j+1].dob.yy&&s[j].dob.mm==s[j+1].dob.mm&&s[j].dob.dd>s[j].dob.dd)
        {
        temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;
        }
}
