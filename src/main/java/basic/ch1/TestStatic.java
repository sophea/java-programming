package basic.ch1;

public class TestStatic {
    public  int age =5;
    public static void main(String[] args) {
       
        TestStatic obj1 = new TestStatic();
        
        obj1.age = 50;
        
        TestStatic obj2 = new TestStatic();
        System.out.println(obj2.age);
        obj2.age=3;
        
        System.out.println(obj1.age);
    }

}
