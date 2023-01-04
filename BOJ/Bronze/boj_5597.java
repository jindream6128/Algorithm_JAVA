import java.io.*;

public class boj_5597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[31];
        //출석번호는 1~30번 arr[0] = true로 바꿔놓기

        //30번 반복 (1~30)
        for(int i = 0; i<30; i++) {
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        for(int i =0; i<30; i++){
            if(arr[i]!=1){
                bw.write(String.valueOf(arr[i]));
                bw.newLine();
            //마구잡이로 넣어도, index가 0부터 출발하니까 작은게 먼저 나온다
            }
        }
        br.close();
        bw.close();
    }
}
