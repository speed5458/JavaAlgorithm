import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int[] arr = new int[]{3,1,5,2,8,6,7,9,8};

        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr,i,min_index);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
