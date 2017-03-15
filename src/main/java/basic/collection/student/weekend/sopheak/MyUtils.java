package basic.collection.student.weekend.sopheak;
import java.util.Arrays;
import java.util.Set;

public class MyUtils{
	
	public static void checkDuplicate(Set<String> s, String[] countries) {
	   s.addAll(Arrays.asList(countries));
	   System.out.printf("Set type = %s ", s.getClass().getName());
	   System.out.println(s);
	}
}
