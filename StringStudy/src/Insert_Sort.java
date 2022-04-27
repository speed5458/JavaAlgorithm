import java.util.Arrays;

public class Insert_Sort {
    public static void main(String[] args){
        int[] arr = new int[]{3,1,5,2,8,6,7,9,8};

        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i-1;
            while (j >= 0 && target < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }

        System.out.println(Arrays.toString(arr));
    }

}
