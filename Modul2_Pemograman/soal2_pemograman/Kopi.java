package soal2_pemograman;

public class Kopi {
	    String namaKopi;
	    String ukuran;
	    String pembeli;
	    double harga;
	    final double PAJAK_RATE = 0.11;

	    Kopi(String nama, String ukuranKopi, double hargaKopi) {
	        namaKopi = nama;
	        ukuran = ukuranKopi;
	        harga = hargaKopi;
	    }

	    void info() {
	        System.out.println("Nama Kopi: " + namaKopi);
	        System.out.println("Ukuran: " + ukuran);
	        System.out.println("Harga: Rp." + harga);
	    }

	    void setPembeli(String namaPembeli) {
	        pembeli = namaPembeli;
	    }

	    String getPembeli() {
	        return pembeli;
	    }

	    double hitungPajak() {
	        return harga * PAJAK_RATE;
	    }
	}