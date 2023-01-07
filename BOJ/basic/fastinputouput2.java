import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class fastinputouput2 {
    //빠른 입출력을 위한 입출력 예외 처리
    public static void main(String[] args) throws IOException {
        //br bw 사용 빠른 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); //st 선언 받는 문자열을 나눈다
        //배열 선언 integer형의 arr배열
        ArrayList<Integer> arr = new ArrayList<>();

        //토큰의 갯수만큼 넣는다
        for(int  i= 0 ; i< st.countTokens(); i++){
            arr.add(Integer.valueOf(st.nextToken()));
        }
        int test = st.countTokens();
        System.out.println(test);


        //사용했으면 닫아주기
        bw.close();
        br.close();
    }
}