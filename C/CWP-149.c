#include<stdio.h>
void main()
{
float a[100];
int i,j,n;
void sort(float [],int);
printf("Enter number of elements of array:");
scanf("%d",&n);
printf("Enter elements one by one");
for(i=0;i<n;i++)
    scanf("%f",&a[i]);
sort(a,n);
printf("Sorted array is:");
for(i=0;i<n;i++)
    printf("%f\t",a[i]);
}
void sort(float a[],int n)
{
int i,j,option,temp;
printf("1.Sort in ascending order\n2.Sort in descending order\nEnter your option:");
scanf("%d",&option);
if (option==1)
    {
    for(i=0;i<n-1;i++)
        for(j=0;j<n-1-i;j++)
            if (a[j]>a[j+1])
                {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
    }
else
    {
    for(i=0;i<n-1;i++)
        for(j=0;j<n-1-i;j++)
            if (a[j]<a[j+1])
                {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
    }
}
