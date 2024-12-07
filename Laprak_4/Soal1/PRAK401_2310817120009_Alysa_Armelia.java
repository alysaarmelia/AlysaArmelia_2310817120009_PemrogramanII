package Soal1;

import java.util.Scanner;

public class PRAK401_2310817120009_Alysa_Armelia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nama Hewan Peliharaan: ");
		String nama = scan.nextLine();
		System.out.print("Ras: ");
		String ras = scan.nextLine();
		System.out.println("");
		HewanPeliharaan h1 = new HewanPeliharaan(nama, ras);
		h1.display();
		scan.close();
	}
}