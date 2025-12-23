package Arrays;
class A48 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int n = arr.length;
        boolean[] present = new boolean[n + 1];
        for (int x : arr) {
            if (x > 0 && x <= n) present[x] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println("Smallest Missing Positive = " + i);
                return;
            }
        }
        System.out.println("Smallest Missing Positive = " + (n + 1));
    }
}
