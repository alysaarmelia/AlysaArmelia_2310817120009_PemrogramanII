#include <stdio.h>
#include <math.h>

int main()
{
    int a = 5;
    int t = 12;
    int x = (a * a) + (t * t);
    int hasil = sqrt (x);
    printf("Diketahui ;\n");
    printf("Alas = %d cm\n", a);
    printf("Tinggi = %d cm\n", t);
    printf("Jawab :\n");
    printf("Sisi A = %d cm\n",t );
    printf("Sisi B = %d cm\n",a );
    printf("Sisi C = %d cm\n",hasil);
    printf("Keliling = %d cm\n",a+t+hasil);
    printf("Luas =%d cm\n", a*t/2);
return 0;
}