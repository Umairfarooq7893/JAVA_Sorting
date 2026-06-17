public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int key = 2;

        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == key){
                System.out.println("Element Found at Index " + mid);
                return;
            }
            if(arr[mid] > key){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Element Not Found");
    }
}