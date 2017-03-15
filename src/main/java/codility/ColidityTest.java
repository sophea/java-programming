/***/
package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
/**A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
 *  and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to 
the right by K indexes.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
*/
public class ColidityTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ColidityTest test = new ColidityTest();
         //System.out.println(Arrays.toString(test.solution(new int[] {-1, -2, -3, -4, -5, 3, 8, 9, 7, 6},3)));
       
         //incase K > size
         //[-1, -2, -3, -4, -5, -6], 10
         //result [-3, -4, -5, -6, -1,-2]
        
        test.solution(1,10,10);
    }
    public int[] solution(int[] A, int K) {
       
        // write your code in Java SE 8
        //System.out.println(Arrays.toString(A));
        //System.out.println(K);
        int size = A.length;
        if (size <= 0) {
            return A;
        }
        int[] result = new int[size];
        int index =0;
        while (K >=size) {
            K = K-size;
        }
        for (int i = size-K; i<size; i++) {
            result[index++] =A[i];
        }
        //
        for(int i =0; i<size-K;i++) {
            result[index++] =A[i];
        }
        
        return result;
    }

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        float result = (Y-X) *100/ D;
        int i = (int)Math.ceil(result/100);
        System.out.println(i);
        return i;
    }
}
