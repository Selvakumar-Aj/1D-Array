package Arrays;
class A43 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int count = 0, candidate = 0;
        for (int x : arr) {
            if (count == 0) candidate = x;
            count += (x == candidate) ? 1 : -1;
        }
        count = 0;
        for (int x : arr) if (x == candidate) count++;
        System.out.println(count > arr.length / 2 ? 
            "Majority Element = " + candidate : "No Majority Element");
    }
}
