//we choose the minimum value in the array and swap with the current index
//https://www.geeksforgeeks.org/selection-sort/
public class Selection_Sort {
    public static void main(String[] args){
        int[] arr = {5,7,1,5,7,93,2};
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index])
                    min_index = j;
                    
                    int temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
            }
        }
        for(int i: arr)
            System.out.print(i+" ");
    }
}
