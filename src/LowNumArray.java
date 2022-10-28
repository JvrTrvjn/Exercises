public class LowNumArray {
    static int solution(int[] A){
        int ans = A[0];
        for (int i = 1; i < A.length; i++){
            if(ans > A[i]){
                ans = A[i];
            }
        } return ans;
    }
    public static void main(String[] args) {
        int [] myArray = {4,7,11,9,8,21,2};
        System.out.println(solution(myArray));
    }
}