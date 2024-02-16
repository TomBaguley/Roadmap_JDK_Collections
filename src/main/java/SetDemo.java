import java.util.Set;
import java.util.TreeSet;

//Contains no duplicate elements
//Used similar class in JS on Museum project to only have single instance of name in autocomplete list, when two works shared a name.
//Interface inherited or extended by SortedSet, HashSet, TreeSet etc.
//HashSet: backed by hash table (HashMap instance), no guarantee over order of iteration, or that order will remain constant. Null not permitted.
//Operation time proportional to sum of instance's size. Important not to set size unnecessarily large.
//
//SortedSet: Provides a total ordering on its elements, using their natural ordering. Therefore, all elements inserted into a SortedSet
//must be Comparable
//Interface, extends Set, implemented by TreeSet.
//
//TreeSet:
public class SetDemo {
    public void execute(){
        System.out.println("Set:");

        TreeSet<Integer> firstSet = new TreeSet<>();
        firstSet.add(3);
        firstSet.add(2);
        firstSet.add(4);
        firstSet.add(1);

        System.out.println("elements added in random order but ordered in natural ascending order" + firstSet);

        System.out.println("firstSet.higher(2); returns the first element higher than the specified val: " + firstSet.higher(2));

        System.out.println("firstSet.tailSet(2); returns a subSet of all values larger than the specified val (inclusive by default, can be toggled): " + firstSet.tailSet(2, false));
        System.out.println("");
    }
}
