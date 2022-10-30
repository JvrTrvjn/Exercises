import java.util.Scanner;

public class Day7HackerRank {
    public static void Day7() {
        Scanner in = new Scanner(System.in);

        Integer n = in.nextInt();
        Integer[] arr = new Integer[n];

        for (Integer i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (Integer i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Day7();
    }
}
