package Arrays;
class A37 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        k = k % n;
        for (int r = 0; r < k; r++) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
