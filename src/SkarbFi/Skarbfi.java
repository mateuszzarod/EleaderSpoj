package SkarbFi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Skarbfi {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());

        for (int i = 0; i < tests; i++) {
            int[] treasureLoc = new int[2];
            int sets = Integer.parseInt(reader.readLine());
            for (int j = 0; j < sets; j++) {
                String[] clue = reader.readLine().split(" ");
                int direction = Integer.parseInt(clue[0]);
                int steps = Integer.parseInt(clue[1]);

                switch (direction) {
                    case 0:
                        treasureLoc[0] += Math.abs(steps);
                        break;
                    case 1:
                        treasureLoc[0] -= Math.abs(steps);
                        break;
                    case 2:
                        treasureLoc[1] += Math.abs(steps);
                        break;
                    case 3:
                        treasureLoc[1] -= Math.abs(steps);
                        break;
                }
            }
            ShowLocation(treasureLoc);
        }
    }

    private static void ShowLocation(int[] treasureLoc) {
        if (treasureLoc[0] != 0 || treasureLoc[1] != 0) {
            if (treasureLoc[0] > 0) {
                System.out.println("0 " + treasureLoc[0]);
            } else if (treasureLoc[0] < 0) {
                System.out.println("1 " + Math.abs(treasureLoc[0]));
            }

            if (treasureLoc[1] > 0) {
                System.out.println("2 " + treasureLoc[1]);
            } else if (treasureLoc[1] < 0) {
                System.out.println("3 " + Math.abs(treasureLoc[1]));
            }
        } else {
            System.out.println("studnia");
        }
    }
}