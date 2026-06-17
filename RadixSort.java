import java.util.Arrays;

public class RadixSort {
    // Counting Sort for a specific digit
    static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences of digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }
        // Convert count[] to cumulative count[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // Build output array (right to left for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    // Main Radix Sort function
    static void radixSort(int[] arr) {
        int max = arr[0];
        // Find maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        } 
        // Apply counting sort for each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}