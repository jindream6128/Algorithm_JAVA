import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_6219_timeover {
    //A이 정수인지 구분해보자
    static boolean decimal(int a) {
        if (a == 1) {
            return false;
        }
        int cnt = 0;
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                cnt ++;
            }
        }
        if(cnt == 1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // A랑 B사이의 범위의 소수를 모두 구한다
        // 그 소수들 중에서 D를 포함하는지 확인하기
        // Contains 메서드를 통해서 D가 포함되는지 확인하기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        //소수 찾기 a부터 b까지 -> 리스트에 저장
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = a; i < b + 1; i++) {
            //소수이면 arr에 넣기
            if (decimal(i) == true) {
                arr.add(i);
            }
        }

        //소수만 있는 arr중에서 D가 포함이 되면 True 그러면 ans ++
        int ans = 0;
        int tmp;
        for (int i = 0; i < arr.size(); i++) {
            //한자리씩 끈어서 확인하기
            tmp = arr.get(i);
            while (tmp > 0) {
                if (tmp % 10 == s) {
                    ans++;
                    break;
                }
                tmp = tmp / 10;
            }
        }

        System.out.println(ans);

        br.close();

    }
}
