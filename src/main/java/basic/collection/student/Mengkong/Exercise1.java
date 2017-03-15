package basic.collection.student.Mengkong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basic.collection.CountriesList;

public class Exercise1 {
    public static void main(String[] args){
        CountriesList objCount  =   new CountriesList();
        List<String> objCounts  =   (List<String>) objCount.getAllCountries();
        
        Collections.sort(objCounts);
            
        String first_letter =   "";
        List<String> objTemp    =   new ArrayList<String>();
        Map<String, List<String>> objMap    =   new HashMap<>();
        for(int i=0;i<objCounts.size();i++){
            if(String.valueOf(objCounts.get(i).charAt(0)).equals(first_letter)){
                objTemp.add(objCounts.get(i).toString());
                if(i==objCounts.size()-1){
                    objMap.put(first_letter, objTemp);
                }
            }else{
                if(!first_letter.isEmpty()){
                    objMap.put(first_letter, objTemp);
                    //objTemp.clear();
                    objTemp =   new ArrayList<String>();
                }
                objTemp.add(objCounts.get(i).toString());
                first_letter    =   String.valueOf(objCounts.get(i).charAt(0));
                
            }
            //System.out.println(objCounts.get(i)+ " " + String.valueOf(objCounts.get(i).charAt(0)));
            
        }
        //System.out.println(objCounts);
        //System.out.println(objCounts.size());
        
        //System.out.println(objMap);
        System.out.println("Size of Map:" + objMap.size() +"\n");
        System.out.println("Countries with A letter have "+objMap.get("A").size()+" countries:\n"+ objMap.get("A")+"\n");
        System.out.println("Countries with B letter have "+objMap.get("B").size()+" countries:\n"+ objMap.get("B")+"\n");
        System.out.println("Countries with C letter have "+objMap.get("C").size()+" countries:\n"+ objMap.get("C")+"\n");
        System.out.println("Countries with D letter have "+objMap.get("D").size()+" countries:\n"+ objMap.get("D")+"\n");
        System.out.println("Countries with E letter have "+objMap.get("E").size()+" countries:\n"+ objMap.get("E")+"\n");
        System.out.println("Countries with F letter have "+objMap.get("F").size()+" countries:\n"+ objMap.get("F")+"\n");
    }
    //amended
//    public static void main(String[] args) {
//        List<String> objCounts  =   (List<String>)CountriesList.getAllCountries();
//        
//        //Collections.sort(objCounts);
//            
//        String first_letter =   "";
//        List<String> objTemp    =   new ArrayList<String>();
//        Map<String, List<String>> objMap    =   new HashMap<>();
//        for (int i = 0; i < objCounts.size(); i++) {
//            //find the first Letter
//            first_letter = String.valueOf(objCounts.get(i).charAt(0));
//            //get Obj Map with firstLetter
//            objTemp = objMap.get(first_letter);
//            //check if obj is not found, add new object
//            if (objTemp == null) {
//                objTemp = new ArrayList<String>();
//                objMap.put(first_letter, objTemp);
//            }
//            //add country to object
//            objTemp.add(objCounts.get(i));
//           
//        }
//        //System.out.println(objCounts);
//        //System.out.println(objCounts.size());
//        
//        //System.out.println(objMap);
//        System.out.println("Size of Map:" + objMap.size() +"\n");
//        System.out.println("Countries with A letter have "+objMap.get("A").size()+" countries:\n"+ objMap.get("A")+"\n");
//        System.out.println("Countries with B letter have "+objMap.get("B").size()+" countries:\n"+ objMap.get("B")+"\n");
//        System.out.println("Countries with C letter have "+objMap.get("C").size()+" countries:\n"+ objMap.get("C")+"\n");
//        System.out.println("Countries with D letter have "+objMap.get("D").size()+" countries:\n"+ objMap.get("D")+"\n");
//        System.out.println("Countries with E letter have "+objMap.get("E").size()+" countries:\n"+ objMap.get("E")+"\n");
//        System.out.println("Countries with F letter have "+objMap.get("F").size()+" countries:\n"+ objMap.get("F")+"\n");
//    }
}
