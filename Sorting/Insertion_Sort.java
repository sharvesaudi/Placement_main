//compares the current element and next element.... if next element smaller, it gets compared
//till it is smaller than the left elements
//https://www.geeksforgeeks.org/insertion-sort/
public class Insertion_Sort {
    public static void main(String[] args){
        int[] arr = {5,7,1,5,7,93,2};
        
        for(int i=0;i<arr.length-1;i++){
            int j = i;
            //iterates till the smallest elemnt finds its position in left side
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
        for(int i: arr)
            System.out.print(i+" ");
    }
}
