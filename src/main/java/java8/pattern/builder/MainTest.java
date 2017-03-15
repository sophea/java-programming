package java8.pattern.builder;

import java8.pattern.builder.Person.PersonBuilder;

public class MainTest {

    public static void main(String[] args) {
        PersonBuilder builder = new Person.PersonBuilder();
        builder.firstName("Sophea");
        builder.lastName("MAK");
        System.out.println(builder.build());
    }

}
