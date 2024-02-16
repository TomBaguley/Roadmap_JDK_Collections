import java.util.TreeMap;

public class MapDemo {


//Contains key-value pairs. Keys must be unique and only reference a single value.
//Interface implemented by HashMap, TreeMap etc. and extended by SortedMap, NavigableMap etc.
//various methods for putting, getting, retrieving a set of keys/values etc.

//SortedMap provides ordering on its keys, similar to that of a SortedSet.
//An Interface implemented by TreeMap
    public void execute(){
        System.out.println("Map:");

        TreeMap<Integer, String> firstMap = new TreeMap<>();

        firstMap.put(2,"second");
        firstMap.put(1,"first");
        firstMap.put(4,"fourth");
        firstMap.put(3,"third");

        System.out.println(firstMap.values());

    }

}
