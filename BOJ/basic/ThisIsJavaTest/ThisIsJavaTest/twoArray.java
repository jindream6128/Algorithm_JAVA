package ThisIsJavaTest;

import java.util.Arrays;
import java.util.Scanner;

public class twoArray {

    // 일단 2 5 지정하기
    int[][] arr = new int[2][5];

    // 해당 값의 index 넣기
    static StringBuilder searchBuilder = new StringBuilder();

    // isFull -> 전부다 찾는지 확인하기 -> 마지막 꺼만 check;
    public boolean isFull() {
        // 제일 마지막 값이 0이 아니면 꽉찬거임.
        if (arr[arr.length - 1][arr[0].length - 1] != 0)
            return true;
        return false;
    }

    //emptyIndex -> 비어있으면 비어있는거의 해당 index 반환
    //emptyIndex -> 비어있지 않으면 0이 반환된다
    // emptyIndex -> 비어있는지 확인 -> 비면 해당 인덱스 리턴
    // 만약 tmp의 값이 tmp[0]의 값이 0 이면 비어있는거임
    public int[] emptyIndex() {
        int[] tmp = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    tmp[0] = i;
                    tmp[1] = j;
                    return tmp;
                }
            }
        }
        return tmp;
    }

    // increment -> 꽉찾을때 2 5 -> 3 5 로 늘려주기
    public void increment() {
        // isFull-> 꽉찾을때만 확장해준다
        if (isFull()) {
            // tmp -> arr랑 같은 사이즈의 배열을 선언해놓고,
            // 같은 배열을 복사해놓는다
            int[][] tmp = new int[arr.length][arr.length];
            for (int i = 0; i < tmp.length; i++) {
                for (int j = 0; j < tmp[0].length; j++) {
                    tmp[i][j] = arr[i][j];
                }
            }

            arr = new int[arr.length + 1][arr[0].length];
            for (int i = 0; i < tmp.length; i++) {
                for (int j = 0; j < tmp[0].length; j++) {
                    arr[i][j] = tmp[i][j];
                }
            }
        }

    }

    // search ->해당 값의 인덱스 반환
    // 해당 값을 찾았을때 그냥 sb에 넣기
    public void search(int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == n) {
                    searchBuilder.append("arr[" + i + "]" + "[" + j + "]").append(" / ");
                }
            }
        }
    }

    // modify -> 해당값을 넣으면 해당 자리에 수정할값 넣기 void
    public void modify(int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == a) {
                    arr[i][j] = b;
                }
            }
        }
    }

    // 특정 값 n 삭제 -> 해당 값을 찾아서 해당 자리에 0으로 바꾸기
    public void delete(int n) {
        // for 문 다돌고 나면 0인거 앞으로 땡겨줘야함
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == n) {
                    arr[i][j] = 0;
                }
            }
        }
        // 아직 안땡겨줌

    }

    // add 일단 한개만 추가할때
    public void add(int n) {
        // 가득 차 있으면 확장시켜야함
        if (isFull()) {
            increment();
            //여기가 이상한데?
            // 0이면 비어있지 않은거다
            if (emptyIndex()[0] != 0) {
                arr[emptyIndex()[0]][emptyIndex()[1]] = n;
            }
        } else {
            if (emptyIndex()[0] != 0) {
                arr[emptyIndex()[0]][emptyIndex()[1]] = n;
            }
        }

    }

    // add 매개변수 2개 들어갈때
    /*
     * public void add() {
     *
     * }
     */

    // main메서드 -> 입력받고 -> switch 돌려서 진행하기
    public static void main(String[] args) {
        twoArray t = new twoArray();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: add 2: search 3: modify 4: delete 5: print 6: exit");

            int tc = sc.nextInt();

            switch (tc) {

                case 1:
                    System.out.println("1 이상의 add할 값 1개 입력해 주세요");
                    int tc1 = sc.nextInt();
                    t.add(tc1);
                    break;

                case 2:
                    System.out.println("search 할 값을 입력해 주세요");
                    int tc2 = sc.nextInt();
                    System.out.println(searchBuilder);
                    break;
                // 넣고 출력하기

                case 3:
                    System.out.println("원본값 a와 수정할 값 b를 입력해 주세요");
                    int tc3 = sc.nextInt();
                    int tc4 = sc.nextInt();
                    t.modify(tc3, tc4);
                    break;

                case 4:
                    System.out.println("삭제할 값을 입력해 주세요");
                    int tc5 = sc.nextInt();
                    t.delete(tc5);
                    break;

                case 5:
                    System.out.println(Arrays.deepToString(t.arr));
                    break;

                case 6:
                    System.exit(0);
            }
        }

    }

}

