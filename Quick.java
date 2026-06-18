public class Quick {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int j = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                j++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j + 1];
        arr[j + 1] = arr[high];
        arr[high] = temp;

        return j + 1;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 8, 1, 9, 2, 10, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
