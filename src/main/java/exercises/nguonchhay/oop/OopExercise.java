package exercises.nguonchhay.oop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OopExercise {

	public static void displayAll(List<View> staffs) {
		for (View staff : staffs) {
			System.out.println("=> " + staff.getDataView());
		}
	}
	
	public static void main(String[] args) {
		List<View> staffs = new ArrayList<View>();
		staffs.add(new Employee("Sok", "San", new Date(), 500, 2));
		staffs.add(new Developer("Mey", "Long", new Date(), 800, 5, "Fast learning staff"));
		staffs.add(new TeamLeader("Hong", "Heng", new Date(), 1000, 5, "Good staff", 5));
		
		System.out.println("--- All Staff Information ---");
		displayAll(staffs);
	}

}
