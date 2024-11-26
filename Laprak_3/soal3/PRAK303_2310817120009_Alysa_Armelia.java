package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class PRAK303_2310817120009_Alysa_Armelia {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        ArrayList<Mahasiswa> Daftar_mahasiswa = new ArrayList<>();

	        while (true) {
	            System.out.println("Menu: ");
	            System.out.println("1. Tambah Mahasiswa");
	            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
	            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
	            System.out.println("4. Tampilkan Daftar Mahasiswa");
	            System.out.println("0. Keluar");
	            System.out.print("Pilihan: ");
	            int pilihan = s.nextInt();
	            s.nextLine(); 

	            switch (pilihan) {
	                case 0:
	                    System.out.println("Terima Kasih!");
	                    s.close();
	                    return;

	                case 1:
	                    System.out.print("Masukan Nama Mahasiswa: ");
	                    String nama_mahasiswa = s.nextLine();
	                    System.out.print("Masukan NIM Mahasiswa (harus unik): ");
	                    long nim_mahasiswa = s.nextLong();
	                    s.nextLine();
	                    Daftar_mahasiswa.add(new Mahasiswa(nama_mahasiswa, nim_mahasiswa));
	                    System.out.println("Mahasiswa " + nama_mahasiswa + " ditambahkan");
	                    break;

	                case 2:
	                    System.out.print("Masukan NIM Mahasiswa yang akan dihapus: ");
	                    long nim_hapus = s.nextLong();
	                    boolean foundToDelete = false;
	                    for (int i = 0; i < Daftar_mahasiswa.size(); i++) {
	                        if (Daftar_mahasiswa.get(i).getNim() == nim_hapus) {
	                        	Daftar_mahasiswa.remove(i);
	                            System.out.println("Mahasiswa dengan NIM " + nim_hapus + " dihapus.");
	                            foundToDelete = true;
	                            break;
	                        }
	                    }
	                    if (!foundToDelete) {
	                        System.out.println("Mahasiswa dengan NIM " + nim_hapus + " tidak ditemukan dalam database.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Masukan NIM Mahasiswa yang ingin dicari: ");
	                    long nim_cari = s.nextLong();
	                    boolean foundToSearch = false;
	                    for (Mahasiswa mhs : Daftar_mahasiswa) {
	                        if (mhs.getNim() == nim_cari) {
	                            mhs.tampilkan();
	                            foundToSearch = true;
	                            break;
	                        }
	                    }
	                    if (!foundToSearch) {
	                        System.out.println("Mahasiswa dengan NIM " + nim_cari + " tidak ditemukan dalam database.");
	                    }
	                    break;

	                case 4:
	                    if (Daftar_mahasiswa.isEmpty()) {
	                        System.out.println("Daftar Mahasiswa kosong.");
	                    } else {
	                        for (Mahasiswa mhs : Daftar_mahasiswa) {
	                            mhs.tampilkan();
	                            System.out.println();
	                        }
	                    }
	                    break;
	                default:
	                    System.out.println("Pilihan Tidak Valid");
	                    break;
	            }
	        }
	    }
}
