package boj_1913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1913 {
    //달팽이 크기
    static int n;
    //찾아야하는 숫자
    static int k;

    //달팽이 배열
    static int[][] arr;

    //방향 벡터
    //{위, 오른쪽, 아래, 왼쪽};
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        //n*n 달팽이 배열
        arr = new int[n][n];

        //현재 x,y좌표 (1로서 시작되는 곳)
        int x = (n / 2) + 1;
        int y = (n / 2) + 1;

        //방향 인덱스 번호
        int index = 0;

        //시작지점 가운데 -> x,y좌표의 가운데
        arr[x][y] = 1;

        //다음 좌표
        int nx , ny;
        //이제 25까지 반복
        while (true) {
            nx = x + dx[index];
            ny = y + dy[index];
            //좌표가 범위 안에 있어야 한다. 그리고 아직 수를 넣지않았다.
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 0) {
                //증가된 숫자를 넣어준다.
                arr[nx][ny] = arr[x][y] + 1;

                //마지막 숫자를 넣었으면 종료
                if (arr[nx][ny] == n * n) break;

                //그리고 좌표 갱신
                x = nx;
                y = ny;
            } //next x, next y좌표가 범위를 벗어나거나, 이미 안에 수가 들어가있다면, index증가
            else {
                //범위를 벗어난다면 index를 늘려준다.
                //계속 반복되는거니까 모듈러 연산 해주기
                index = (index + 1) % 4;
            }
        }

        //우리가 찾아야 하는 정답 x,y좌표
        int ansx =0;
        int ansy =0;

        for(int i = 0; i<n; i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == k){
                    ansx = i+1;
                    ansy = j+1;
                }
                sb.append(arr[i][j] +" ");
            }
            sb.append("\n");
        }

        sb.append(ansx + " " + ansy);
        System.out.println(sb);
    }

}

