package Sorting;

public class ShellSort {

    void sort(int[] arr, int n) {
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j-gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        System.out.println("Array before sorting");
        printArray(arr, n);

        ShellSort shell = new ShellSort();
        shell.sort(arr,n);

        System.out.println("\n\nArray after sorting");
        printArray(arr,n);
    }
}
