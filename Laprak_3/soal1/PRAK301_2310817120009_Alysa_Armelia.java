package soal1;

import java.util.Scanner;
public class PRAK301_2310817120009_Alysa_Armelia {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Banyak Jumlah Dadu: ");
        int jumlahDadu = scanner.nextInt();

        Dadu dadu = new Dadu();
        System.out.println(dadu.acakNilai(jumlahDadu));
        scanner.close();
    }
}