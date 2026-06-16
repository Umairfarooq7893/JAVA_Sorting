public class LinearSearch{

    public static void main(String[] args){
        int arr[] = {10, 25, 30, 45, 50 ,60};
        int keyTarget = 1;

        int n = arr.length;
        for(int i = 0; i< n ; i++){
            if(arr[i] == keyTarget){
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    } 
}
