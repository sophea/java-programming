package basic.oop.homework;

import java.util.Date;

/*
 Create a Class “Person” extending class "Dcommon" with the following properties: 
 birthDate (Date), lastName (String), firstName (String)
 * 
 */
public class Person extends DCommon {
    private Date birthDate;
    private String lastName;
    private String firstName;
    public Person() {
        
    }
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public Person(Long id, String lastName, String firstName) {
        super(id);
        this.lastName = lastName;
        this.firstName = firstName;
    }
    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }
    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
