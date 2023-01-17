import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_7696_2 {

    //사용했는지 확인하기 위한 checklist
    static boolean[] used;

    public static boolean check(int num){
        //초기화
        for(int i =0; i<10;i++){
            used[i] = false;
        }
        while(num>0){
            //한자리씩 끈어서 생각
            if(used[num%10]){
                return false;
            }
            used[num%10] = true;
            num /=10;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //순서대로 1_000_000개의 숫자가 저장될 리스트
        int[] ans = new int[1_000_001];

        int now =1;
        int count=0;
        ans[1] =1;

        used = new boolean[10];
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            if(n < now){
                System.out.println(ans[n]);
                continue;
            }

            while(now <= n){
                count ++;
                if(check(count)){
                    ans[now] = count;
                    now++;
                }
            }
            System.out.println(ans[n]);
        }

    }


}
