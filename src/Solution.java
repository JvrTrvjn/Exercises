public class Solution {
    public static int maxMultiplesOf3(int[] arr) {
        int max = 0;

        for (int i : arr)
            if (i % 3 == 0 && i > max)
                max = i;
        return max;
    }

    public static void main(String[] args) {
        int[] myArrayTest = {6, -102, 1005, 200, 333, 8, -99, 0, 342};
        System.out.println(maxMultiplesOf3(myArrayTest));
    }
}
