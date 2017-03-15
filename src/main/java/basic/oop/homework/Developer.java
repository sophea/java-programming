/***/
package basic.oop.homework;


/**
 * Create a class “Developer” extends employee with properties: comment.
 Add a constructor so we can create a Developer from an Employee Object.
Implement the Interface View to display:  fullName + comment  + salary

 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class Developer extends Employee {
    private String comment;
    public Developer() {
    
    }
    
    public Developer(String lastName, String firstName, String comment) {
        super(lastName, firstName);
        this.comment = comment;
    }
    
    public Developer(Long id, String lastName, String firstName, String comment) {
        super(id, lastName, firstName);
        this.comment = comment;
    }
    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }
    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    @Override
    public String getDataView() {
        final String line = System.lineSeparator();
        StringBuilder sb = new StringBuilder();
        sb.append("FullName : ").append(getFullName()).append(line);
        sb.append("salary : ").append(getSalary()).append(line);
        sb.append("comments :").append(getComment());
        
        return sb.toString();
    }
}
