import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_7696_answer {
    static int[] allarr = new int[1_000_001];

    static boolean check(int number) {
        // 0b0010000000 digits (boolean list)

        // 0b0010000000 <- 7
        // 0b0100000000 <- 8
        // 0b1000000000 <- 9
        int digits = 0;

        while (number > 0) {
            int digit = number % 10;
            //digit = 7 ->
            //1 0b000000001  -> 0b010000000
            // 0이 아니면 통과가 성공했따 ->
            // 0b101110000 (digits)
            // 0b010000000
            if ((digits & (1 << digit)) != 0) {
                return true;
            }
            digits |= (1 << digit);
            number /= 10;
        }
        return false;
    }


    static void precal(){
        int testNum = 0;
        for(int number = 1; number<=1_000_000;){
            testNum++;
            if(check(testNum)){
                continue;
            }
            allarr[number] = testNum;
            number++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        precal();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            bw.write(String.valueOf(allarr[n]));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}