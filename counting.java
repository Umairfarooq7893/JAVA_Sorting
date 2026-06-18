public class counting {
    public static void CountingSort(int arr[],int n){

        int max = arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int[] Count = new int[max+1];

        for(int i=0 ;i<n;i++){
        Count[arr[i]]++;
        }

        int index = 0;
        for(int i=0 ; i<max ;i++){
            while(Count[i]>0){
                arr[index] = i;
                index++;
                Count[i]--;
            }
        }
    }
    public static void main (String[] args){
        int arr[] ={3, 6, 4, 8, 1, 9, 2, 10, 5};
        int n = arr.length;

        CountingSort(arr,n);
        for(int i=0 ; i<n ;i++){
        System.out.print(arr[i]+" ");
        }
    }
}




