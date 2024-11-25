package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class PRAK302_2310817120009_Alysa_Armelia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Negara> Daftar_negara = new LinkedList<>();
        System.out.print("Jumlah Negara: ");
        int jumlah_negara = s.nextInt();
        s.nextLine();

        for (int i = 0; i < jumlah_negara; i++) {
            System.out.print("Nama Negara: ");
            String namaNegara = s.nextLine();
            System.out.print("Jenis Negara: ");
            String jenisNegara = s.nextLine();
            System.out.print("Nama Pemimpin: ");
            String namaPemimpin = s.nextLine();

            int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;

            switch (jenisNegara.toLowerCase()) {
                case "monarki":
                    break;

                default:
                    System.out.print("Tanggal Kemerdekaan: ");
                    tanggalKemerdekaan = s.nextInt();
                    System.out.print("Bulan Kemerdekaan: ");
                    bulanKemerdekaan = s.nextInt();
                    System.out.print("Tahun Kemerdekaan: ");
                    tahunKemerdekaan = s.nextInt();
                    s.nextLine(); 
                    break;
            }
            Daftar_negara.add(new Negara(namaNegara, jenisNegara, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
        }
        for (Negara negara : Daftar_negara) {
            negara.info();
            System.out.println();
        }
        s.close();
    }
}