package Arrays;
import java.util.Arrays;

class A23 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 2, 5};
        int k = 3;

        Arrays.sort(arr);
        System.out.println(k + "th Minimum = " + arr[k - 1]);
    }
}
