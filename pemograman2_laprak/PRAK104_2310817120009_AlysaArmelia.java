package pemograman2_laprak;

import java.util.Scanner;

public class PRAK104_2310817120009_AlysaArmelia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String abu = input.nextLine().replaceAll("\\s", ""); 
        System.out.print("Tangan Bagas: ");
        String bagas = input.nextLine().replaceAll("\\s", ""); 
        
        int skor_abu = 0;
        int skor_bagas = 0;
        int i = 2;

        while (i >= 0) {
            char pilihan_abu = abu.charAt(i);
            char pilihan_bagas = bagas.charAt(i);

            if (pilihan_abu == pilihan_bagas) {
                i--;
            } else if ((pilihan_abu == 'B' && pilihan_bagas == 'G') ||  
                       (pilihan_abu == 'G' && pilihan_bagas == 'K') ||  
                       (pilihan_abu == 'K' && pilihan_bagas == 'B')) {
                skor_abu++;
                i--;
            } else {
                skor_bagas++;
                i--;
            }
        }

        if (skor_abu > skor_bagas) {
            System.out.print("Abu");
        } else if (skor_abu < skor_bagas) {
            System.out.print("Bagas");
        } else {
            System.out.print("Seri");
        }
        
        input.close();
    }
}