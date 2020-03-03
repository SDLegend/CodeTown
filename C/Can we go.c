#include<stdio.h>
void main()
{
    char a;
   abc: printf("Ssir Can we go ??\n");
    scanf("%c",&a);
    if(a=='y'||a=='Y')
        printf("Thats it for the day.Have a nice day\n");
    else
    {
        printf("Sssssir please Sssssssir\n");
        goto abc;
    }
}
