/***/
package basic.collection.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap
    Sorted
    Slow performance
    Not synchronized
    Use key to access
    Support null key & null value

 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class BasicTreeMap {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> mapLang = new TreeMap<>();
        
        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");
         
        System.out.println(mapLang);

    }

}
