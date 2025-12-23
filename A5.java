package Arrays;
import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0)
                sum += arr[i];
            else
                sum -= arr[i];
        }

        System.out.println("Alternate sum = " + sum);
    }
}
