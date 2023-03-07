import java.io.*;
import java.util.*;

public class Template {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n= Integer.parseInt(st.nextToken());
        arr = new int[n];
        visited = new boolean[m+1];

        recur(0);

        bw.close();
        br.close();
    }

    static void recur(int cur) throws IOException {
        if (cur == n) {
            for(int num: arr){
                System.out.println(num);
            }
            return;
        }

        for (int i = 1; i < m+1; i++) {
            if (visited[i]) {
                continue;
            }

            arr[cur] = i;
            visited[i] = true;
            recur(cur + 1);
            visited[i] = false;

        }

    }

}