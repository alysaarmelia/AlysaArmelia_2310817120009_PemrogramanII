#include <stdio.h>

int main()
{
  int a = 4;
  int b = 5;
  int c = 7;
  int k = a + b + c;
  int h = 85000;
  int d = k * h;
  printf("Diketahui ;\n");
  printf("Panjang sisi segitiga berturut-turut adalah %d, %d, dan %d\n", a, b, c);
  printf("Keliling Tanah Pak Dangklek adalah %d\n", k);
  printf("Harga tanah Per Meter %d\n", h);
  printf("Jawaban :\n");
  printf("Biaya yang diperlukan Pak Dengklek adalah : Rp %d\n", d);
return 0;
}