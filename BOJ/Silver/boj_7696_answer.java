import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_7696_answer {
    static boolean isDistinctNumber(int number) {
        int digits = 0;

        while (number > 0) {
            int digit = number % 10;
            if ((digits & (1 << digit)) != 0) {
                return true;
            }
            digits |= (1 << digit);
            number /= 10;
        }
        return false;
    }

    static int[] cache = new int[1_000_000 + 1];

    static void precalculate() {
        int testNumber = 0;
        for (int number = 1; number <= 1_000_000;) {
            testNumber++;
            if (isDistinctNumber(testNumber)) {
                continue;
            }
            cache[number] = testNumber;
            number++;
        }
    }

    public static void main(String[] args) throws IOException {
        try (
                var br = new BufferedReader(new InputStreamReader(System.in));
                var bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            precalculate();

            while (true) {
                int n = Integer.parseInt(br.readLine());
                if (n == 0) break;

                bw.write(String.valueOf(cache[n]));
                bw.newLine();
            }
        }
    }
}