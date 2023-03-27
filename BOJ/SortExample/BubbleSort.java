import java.util.Scanner;

public class BubbleSort {
    static int n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Bubble Sort
        BubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //앞에서부터 2개씩 바로 자기 옆에꺼랑 비교해서 작은거 앞으로 큰거 뒤로
    //시간복잡도를 계산하면 (n-1) * (n-2) * ....* 2 * 1
    // (n-1) * n /2 -> O(n^2)
    //계속 제일 앞에꺼부터 비교하기 -> O(n^2) -> 앞에서부터
    static void BubbleSort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }
}
