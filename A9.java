package Arrays;
import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }

        System.out.println("Array after moving negatives:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
