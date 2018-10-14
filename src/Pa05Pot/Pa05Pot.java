package Pa05Pot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pa05Pot {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(reader.readLine());

        for (int i = 0; i < rows; ++i) {
            String[] str = reader.readLine().split(" ");
            long base = Integer.parseInt(str[0]);
            base = base % 10;
            long power = Integer.parseInt(str[1]);

            if (power > 0) {
                if (power % 4 == 0) {
                    power = 4;
                } else {
                    power = power % 4;
                }
                long result = base;
                for (int j = 1; j < power; j++) {
                    base %= 10;
                    result *= base;
                }
                System.out.println(result % 10);
            } else System.out.println(1);
        }
    }
}