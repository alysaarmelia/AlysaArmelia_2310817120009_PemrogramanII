package Modul2_Pemograman;

import java.util.Locale;

public class buah {
	double berat;
    double harga;
    double pembelian;
    String nama;

    public void info() {
    	System.out.printf("Nama Buah: %s\n", nama);
        System.out.printf(Locale.US, "Berat: %.1f kg\n", berat);
        System.out.printf(Locale.US, "Harga: Rp%.1f\n", harga);
        System.out.printf(Locale.US, "Jumlah Beli: %.1f kg\n", pembelian);
        System.out.printf(Locale.US, "Harga Sebelum Diskon: Rp%.2f\n", detect_harga());
        System.out.printf(Locale.US, "Total Diskon: Rp%.2f\n", harga_diskon());
        System.out.printf(Locale.US, "Harga Setelah Diskon: Rp%.2f\n", total_diskon());
        System.out.println();
    }

    public double detect_harga() {
        return pembelian / berat * harga;
    }

    public double total_diskon() {
        return detect_harga() - harga_diskon();
    }

    public double harga_diskon() {
        double temp_diskon = pembelian / 4;
        int diskon = (int) temp_diskon;
        return (diskon * 0.02) * harga * 4;
    }
}