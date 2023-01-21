import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_15736 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //백색이 0 아래로, 청색이 1 위로보이게 백색이 위로있는거 찾으면 된다 -> 0인 갯수 찾기
        //1의 배수는 무조건 존재하니까 1로 바뀐다.
        // - tc를 체크해보면 결론적으로 <=n까지의 제곱수 문제가 된다.
//        n = 3
//        b b b
//        1 w w w
//        2 w b w
//        3 w b b 1
//
//
//        n = 4
//        b b b b
//        1 w w w w
//        2 w b w b
//        3 w b b b
//        4 w b b w  2
//
//        n=5
//        b b b b b
//        1 w w w w w
//        2 w b w b w
//        3 w b b b w
//        4 w b b w w
//        5 w b b w b   2
//
//        n = 6
//        b b b b b b
//        1 w w w w w w
//        2 w b w b w b
//        3 w b b b w w
//        4 w b b w w w
//        5 w b b w b w
//        6 w b b w b b   2
//
//        n = 7
//        b b b b b b b
//        1 w w w w w w w
//        2 w b w b w b w
//        3 w b b b w w w
//        4 w b b w w w w
//        5 w b b w b w w
//        6 w b b w b b w
//        7 w b b w b b b  2
//
//        n = 8
//        b b b b b b b b
//        1 w w w w w w w w
//        2 w b w b w b w b
//        3 w b b b w w w b
//        4 w b b w w w w w
//        5 w b b w b w w w
//        6 w b b w b b w w
//        7 w b b w b b b w
//        8 w b b w b b b b 2
//
//        n = 9
//        b b b b b b b b b
//        1 w w w w w w w w w
//        2 w b w b w b w b w
//        3 w b b b w w w b b
//        4 w b b w w w w w b
//        5 w b b w b w w w b
//        6 w b b w b b w w b
//        7 w b b w b b b w b
//        8 w b b w b b b b b
//        9 w b b w b b b b w  3
        long n = Long.parseLong(br.readLine());
        int cnt =0;
        //1부터 n까지 제곱수 갯수 구하기 오버플로 방지 long
        for(long i = 1; i*i<=n; i++){
            cnt +=1;
        }
        System.out.println(cnt);
        br.close();
    }
}
