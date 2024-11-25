package soal2;

import java.util.HashMap;

public class Negara {
	private String nama;
    private String posisiKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    private static final HashMap<Integer, String> namaBulan = new HashMap<>();

    static {
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");
    }

    public Negara(String nama, String posisiKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.posisiKepemimpinan = posisiKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public void info() {
        String bulan = namaBulan.getOrDefault(bulanKemerdekaan, "Unknown");
        if (!posisiKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Negara " + nama + " mempunyai Presiden bernama " + namaPemimpin
                    + "\nDeklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulan + " " + tahunKemerdekaan);
        } else {
            System.out.println("Negara " + nama + " mempunyai Raja bernama " + namaPemimpin);
        }
    }
}
