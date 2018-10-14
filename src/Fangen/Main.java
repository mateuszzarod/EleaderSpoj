package Fangen;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n;
            CharMap chars = new CharMap('.', '*');
            FangFactory fangFactory = new FangFactory();

            while ((n = Integer.parseInt(reader.readLine())) != 0) {
                Direction dir;
                if (n > 0) {
                    dir = Direction.CLOCKWISE;
                } else dir = Direction.COUNTERCLOCKWISE;
                fangFactory.makeWingType(FangType.QUADRUPLESMALL, chars).draw(n, dir);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}