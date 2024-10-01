package pemograman2_laprak;

import java.util.Scanner;

public class PRAK103_2310817120009_AlysaArmelia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int start = input.nextInt();
        int count = 0;

        do {
            if (start % 2 != 0) {
                if (count == N - 1) { 
                    System.out.print(start);
                } else {
                    System.out.print(start + ", ");
                }
                count++;
            }
            start++;
        } while (count < N);

        input.close();
    }
}