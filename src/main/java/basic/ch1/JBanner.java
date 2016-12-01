package basic.ch1;

public class JBanner extends JBaseObject {
    private String label;
    private String imageUrl;
    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }
    /**
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
