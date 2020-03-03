#include<stdio.h>
#include<math.h>
void main()
{
int i,n;
float a[50],mean=0,variance=0,std;
printf("Enter no of terms\n");
scanf("%d",&n);
printf("Enter numbers one by one\n");
for(i=0;i<n;i++)
    scanf("%f",&a[i]);
for(i=0;i<n;i++)
    mean=mean+a[i];
mean=mean/n;
for(i=0;i<n;i++)
    variance=(a[i]-mean)*(a[i]-mean);
variance=variance/n;
std=sqrt(variance);
printf("Mean=%f\nVariance=%f\nStandard Deviation=%f",mean,variance,std);
}
