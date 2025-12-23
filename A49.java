package Arrays;
class A49 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        boolean[] present = new boolean[max + 1];
        for (int x : arr) {
            if (x > 0 && x <= max) present[x] = true;
        }
        for (int i = max; i >= 1; i--) {
            if (!present[i]) {
                System.out.println("Largest Missing Positive = " + i);
                return;
            }
        }
        System.out.println("No missing positive number");
    }
}
