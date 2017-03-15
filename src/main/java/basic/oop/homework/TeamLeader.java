/***/
package basic.oop.homework;

/**
 * 
 * Create a class “TeamLeader” with properties : projectNum.
   Implements the interface View to display:  fullName: UPPERCASE_NAME + number of projects
   (use StringBuffer to manipulate string, the fullName should be in UPPERCASE)

 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class TeamLeader extends Developer {
    private Integer projectNum;

    public TeamLeader() {
    }
    public TeamLeader(String lastName, String firstName, Integer projectNum) {
        super(lastName, firstName,"");
        this.projectNum = projectNum;
    }
    @Override
    public String getDataView() {
        final StringBuffer sb = new StringBuffer();
        
        sb.append("fullName : ").append(getFullName().toUpperCase());
        sb.append(" number of projects :").append(getProjectNum());
        return sb.toString();
    }
    /**
     * @return the projectNum
     */
    public Integer getProjectNum() {
        return projectNum;
    }

    /**
     * @param projectNum the projectNum to set
     */
    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
    }
}
