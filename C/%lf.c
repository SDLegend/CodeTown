#include <stdio.h>

int main()
{
    //long double dip = 5.2e-5;
    long double dip=42e-2;
    dip=dip*2;
    printf("%Lf can be written %le\n", dip, dip);

    return 0;
}
