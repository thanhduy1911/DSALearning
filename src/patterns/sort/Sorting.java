package patterns.sort;

public class Sorting {
    private static void printArray(int no, int[] arr) {
        System.out.printf("%d: ", no);
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray(i, arr);
            if (isSorted) break;
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                // Tìm min [i,n]
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }

            printArray(i, arr);
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // Chen arr[i] vao day 0 -> i - 1
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
            printArray(i, arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 7, 8, 1, 2 };
        //int[] arr = new int[]{1, 2, 3, 4, 5, 6, 8, 9};
        //bubbleSort(arr);
        insertionSort(arr);
    }
}
