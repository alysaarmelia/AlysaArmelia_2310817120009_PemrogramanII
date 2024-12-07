package Soal2;

public class HewanPeliharaan {
	private String nama;
    private String ras;

    public HewanPeliharaan(String n, String r) {
        this.ras = n;
        this.nama = r;
    }

    public void display() {
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }
}