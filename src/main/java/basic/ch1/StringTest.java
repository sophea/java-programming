package basic.ch1;

public class StringTest {
    public static final String CONSTANT = "someConstant";
    
    private static final String BASIC = "BASIC ";
    
    public static void main(String[] args) {
        
        test1() ;
        
        System.out.println();
        System.out.println();
        test2();
        
        System.out.println();
        System.out.println();
        test3();
        
        System.out.println();
        System.out.println();
        test4();
        
        System.out.println();
        System.out.println();
       // test5();
        
        testStringMethods();
    }
    public static void testStringMethods() {
        
        String data ="Basic sophea:mak123";
        String authValue = new String(data.substring(BASIC.length()));
        System.out.println(authValue);
        
        System.out.println("========username======" + getClientUsername(authValue));
        System.out.println("========password======" + getClientPassword(authValue));
    }
    protected static String getClientUsername(final String authValue) {
        String username = authValue;
        final int endIndex = authValue.indexOf(':');
        if (-1 < endIndex) {
            username = authValue.substring(0, endIndex);
        }
        return username;
    }

    protected static String getClientPassword(final String authValue) {
        String password = authValue;
        final int beginIndex = authValue.indexOf(':');
        if (-1 < beginIndex) {
            password = authValue.substring(beginIndex + 1);
        }
        return password;
    }
    
    public static void test1() {
        System.out.println("Compare two string by equals() instead ==");
        String s1 = "string"; 
        String s2 = "string"; 
        String s3 = new String("string");
        String s4 = s3;
        String s5 = "str"+"ing";        
        System.out.println("s1==s2      :"+(s1==s2)); //true
        System.out.println("s1==s3      :"+(s1==s3)); //false
        System.out.println("s1.equals(s3)   :"+s1.equals(s3)); //true
        System.out.println("s3==s4      :"+(s3==s4)); // true
        System.out.println("s3.equals(s4)   :"+s3.equals(s4)); // true
        System.out.println("s1==s5      :"+(s1==s5)); // true
        System.out.println("s1.equals(s5)   :"+s1.equals(s5)); // true
        
//        s1==s2      :true
//        s1==s3      :false
//        s1.equals(s3)   :true
//        s3==s4      :true
//        s3.equals(s4)   :true
//        s1==s5      :true
//        s1.equals(s5)   :true
        
    }
    
    public static void test2() {
        System.out.println("===========Use StringBuilder for String concatenations instead of + operator========");
        
        String finalString = "";
        long startTime = System.nanoTime();
        for(int i=0;i<10;i++) {
            finalString = finalString + i;
        }
        long endTime = System.nanoTime();
        System.out.println(String.format("String opetation with + operator took [%d] nano seconds",(endTime-startTime)));
        
        StringBuilder builder = new StringBuilder();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++) {
            builder.append(i);
        }
        endTime = System.nanoTime();
        System.out.println(String.format("String opetation with StringBuilder took [%d] nano seconds",(endTime-startTime)));
    }
    
    public static void test3() {
        System.out.println("Use String.valueOf() instead of toString()");
        StringTest test = null;
        // Below statement will not throw NPE
       System.out.println(String.valueOf(test));
       // Next statement will throw NPE
     //System.out.println(test.toString());
    }
    
    public static void test4() {
        System.out.println("====Use String.format() to format the the strings===");
       
        int obtainedMarks = 86;
        int maxMarks = 120;
        double percent = obtainedMarks*100.0/ maxMarks;
        
        System.out.println(String.format("I secured [%d] marks out of [%d] which is %.2f%%", obtainedMarks, maxMarks,percent));
        
        System.out.println(String.format("hello by [%s]  from [%s]", "Sophea", "DIM Company"));
        
    }
    
    public static void test5() {
        System.out.println("Call .equals on known string constants rather than unknown variable");
        String string = getMyString();
        // always compare like this, this will never throw NPE
        System.out.println("CONSTANT.equals(string):"+ CONSTANT.equals(string));
        System.out.println("Comparision like string.equals(CONSTANT) may throw NullPointerException");
        // next statement will throw NPE
        System.out.println("string.equals(CONSTANT):" + string.equals(CONSTANT));
    }
    
    public static String getMyString() {
        return null;
    }
}
