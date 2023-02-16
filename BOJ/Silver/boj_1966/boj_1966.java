package boj_1966;

import java.io.*;
import java.util.*;

public class boj_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            //Queue로 활용 할 연결 리스트
            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            /*
            맨처음에 들어가있는 위치랑, 중요도를 함께 넣어야한다 1:2 이런식으로
            why? 그게 아니라면 나중에 중요도를 기준으로 뒤로 뺐을때 그게
            언제 나가는지 알수 없기 때문이다.
             */

            for (int j = 0; j < n; j++) {
                q.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            //출력 횟수
            int cnt = 0;

            //하나의 tc에 대해서 전부 출력한다가 찾는 값이 나오면 멈춘다.
            // !q.isEmpty() -> q가 비어있으면 true 아니면 false 따라서 비어있지 않다면 반복
            while (!q.isEmpty()) {
                //제일 앞에 원소
                int[] first = q.poll();
                //제일 앞에 원소가 가장 큰 수인지 확인하기
                boolean firstMax = true;

                //가장 큰지 제일앞에 원소가 제일 큰지 비교하기
                for (int a = 0; a < q.size(); a++) {
                    //중요도가 더 높은 원소가 존재한다
                    if (first[1] < q.get(a)[1]) {
                        //제일 뒤로 뺀다
                        q.offer(first);
                        for (int b = 0; b < a; b++) {
                            q.offer(q.poll());
                        }

                        //제일 큰 원소가 아니니까 false로 바꾸기
                        firstMax = false;
                        break;
                    }
                }
                //그러고 다시 제일앞에온 원소 체크하기
                if (firstMax == false) {
                    continue;
                }

                //가장 큰 원소라면 출력해야 한다. -> 그리고 그 원소가 언제 출력되는지 확인하기
                // -> cnt의 수를 sb에 넣어주면 된다.
                cnt++;
                if (first[0] == m) {
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
