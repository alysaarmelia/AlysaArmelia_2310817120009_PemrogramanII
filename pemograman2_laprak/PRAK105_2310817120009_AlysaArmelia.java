package pemograman2_laprak;

import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2310817120009_AlysaArmelia {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan Jari-Jari: ");
        float jari = input.nextFloat();
        System.out.print("Masukkan Tinggi: ");
        float tinggi = input.nextFloat(); 
        
        double volume = PI * Math.pow(jari, 2) * tinggi;
        System.out.print("Volume tabung dengan jari-jari " + jari + " cm dan tinggi " + tinggi + " cm adalah " +
                String.format(Locale.US, "%.3f", volume) + " m3");
        
        input.close();
    }
}