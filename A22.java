package Arrays;
import java.util.Arrays;

class A22 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 2, 5};
        int k = 2;

        Arrays.sort(arr);  // ascending
        System.out.println(k + "th Maximum = " + arr[arr.length - k]);
    }
}
