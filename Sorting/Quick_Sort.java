public class Quick_Sort {
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1)
                i++;
            while(arr[j]>pivot && j>=low+1)
                j--;
            if(i<j)
                swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {5,7,9,3,4,2};
        quicksort(arr,0,arr.length-1);
        for(int i: arr)
            System.out.print(i+" ");
    }
    
}
