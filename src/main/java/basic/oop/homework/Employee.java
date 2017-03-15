/***/
package basic.oop.homework;

import java.text.SimpleDateFormat;

/**
 * Create a Class “Employee” with the following properties: 
 * salary (Double), years (years spent in the company) and lastName, 
 * birthDate, firstName. 

 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class Employee extends Person implements View {
    /*salary*/
    private Double salary;
    /**years spent in the company*/
    private Integer years;
    
    public Employee() {
    
    }
    public Employee(String lastName, String firstName) {
        super(lastName, firstName);
    }
    public Employee(Long id, String lastName, String firstName) {
        super(id, lastName, firstName);
    }

    public Employee(Long id, String firstName, String lastName, Double salary) {
        
        super(id, lastName, firstName);
        this.salary = salary;
    }
    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    /**
     * @return the years
     */
    public Integer getYears() {
        return years;
    }
    /**
     * @param years the years to set
     */
    public void setYears(Integer years) {
        this.years = years;
    }
    @Override
    public String getDataView() {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        final String line = System.lineSeparator();
        StringBuilder sb = new StringBuilder();
        sb.append("id :").append(getId()).append(line);
        sb.append("FirstName : ").append(getFirstName()).append(line);
        sb.append("LastName : ").append(getLastName()).append(line);
        if (getBirthDate() != null) {
            sb.append("Date Of Birth : " ).append(dateFormat.format(getBirthDate())).append(line);
        }
        sb.append("salary : ").append(getSalary()).append(line);
        sb.append("working in company of years :").append(getYears());
        
        return sb.toString();
    }
}
