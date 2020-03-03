#include<stdio.h>
int main()
{
int x,y;
char op;
printf("Enter two integer\n");
scanf("%d %d",&x,&y);
printf("Enter option out of +,-,*,/");
scanf("%c",op);
abc: switch(op)
    {
    case '+':printf("%d+%d=%d",x,y,x+y);break;
    case '-':printf("%d-%d=%d",x,y,x-y);break;
    case '*':printf("%d*%d=%d",x,y,x*y);break;
    case '/': if (y!=0)
                printf("%d/%d=%f",x,y,x/y);break;
    default:printf("Invalid option");
            goto abc;
    }
return 0;
}
