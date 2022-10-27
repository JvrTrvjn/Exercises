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

       /* Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        in.nextLine();

        for (int i = 1; i < N; i++){
            for (int j = 1; j < N; j++){
                System.out.print(i + " x " + j + " = " + (i * j));
                System.out.println();
            }
        }
            in.close();*/
    }
}
