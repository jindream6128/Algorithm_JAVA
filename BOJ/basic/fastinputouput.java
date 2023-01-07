import java.io.*;

public class fastinputouput {
    //빠른 입출력을 위한 입출력 예외 처리
    public static void main(String[] args) throws IOException {
        //br bw 사용 빠른 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // br bw는 항상 문자열로 입출력 하기 때문에
        // 입력을 받으면 해당 문자형으로 바꿔서 가공 후 문자열로 출력
        int N = Integer.parseInt(br.readLine()); //한줄 단위로 읽어서 정수로 교환

        bw.write(String.valueOf(N)); //문자열로 바꿔서 출력
        //println 처럼 줄바꿈이 없어서 줄바꿈이 필요하면 bw.newline()

        //사용했으면 닫아주기
        bw.close();
        br.close();
    }
}