public class RadixSort {

    public static int getMax(int arr[], int n) {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void countingSort(int arr[], int n, int exp) {

        int output[] = new int[n];
        int count[] = new int[10];

        // Count occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;

            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void radixSort(int arr[], int n) {

        int max = getMax(arr, n);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    public static void main(String[] args) {

        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;

        radixSort(arr, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}