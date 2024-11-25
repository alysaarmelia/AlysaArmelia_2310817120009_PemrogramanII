package soal1;

import java.util.ArrayList;
public class Dadu {
	private static final int MAX = 6;
    private static final int MIN = 1;

    public int acakNilai() {
        return MIN + (int) (Math.random() * ((MAX - MIN) + 1));
    }

    public String acakNilai(int jumlahDadu) {
        ArrayList<Integer> hasilDadu = new ArrayList<>();
        int totalNilai = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            int nilai = acakNilai();
            hasilDadu.add(nilai);
            totalNilai += nilai;
        }
        for (int i = 0; i < hasilDadu.size(); i++) {
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + hasilDadu.get(i));
        }
        return "Total nilai dadu keseluruhan " + totalNilai;
    }
}
