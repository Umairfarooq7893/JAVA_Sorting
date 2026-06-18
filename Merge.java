public class Merge {
    public static void merge(int arr[], int low, int mid, int high) {
        int l = mid-low+1;
        int r = high-mid;

        int[] left  = new int[l];
        int[] right = new int[r];

        for(int i=0 ;i<l;i++){
            left[i] = arr[low+i];
        }
        for(int i=0 ;i<r;i++){
            right[i] = arr[mid+1+i];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while(i<l && j<r){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<l){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<r){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if(high>low){
        int mid = low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 8, 1, 9, 2, 10, 5};
        int n = arr.length;

        mergeSort(arr, 0, arr.length - 1);

        for(int i = 0 ;i < n ; i++){
            System.out.print(arr[i]+" ");

        }
    }
}
