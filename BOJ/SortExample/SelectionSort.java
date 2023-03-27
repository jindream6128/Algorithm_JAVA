import java.util.Scanner;

public class SelectionSort {
    static int n;
    static int[] arr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        //선택정렬
        SelectionSort(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
    //5 4 3 2 1 돌면서 제일 작은값 잡고 앞에서 부터 채워넣기
    static void SelectionSort(int[] arr){
        int MinIndex;
        int tmp;
        // i가 0 일때 뒤에 1 2 3 4 전부다 돌면서 최솟값의 index만 찾기
        for(int i =0;i<arr.length;i++){
            MinIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[MinIndex]>arr[j]){
                    MinIndex = j;
                    //여기서 제일작은 인덱스 반환
                }
            }
            //바꿔주기
            tmp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = tmp;
        }
    }
}
