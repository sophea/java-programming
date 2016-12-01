package java8.pattern.builder;
/**
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */

public class Person {
    private String lastName;
    private String firstName;
    
    private Person(PersonBuilder persionBuilder) {
        this.lastName = persionBuilder.lastName;
        this.firstName = persionBuilder.firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
     
        return String.format(" firstName :%s, lastName %s", firstName, lastName);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }


    public static class PersonBuilder {
        private String lastName;
        private String firstName;
        
        public PersonBuilder() {
        }
        
        public PersonBuilder lastName(String  lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public Person build() {
            return new Person (this);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Person.PersonBuilder().lastName("Sophea").firstName("MAK").build());
    }
}


