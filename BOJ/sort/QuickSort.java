public class QuickSort {
    static int[] arr = {9,3,5,4,2,6,1,8,7};

    public static void main(String[] args) {
        quickSort(arr, 0, arr.length - 1); //arr배열과 Start point end point
        for (int num : arr) {
            System.out.println(num);
        }

    }

    public static int partition(int[] arr, int start, int end) {
        //start end는 index 중간값 = pivot
        int pivot = arr[(start + end) / 2];
        while (start <= end) {

            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;

            if (start <= end) {
                int tmp = arr[end];
                arr[end] = arr[start];
                arr[start] = tmp;

                start++;
                end--;
            }
        }
        return start;
    }
    public static void quickSort(int[] arr, int start, int end) {
        //BigIndex 는 pivot 값을 기준으로 작은쪽 한개, 큰쪽 한개로 두개 나눈다 (큰쪽에 pivot값 포함되도록)
        //BigIndex는 그중에서 큰 배열의 index
        int BigIndex = partition(arr, start, end);
        if (start < BigIndex - 1) {
            quickSort(arr, start, BigIndex - 1);
        }
        if (end > BigIndex) {
            quickSort(arr, BigIndex, end);
        }
    }

}
