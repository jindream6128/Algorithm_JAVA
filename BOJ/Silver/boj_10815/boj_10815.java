package boj_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            //s랑 e는 시작이랑, 끝 index
            //닫힌구간 s랑 e모두 포함.
            //이렇게 사용하면 [14,14]일때도 있으니까 같은경우도 체크해줘야 한다
            int s = 0;
            int e = n - 1;
            //answer 값은 아무거나.
            int answer = 0;

            while (s <= e) {
                //mid 는 중간 index
                int mid = (s + e) / 2;
                if (arr[mid] == target) {
                    answer = 1;
                    break;
                }

                if (arr[mid] > target) {
                    e = mid - 1;
                } else if (arr[mid] < target) {
                    s = mid + 1;
                }
            }

            sb.append(answer).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
