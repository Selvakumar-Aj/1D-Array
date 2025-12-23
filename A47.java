package Arrays;
import java.util.Arrays;

class A47 {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        Arrays.sort(arr);
        int longest = 1, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
                longest = Math.max(longest, count);
            } else if (arr[i] != arr[i - 1]) {
                count = 1;
            }
        }
        System.out.println("Longest Consecutive Length = " + longest);
    }
}
