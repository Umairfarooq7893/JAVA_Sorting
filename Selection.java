public class Selection {
    public static void main(String[] args) {
        int arr[] = {3, 6, 4, 8, 1, 9, 2, 10, 5};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i; // store index

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}