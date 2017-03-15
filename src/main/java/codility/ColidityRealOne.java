/***/
package codility;

//https://codility.com/c/feedback/VAJHKD-SWZ
/**
 
 */
public class ColidityRealOne {
    public static void main(String[] args) {
        ColidityRealOne test = new ColidityRealOne();
//        System.out.println(test.solution(new int[] {100}));
//        System.out.println(test.solution(new int[] {0,1}));
//        System.out.println(test.solution(new int[] {-1, 3, -4, 5, 1, -6, 2, 1}));
//        System.out.println(test.solution(new int[] {500, 1, -2, -1, 2}));
//        System.out.println(test.solution(new int[] {-1, -1, 1}));
        
       int K = 2;
       int L = 0  ;
       int M = 8 ;
       int N = 5;
       int P = 3  ;
       int Q = 2 ; 
       int  R = 6  ;  
       int S = 4;
        
        K = -4;
        L = 1;
        M = 2;
        N = 6;
        P = 0;
        Q = -1;
        R = 4;
        S = 3;
       System.out.println(test.solution(K, L, M, N, P, Q, R, S));       
     }
//    
//    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
//        long area1 = Math.abs(K - M) * Math.abs(L - N);
//        long area2 = Math.abs(P - R) * Math.abs(Q - S);
//        
//        //check area sum over value 2,147,483,647.
//        if (area1 + area2 > 2147483647L) {
//            return -1;
//        }
//        
//        int intersectArea = 0;
//
//        if (M > P && M < R && L > Q && L < S) {
//            // intersect bottom right
//            intersectArea = Math.abs(Math.max(P, K) - M) * Math.abs(Math.min(S, N) - L);
//        }
//        else if (K > P && K < R && L > Q && L < S) {
//            // intersect bottom left
//            intersectArea = Math.abs(Math.min(R, M) - K) * Math.abs(Math.min(S, N) - L);
//        }
//        else if (M > P && M < R && N > Q && N < S) {
//            // intersect top right
//            intersectArea = Math.abs(Math.max(P, K) - M) * Math.abs(Math.max(L, Q) - N);
//        }
//        else if (K > P && K < R && N > Q && N < S) {
//            // intersect top left
//            intersectArea = Math.abs(Math.min(R, M) - K) * Math.abs(Math.max(L, Q) - N);
//        }
//        return (int) (area1 + area2 - intersectArea);
//    }
    
    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
        long area1 = Math.abs((K - M) * (L - N));
        long area2 = Math.abs((P - R) * (Q - S));
        long area = area1 + area2;

        if (!(M < P || R < K || N < Q || S < L)) {
            if (P >= K && Q >= L && R <= M && S <= N) {
                // rectangle is inside
                area -= area2;
            }
            else if (P <= K && Q <= L && R >= M && S >= N) {
                area -= area1;
            }
            else {
                area -= Math.abs((P - M) * (L - S));
            }
        }

        if (area > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) area;
    }
}


