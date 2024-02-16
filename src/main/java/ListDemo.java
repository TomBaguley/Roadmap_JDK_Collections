
//An ordered collection. Can insert and reference by index. Allows duplicate elements, unlike Sets
//Zero based
//2 Methods to search for specified object but should be used with caution as these are performance intensive. Linear searches.
//List is an interface implemented by many classes, e.g. ArrayList.

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public void execute() {
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);

        System.out.println("firstList: " + firstList);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(5);
        secondList.add(6);

        System.out.println("secondList: " + secondList);
        System.out.println("secondList.addAll(firstList);");

        secondList.addAll(firstList);

        System.out.println("secondList: " + secondList);


        System.out.println("secondList.containsAll(firstList); : " + secondList.containsAll(firstList));
        System.out.println("firstList.containsAll(secondList); : " + firstList.containsAll(secondList));


        List<Integer> thirdList = new ArrayList<>();
        thirdList.addAll(firstList);
        System.out.println("hashCode is a number defined by the contents of a list, not object address");
        System.out.println(thirdList.hashCode() + "+" + firstList.hashCode());
    }
}
