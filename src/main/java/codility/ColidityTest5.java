/***/
package codility;


/**
 * This is a demo task.
 * A zero-indexed array A consisting of N integers is given. An equilibrium index of this array is any integer P such that 0 ≤ P <
 * N and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
 * A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
 * Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.
 * For example, consider the following array A consisting of N = 8 elements:
 * A[0] = -1
 * A[1] = 3
 * A[2] = -4
 * A[3] = 5
 * A[4] = 1
 * A[5] = -6
 * A[6] = 2
 * A[7] = 1
 * P = 1 is an equilibrium index of this array, because:
 * A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]
 * P = 3 is an equilibrium index of this array, because:
 * A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]
 * P = 7 is also an equilibrium index, because:
 * A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
 * and there are no elements with indices greater than 7.
 * P = 8 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N.
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices. The function should return
 * −1 if no equilibrium index exists.
 * For example, given array A shown above, the function may return 1, 3 or 7, as explained above.
 * Assume that:
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * Complexity:
 * 
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified
 */
public class ColidityTest5 {
    public static void main(String[] args) {
        ColidityTest5 test = new ColidityTest5();
        System.out.println(test.solution(new int[] {100}));
        System.out.println(test.solution(new int[] {0,1}));
        System.out.println(test.solution(new int[] {-1, 3, -4, 5, 1, -6, 2, 1}));
        System.out.println(test.solution(new int[] {500, 1, -2, -1, 2}));
        System.out.println(test.solution(new int[] {-1, -1, 1}));
        
        
     }
    
    public int solution(int[] A) {
        int size  = A.length;
        long sum = 0;
        for(int P = 0; P<size; P++) {
            sum +=A[P];
        }
        if (size ==1 || sum-A[0] == 0) {
            return 0;
        }
        
        long sum1 = 0;
        long sum2 = 0;
        
        for(int P = 1; P<size; P++) {
            sum1 +=A[P-1];            
             sum2 = sum - A[P] - sum1;
             
             if (sum1 == sum2) {
                 return P;
             }
        }
        return -1;
     }
    
    
//    public int solution(int[] A) {
//       int size  = A.length;
//       if (size ==1) {
//           return 0;
//       }
//       int sum = 0;
//       for(int P = 1; P<size; P++) {
//           sum +=A[P-1];
//           int subSum = 0;
//           for(int Q = P+1; Q<size; Q++) {
//               subSum +=A[Q];
//           }
//           if (sum == subSum) {
//               return P;
//           }
//       }
//       return -1;
//    }
}


