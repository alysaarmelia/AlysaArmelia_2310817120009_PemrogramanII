#include <stdio.h>
#include <stdbool.h>

int main()
{
    int m = 4;
    int n = 8;
    int o = 3;
    printf("Variabel a bernilai %d\n", m);
    printf("Variabel b bernilai %d\n", n);
    printf("Variabel c bernilai %d\n", o);
    printf("Apakah a sama dengan b ? jawabannya %d\n", m == n);
    printf("Apakah b lebih besar dari c ? jawabannya adalah %d\n", m > o);
    printf("Apakah a tidak sama dengan c ? jawabannya adalah %d\n", m != n);
return 0;
}