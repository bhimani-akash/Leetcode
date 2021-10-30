package Sorting;

public class InsertionSort {
    void sort(int[] arr, int n)
    {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int[] arr = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        System.out.println("Array before sorting");
        printArray(arr,n);

        InsertionSort insertion = new InsertionSort();
        insertion.sort(arr,n);

        System.out.println("\n\nArray after sorting");
        printArray(arr,n);
    }
}

