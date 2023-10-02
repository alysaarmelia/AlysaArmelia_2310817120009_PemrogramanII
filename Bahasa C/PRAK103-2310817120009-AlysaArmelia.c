#include <stdio.h>
#include <math.h>

int main()
{
    float l = 9, m = 6, n = 10, o = 7, p = (l + m) * n / o;
    p = ceilf(p * 100) / 100;
    int a = 9, b = 6, x = 10, y= 7;
    printf("Variabel a bernilai %d\n", a);
    printf("Variabel b bernilai %d\n", b);
    printf("Variabel x bernilai %d\n", x);
    printf("Variabel y bernilai %d\n", y);
    printf("Hasil dari a ditambah b dikali x dan dibagi y adalah %.2f\n", p);
return 0;
}