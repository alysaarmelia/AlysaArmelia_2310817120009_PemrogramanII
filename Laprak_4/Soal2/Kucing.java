package Soal2;

public class Kucing extends HewanPeliharaan {
	private String warnaBulu;

    public Kucing(String n, String r, String w) {
        super(r, n);
        this.warnaBulu = w;
    }

    public void displayDetailKucing() {
        super.display(); 
        System.out.println("Memiliki warna bulu: " + warnaBulu);
    }
}