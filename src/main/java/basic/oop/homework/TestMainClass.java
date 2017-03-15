/***/
package basic.oop.homework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
class TestMainClass {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // Employee1
        final Employee emp1 = new Employee(1L, "SAM", "Sokheng", 500d);
        emp1.setBirthDate(convertStringToDate("1983-10-22"));

        final Employee emp2 = new Employee(2L, "Eng", "Sanya", 300d);
        emp2.setBirthDate(convertStringToDate("1988-07-12"));

        // Developer
        final Employee dev1 = new Developer("You", "Ishin", "Assoicate Software Engineer");
        dev1.setBirthDate(convertStringToDate("1990-01-01"));
        dev1.setSalary(250d);

        // Team leader
        final TeamLeader leader = new TeamLeader("Mak", "Sophea", 30);
        leader.setBirthDate(convertStringToDate("1983-01-25"));
        leader.setSalary(1000d);
        leader.setYears(10);
        leader.setComment("working almost 10years");
        
        // add all objects into ArrayList
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(dev1);
        list.add(leader);
        for (Employee employee : list) {
            System.out.println("className :" + employee.getClass().getName());
            System.out.println(employee.getDataView());
            System.out.println("=============");
        }
    }

    public static Date convertStringToDate(String yyyyMMdd) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(yyyyMMdd);
        return date;
    }
}
