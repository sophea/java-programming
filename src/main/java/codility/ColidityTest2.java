/***/
package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
/**A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, 
 * and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Assume that:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
*/
public class ColidityTest2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ColidityTest2 test = new ColidityTest2();
        
        int[] A = new int[7];
                A[0] = 9; 
                A[1] = 3;
                A[2] = 9;
                A[3] = 3 ; 
                A[4] = 1900000000 ; 
                A[5] = 3;
                A[6] = 9;
               System.out.println(test.solution(new int[] {91, 69, 77, 91, 26, 64, 91, 88, 58, 17, 42, 100, 11, 32, 96, 45, 21, 32, 91, 34, 43, 63, 81, 50, 9, 58, 4, 10, 20, 70, 29, 70, 17, 12, 3, 71, 86, 22, 24, 2, 65, 31, 14, 65, 60, 45, 16, 64, 56, 44, 17, 93, 87, 69, 100, 59, 35, 12, 61, 52, 44, 100, 84, 12, 89, 1, 66, 32, 73, 96, 54, 77, 6, 67, 12, 46, 34, 8, 75, 10, 26, 9, 67, 31, 5, 3, 22, 51, 2, 3, 67, 53, 14, 32, 13, 28, 39, 22, 20, 23, 42, 91, 69, 77, 91, 26, 64, 91, 88, 58, 17, 42, 100, 11, 32, 96, 45, 21, 32, 91, 34, 43, 63, 81, 50, 9, 58, 4, 10, 20, 70, 29, 70, 17, 12, 3, 71, 86, 22, 24, 2, 65, 31, 14, 65, 60, 45, 16, 64, 56, 44, 17, 93, 87, 69, 100, 59, 35, 12, 61, 52, 44, 100, 84, 12, 89, 1, 66, 32, 73, 96, 54, 77, 6, 67, 12, 46, 34, 8, 75, 10, 26, 9, 67, 31, 5, 3, 22, 51, 2, 3, 67, 53, 14, 32, 13, 28, 39, 22, 20, 23}));
    }
    
//    public int solution(int[] A){
//
//        Arrays.sort(A);
//        
//        int res = 0;
//        for (int i : A ) {
//            res = res ^ i; // Implementation of XOR
//        }
//        return res;
//        }
    
    public int solution(int[] A) {
        System.out.println(A.length);
      System.out.println(Arrays.toString(A));
       Arrays.sort(A);
        System.out.println("Sorted Array : "+ Arrays.toString(A));
        
        Set<Integer> allValue = new HashSet<>();
        for (int i : A) {
            if (allValue.contains(i)) {
                allValue.remove(i);
            }else {
                allValue.add(i);
            }
        }
        //return one left
        return allValue.iterator().next();
    }
    
    //wrong one in case the same value 3,3,3
//    public int solution(int[] A) {
//        
//        
//        // System.out.println("Array : "+ Arrays.toString(A));
//         //Arrays.sort(A);
//         //System.out.println("Sorted Array : "+ Arrays.toString(A));
//         Integer numberFound = 0;
//         int result = 0;
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i : A) {
//             numberFound = map.get(i);
//             map.put(i, numberFound == null ? 1 : numberFound+1);
//         }
//         for (Entry<Integer, Integer> item : map.entrySet()) {
//             if (item.getValue() == 1) {
//                 return item.getKey();
//             }
//         }
//         return result;
//     }

}
