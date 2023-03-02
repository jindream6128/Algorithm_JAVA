package boj_13423;

import java.io.*;
import java.util.*;

public class boj_13423c2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            List<Integer> arr = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr);
            int cnt = 0;

            for (int s = 0; s < n - 2; s++) {
                int e = s + 2;
                for (int m = s + 1; m < n - 1; m++) {
                    int num = arr.get(m) - arr.get(s);
                    while (e < n && arr.get(e) - arr.get(m) < num) {
                        e++;
                    }

                    if (e == n) {
                        break;
                    }

                    if (arr.get(e) - arr.get(m) == num) {
                        cnt++;
                    }

                }
            }

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
