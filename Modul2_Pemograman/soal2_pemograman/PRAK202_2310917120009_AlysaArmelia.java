package soal2_pemograman;

import java.util.Locale;

public class PRAK202_2310917120009_AlysaArmelia {
	public static void main(String[] args) {
		Kopi kopi1 = new Kopi("Espresso", "Medium", 25000);
        kopi1.info();
        kopi1.setPembeli("Alice");
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
        System.out.printf(Locale.US, "Pajak Kopi: Rp. %.1f\n", kopi1.hitungPajak());
	}
}