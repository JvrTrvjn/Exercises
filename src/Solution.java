public class Solution {
    public static int maxMultiplesOf3(Integer[] arr) {
       Integer max = arr[0];

        for (Integer numberArray : arr)
            if (numberArray % 3 == 0 && numberArray > max)
                max = numberArray;
        return max;
    }

    public static void main(String[] args) {
        Integer[] myArrayTest = {-100, -102, -1005, -200, -333, -8, -99, -0, -342};
        System.out.println(maxMultiplesOf3(myArrayTest));
    }
}
