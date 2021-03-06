package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> UK_region = new ArrayList<String>();
        List<String> algeria_region = new ArrayList<String>();
        UK_region.add("london");
        UK_region.add("new castle");
        algeria_region.add("algiers");
        algeria_region.add("tizi-ouzou");
        Map<String, List<String>> list = new HashMap<String, List<String>>();
        list.put("UK",UK_region);
        list.put("Algeria",algeria_region);
        //Using for each
        for(Map.Entry key: list.entrySet()){
            System.out.println(key.getKey()+" "+key.getValue());
        }
        //Using iterator
        Iterator it =list.entrySet().iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(" ");



    }

}
