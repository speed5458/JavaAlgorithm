import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 5, 2, 8, 6, 7, 9, 8};

        for (int i = 0; i < arr.length-1; i++) {
            int min_val = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < min_val) min_val = j;
            }
            swap(arr, i, min_val);
        }
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
