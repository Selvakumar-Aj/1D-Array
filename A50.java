package Arrays;
class A50 {
    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2, 4};
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        int n = c.length;
        double median = (n % 2 == 0) ?
                (c[n / 2 - 1] + c[n / 2]) / 2.0 :
                c[n / 2];
        System.out.println("Median = " + median);
    }
}
