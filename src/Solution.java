public class Solution {
    public static Integer maxMultiplesOf3(Integer[] arr) {
       Integer max = arr[0];

        for (Integer numberArray : arr)
            if (numberArray % 3 == 0 && numberArray > max)
                max = numberArray;
        return max;
    }
    public static void main(String[] args) {
        Integer [] myArray = {4,7,11,9,8,21,2};
        System.out.println(maxMultiplesOf3(myArray));

    }


        }



