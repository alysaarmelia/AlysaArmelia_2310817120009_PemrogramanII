#include <stdio.h>

int main()
{
    int a = 400000;
    int b = 350000;
    int h = 13; 
    int i = 21; 
    int j = a-(a * h /100);
    int k = b-(b * i /100);
    printf("Harga sepatu A adalah %d\n", a);
    printf("Harga sepatu B adalah %d\n", b);
    printf("Sepatu A mendapat diskon 13%% sehingga harganya menjadi %d\n", j);
    printf("Sepatu B mendapat diskon 21%% sehingga harganya menjadi %d\n", k);
return 0;
}