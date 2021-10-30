package Sorting.BubbleSort;

public class OptimizedBubbleSort {

    void bubbleSort(int[] arr, int n) {
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n-1; i++) {
            swapped = false;

            for (j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swapped = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if (!swapped) break;
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

        OptimizedBubbleSort sort = new OptimizedBubbleSort();
        sort.bubbleSort(arr, n);
        System.out.println("Sorted Array : ");
        sort.displayArray(arr, n);
    }
}
