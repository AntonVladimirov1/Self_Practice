package day41_Map;

import java.util.HashMap;
import java.util.Map;

public class AandB {
    /*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put("a","aaa");
        map.put("b","aab");
        map.put("c","cake");
        System.out.println(mapAB2(map));
    }

    //* if we are using single & we are looking for every condition in the chain
    //* if we are using double && then if compiler find one false from left to right - compiler won't check the others

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") & map.containsKey("b") && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

}
