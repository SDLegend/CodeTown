#include<stdio.h>
#include<math.h>
void main()
{
float a,b,c,r1,r2,delta;
printf("Enter coefficients of Quadratic eqn:");
scanf("%f %f %f",&a,&b,&c);
if (a==0)
    {
    if(b==0)
        printf("Invalid data\n");
    else
        {
        printf("Root=%f",(-c)/b);
        }
    }
else
    {
    delta=b*b-4*a*c;
    printf("%f\n",delta);
    if (delta==0)
        printf("Root=%f",(-b)/2*a);
    else if (delta>0)
        {
        printf("Root 1=%f\n",(-b+sqrt(delta))/2*a);
        printf("Root 2=%f\n",(-b-sqrt(delta))/2*a);
        }
    else
        {
        printf("Root 1=%f+%f i\n",(-b)/2*a,sqrt(-delta)/2*a);
        printf("Root 2=%f-%f i\n",(-b)/2*a,sqrt(-delta)/2*a);
        }
    }
}
