package boj_1259;

import java.io.*;

public class boj_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            boolean tmp = true;

            if (s.equals("0")) {
                break;
            }

            else {
                //글자 길이
                int n = s.length();
                //홀수 일때
                if (n % 2 != 0) {
                    for (int i = 1; n / 2 + i < n; i++) {
                        if (s.charAt(n / 2 - i) != s.charAt(n / 2 + i)){
                            tmp = false;
                            break;
                        }
                    }
                }

                //짝수 일때
                else {
                    for (int i = 0; i < n / 2; i++) {
                        if (s.charAt(i) != s.charAt(n - 1 - i)) {
                            tmp = false;
                            break;
                        }
                    }
                }

                if(tmp == true){
                    sb.append("yes").append("\n");
                }else{
                    sb.append("no").append("\n");
                }

            }

        }

        System.out.println(sb);
        br.close();
    }
}
