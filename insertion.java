public class insertion{
    public static void main(String[] args){
        int arr[] = {1,9,2,8,3,7,4,6,5};
        int n = arr.length;

        for(int i = 1 ; i < n ; i ++){
            int key = arr[i];
            int previous = i-1;

            while(previous >= 0 && arr[previous]>key){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1]= key;
        }

        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}