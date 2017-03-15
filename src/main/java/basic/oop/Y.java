package basic.oop;

public class Y {
    public static void main (String args []) {
        X Obj = new X();
        double result;
        Obj.methodA(20);
        Obj.methodA(20, 30);
        
        result = Obj.methodA(5.5);
        System.out.println("Answer is:" + result);
    }
 }
