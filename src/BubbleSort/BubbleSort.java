package BubbleSort;

public class BubbleSort {

    void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 123, 252, 127, 212, 101, 900};
        int n = arr.length;

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr, n);
        System.out.println("Sorted Array : ");
        sort.displayArray(arr, n);
    }
}
