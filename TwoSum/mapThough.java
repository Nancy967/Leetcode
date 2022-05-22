package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class mapThough{
    public static void main(String[] args){
        /*    KEY    :    VALUE
         *   "red"   :   "apple"
         *  "yellow" :   "banana"
         *   "white" :   "radish"
         *   "green" :    "apple"
         *  */
         
        Map<String, String> fruits = new HashMap<>();
        fruits.put("red", "apple");
        fruits.put("yellow", "banana");
        fruits.put("white", "radish");
        fruits.put("green", "apple");
        
//      fruits.containsKey("red");      //returns true, if key is found
//      fruits.containsValue("apple");  //returns true, if key is found
//      fruits.size();                  //returns the size of the Map
//      fruits.remove("red");           //Delets the Entry whose key is "red"
//      fruits.clear();

        System.out.println(fruits.get("red"));

        for (Map.Entry pairEntry: fruits.entrySet()){
            System.out.println(pairEntry.getKey() + ":" +pairEntry.getValue());
        }
    }
}