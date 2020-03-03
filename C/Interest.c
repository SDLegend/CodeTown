#include<stdio.h>
int main()
{
    int n,age;
    float p,r,a;
    char gen,mem;
    printf("Enter Principal amount,Period,Age of depositor,Gender of depositor,Membership status of depositor");
    scanf("%f %d %d %c %c",&p,&n,&age,&gen,&mem);
    if (n<0||age<0||p<0) printf("Invalid Data");
    else if (gen!='M'&&gen!='m'&&gen!='F'&&gen!='f'&&mem!='Y'&&mem!='y'&&mem!='N'&&mem!='n')
            printf("Invalid Data");
            else
            {
                if(gen=='M'||gen=='m')
                {
                    if(age<60)
                    {
                        if(mem=='Y'||mem=='y') r=9.5;
                        else r=9.25;
                    }
                    else if (mem=='Y'||mem=='y') r=10;
                        else r=9.75;
                }
                else if(age<60)
                {
                    if(mem=='Y'||mem=='y') r=9.6;
                    else r=9.35;
                }
                else if(mem=='Y'||mem=='y') r=10.1;
                    else r=9.85;
            a=p+(p*n*r)/100;
            printf("The Final amount payable is %f",a);
            }
        return 0;

}
