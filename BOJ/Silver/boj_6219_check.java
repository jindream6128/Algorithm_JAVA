import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_6219_check {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        // A랑 B사이의 범위의 소수를 모두 구한다
        // 그 소수들 중에서 D를 포함하는지 확인하기
        // Contains 메서드를 통해서 D가 포함되는지 확인하기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        //소수 찾기 a부터 b까지 -> 리스트에 저장
        ArrayList<String> arr = new ArrayList<>();

        for(int i = a ; i<b+1; i++){
            int cnt = 0;

            for(long j =2; j<a+1;j++){

            }
        }
        //소수만 있는 arr중에서 D가 포함이 되면 True 그러면 ans ++
        int ans = 0;
        for(int i = 0 ; i<arr.size();i++){
            if(arr.get(i).contains(s)){
                ans++;
            }
        }

        System.out.println(ans);

        br.close();

    }
}
