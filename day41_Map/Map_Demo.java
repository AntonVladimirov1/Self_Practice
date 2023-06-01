package day41_Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Demo {
    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<>();
        map.put("name","James");
        map.put("age",28);
        map.put("gender","male");
        map.put("salary",150_000);

        System.out.println(map);
        System.out.println("====================================");
        System.out.println(map.size());
        System.out.println("====================================");
        System.out.println(map.get("salary")+" - "+ map.get("name"));
        System.out.println("====================================");
        map.replace("age", 28, 30);
        System.out.println(map);
        System.out.println("====================================");
        map.remove("gender","male");
        System.out.println(map);
        System.out.println("====================================");
        map.put("gender","male");
        System.out.println(map);
        System.out.println("====================================");
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
        }
        System.out.println("=========================");
        for (Object value : map.values()) {
            System.out.println("value = " + value);
        }

    }
}
