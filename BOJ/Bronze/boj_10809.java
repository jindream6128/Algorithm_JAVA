import java.io.*;
import java.util.Arrays;

public class boj_10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //단어 입력 받기
        String in = br.readLine();

        //자료형[] 배열이름 =  new 자료형[크기]
        //알파벳 26개
        int[] alarr = new int[26];

        for(int i =0; i<26;i++){
            alarr[i]= -1;
        }

        //ch에 각 단어 하나씩 저장
        for(int i =0; i<in.length();i++){
            char ch = in.charAt(i);
            //편한 연산을 위해 아스키코드로 변경
            int chnum = (int)ch-'a';

            if(alarr[chnum] == -1){
                alarr[chnum] = i;
            }
        }
        //출력 공백 추가하기!
        for(int i =0; i<alarr.length;i++){
            bw.write(String.valueOf(alarr[i]+" "));
        }
        // 출력 형식이 다르다: bw.write(Arrays.toString(alarr));


        br.close();
        bw.close();
    }
}
