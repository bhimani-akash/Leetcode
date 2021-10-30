package Sorting;

public class SelectionSort {

    void sort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int min_id = i;

            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_id])
                    min_id = j;
            }

            int temp = arr[min_id];
            arr[min_id] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        System.out.println("Array before sorting");
        printArray(arr,n);

        SelectionSort selection = new SelectionSort();
        selection.sort(arr,n);

        System.out.println("\n\nArray after sorting");
        printArray(arr,n);
    }

}
