import java.io.*;
import java.util.StringTokenizer;

public class boj_2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //n*m 공백으로 받아오기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //행렬 A
        int[][] A = new int[n][m];
        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //행렬 B
        int[][] B = new int[n][m];
        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //A+B행렬
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                ans[i][j] = A[i][j] + B[i][j];
                bw.write(String.valueOf(ans[i][j])+" ");
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
