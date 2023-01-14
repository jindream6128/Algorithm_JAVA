import java.io.*;

public class boj_1816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i< n; i++){
            //s 입력받기
            long s = Long.parseLong(br.readLine());
            // s만큼의 arr받기
            int[] s_arr = new int[1000001];
            String result = "YES";
            for(int j =2; j <1000001; j++){
                if(s%j==0){
                    result = "NO";
                }
            }
            bw.write(result);
            bw.newLine();



            // 0이면 약수가 아님 1이면 약수
//            for(int j =2; j<s+1;j++){
//                if(s%j==0) {
//                    s_arr[j] = 1;
//                }
//            }
//            String result = "NO"; //소수가 아님
//            for(int j =2; j<s+1;j++){
//                if(s_arr[j]==1){
//                    if(j>1000000){
//                        result = "YES";
//                    }
//                }
//            }
//            bw.write(result);

        }


        br.close();
        bw.flush();
    }
}
