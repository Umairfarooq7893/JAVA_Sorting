import java.util.ArrayList;
import java.util.Collections;

public class bucket {

    public static void bucketSort(int arr[], int n) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        if (max == min)
            return;

        ArrayList<Integer>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int index = (arr[i] - min) * (n - 1) / (max - min);
            buckets[index].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int val : buckets[i]) {
                arr[k++] = val;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 6, 4, 7, 5, 9, 0, 8};
        int n = arr.length;

        bucketSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


