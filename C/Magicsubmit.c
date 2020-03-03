#include<stdio.h>
int main()
{
    int n=0;
    char a[13],b[13];
    char temp;
    int spell(char );
    void putmychar(char [],int ,char );
    int i=0,j=0;
    for(i=0;i<13;i++)
    {
        scanf("%c%c",&a[i],&temp);
        if (temp=='0'&&a[i]=='1')
            a[i]='T';
    }
    //for(i=0;i<13;i++)
    //    printf("%c ",a[i]);
    for(i=0;i<13;i++)
        b[i]='0';
    for(i=0;i<13;i++)
    {
        n=spell(a[i]);
        j=n;
        //if (j>13)
        //    j-=13;
        putmychar(b,j,a[i]);
       // printf("Loop %d\n",i);
    }
    //printf("Loop ended\n");
    for(j=0;j<13;j++)
    {
        if (b[j]=='T')
            printf("10 ");
        else
            printf("%c ",b[j]);
    }
    return 0;
}
int spell(char c)
{
    switch(c)
    {
        case '2':   return 3;
        case '3':   return 5;
        case '4':   return 4;
        case '5':   return 4;
        case '6':   return 3;
        case '7':   return 5;
        case '8':   return 5;
        case '9':   return 4;
        case 'T':  return 3;
        case 'J':   return 4;
        case 'Q':   return 5;
        case 'K':   return 4;
        case 'A':   return 3;
        //case default: return 0;
    }
    return 0;
}
void putmychar(char b[],int j,char p)
{
    static int i=0;
    int count=0,k=0;
    static int time=0;
    for(k=i+1;count<j;k=k)
    {
        if (i==0&&time==0)
            {
                k--;
                time=1;
            }
        if (b[k%13]!='0')
            {
             k++;
             continue;
            }
        else
            count++;
       // printf("%d incremented by 1\n",k);
        k++;
    }
    i=k;
    if (i>13)
        i-=13;
    //printf("%d\n",k);
    while(b[k%13]!='0')
    {
        k++;
    }
    b[(k%13)]=p;
    //printf("%c inserted on %d\n",p,(k%13));
}

