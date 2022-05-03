import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args){
        int[] arr = new int[]{3,1,5,2,8,6,7,9,8};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j+1] < arr[j]) swap(arr, j+1, j);
            }
        }
        for (int x :
                arr) {
            System.out.printf(x + " ");
        };

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
