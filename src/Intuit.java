//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Intuit {
    public Intuit() {
    }

    public static List<String> nonCommonNames(List<String> names1, List<String> names2) {
        List<String> result = new ArrayList();
        Set<String> names1Set = new HashSet(names1);
        Set<String> names2Set = new HashSet(names2);
        Iterator var5 = names1.iterator();

        String name;
        while(var5.hasNext()) {
            name = (String)var5.next();
            if (!names2Set.contains(name)) {
                result.add(name);
            }
        }

        var5 = names2.iterator();

        while(var5.hasNext()) {
            name = (String)var5.next();
            if (!names1Set.contains(name)) {
                result.add(name);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> names1 = List.of("John", "Shaishav", "Karthik");
        List<String> names2 = List.of("Karthik", "Doe", "Shaishav", "Jahnavi");
        List<String> result = nonCommonNames(names1, names2);
        System.out.println(result);
    }
}
