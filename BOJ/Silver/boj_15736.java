import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_15736 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //백색이 0 아래로, 청색이 1 위로보이게 백색이 위로있는거 찾으면 된다 -> 0인 갯수 찾기
        //1의 배수는 무조건 존재하니까 1로 바뀐다.


        br.close();
    }
}
