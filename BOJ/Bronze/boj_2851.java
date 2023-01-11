import java.io.*;

public class boj_2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //점수

        //버섯 저장 10개
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int afternum =arr[0];
        for (int i = 1; i < arr.length; i++) {
            //beforenum 값에는 afternum에 다음 버섯을 먹기전 점수가 저장된다
            int beforenum  = afternum;
            // 다음 버섯을 먹은 점수가 저장된다
            afternum += arr[i];
            
            if (afternum > 100) {
                if (Math.abs(beforenum - 100) < Math.abs(afternum - 100)) {
                    bw.write(String.valueOf(beforenum));
                    bw.close();
                } else if (Math.abs(beforenum - 100) >= Math.abs(afternum - 100)) {
                    bw.write(String.valueOf(afternum));
                    bw.close();
                }
                //한번 그만먹으면 끝
                return;
            } else if (beforenum == afternum){
                //안먹었다는 소리
                bw.write(String.valueOf(afternum));
                bw.close();
                return;
            }
        }
        bw.close();
    }
}
