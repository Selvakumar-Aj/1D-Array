package Arrays;
class A18 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 7, 5};
        int max = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
        }
        System.out.println("Maximum = " + max);
    }
}
