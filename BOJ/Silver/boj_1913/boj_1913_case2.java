package boj_1913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1913_case2 {
    //달팽이 크기
    static int n;
    //찾아야하는 숫자 (입력)
    static int k;
    //달팽이 배열
    static int[][] arr;

    //방향벡터 (아래 - 오른쪽 - 위 - 왼쪽))
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n =Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        int tmp = n*n;

        //현재 x,y좌표값
        int curX = 0;
        int curY = 0;

        //다음 xy좌표
        int nx;
        int ny;

        //방향벡터 인덱스
        int index = 0;

        arr[curX][curY] = tmp;

        //tmp가 1까지 돌아라
        while(true){
            nx = curX + dx[index];
            ny = curY + dy[index];
            //아무것도 안들어가있어야 한다.
            if(nx>=0 && ny>=0 && nx<n && ny<n && arr[nx][ny] == 0){
                tmp--;
                arr[nx][ny]=tmp;
                if(tmp == 1){
                    break;
                }
                curX = nx;
                curY = ny;
            } //범위를 벗어난다 그러면 index증가
            else{
                index = index+1;
                if(index>=4){
                    index -=4;
                }
            }
        }

        //정답 찾기
        int ansx= 0;
        int ansy = 0;

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]==k){
                    ansx = i+1;
                    ansy = j+1;
                }
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }

        sb.append(ansx+" "+ansy);
        System.out.println(sb);
        br.close();
    }

}
