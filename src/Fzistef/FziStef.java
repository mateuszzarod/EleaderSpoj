package Fzistef;

import java.util.Scanner;

public class FziStef {
    public static void main(String[] args) {
        int income;
        int result = 0;
        int maks = Integer.MIN_VALUE;

        Scanner odczyt = new Scanner(System.in);
        int cityNumber = odczyt.nextInt();
        for (int i = 0; i < cityNumber; i++) {
            income = odczyt.nextInt();
            result += income;
            if (result < 0) {
                result = 0;
            }
            if (result > maks) {
                maks = result;
            }
        }
        System.out.println(maks);
    }
}
