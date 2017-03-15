/***/
package codility;

import java.util.HashSet;
import java.util.Set;


/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
/**Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

For example, given:

  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
the function should return 5.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
*/
public class ColidityTest6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ColidityTest6 test = new ColidityTest6();
        
        System.out.println(test.solution(new int[] {1, 3, 6,4,1,2}));
     }
    
    public int solution(int[] A) {
        Set<Integer> list =new HashSet<>();
        for (int value : A) {
            if (value >0) {
                list.add(value);
            }
        }
        Integer i = 1;
        System.out.println(list);
        while (list.contains(i)) {
           ++i;
        }
        return i;
    }
}

