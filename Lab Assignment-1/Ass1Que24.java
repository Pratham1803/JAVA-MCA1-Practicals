// 24. Demonstrate the working of MAP in collection Framework:  HashMap, LinkedHashMap, TreeMap, and HashTable. 

import java.util.HashMap; // Importing HashMap class from java.util package
import java.util.LinkedHashMap; // Importing LinkedHashMap class from java.util package
import java.util.TreeMap; // Importing TreeMap class from java.util package
import java.util.Hashtable; // Importing Hashtable class from java.util package

public class Ass1Que24 {
    public static void main(String[] args) {
        // HashMap
        System.out.println("\n!------------- HashMap ----------------!\n");
        HashMap<Integer, String> hm = new HashMap<Integer, String>(); // Creating HashMap object
        hm.put(1, "One"); // Adding element to HashMap
        hm.put(2, "Two"); // Adding element to HashMap
        hm.put(3, "Three"); // Adding element to HashMap
        hm.put(4, "Four"); // Adding element to HashMap
        hm.put(5, "Five"); // Adding element to HashMap
        System.out.println("HashMap: " + hm); // Printing HashMap
        System.out.println("Size: " + hm.size()); // Printing size of HashMap
        System.out.println("\n!---------------------------------------------!\n");

        // LinkedHashMap
        System.out.println("\n!------------- LinkedHashMap ----------------!\n");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(); // Creating LinkedHashMap object
        lhm.put(1, "One"); // Adding element to LinkedHashMap
        lhm.put(2, "Two"); // Adding element to LinkedHashMap
        lhm.put(3, "Three"); // Adding element to LinkedHashMap
        lhm.put(4, "Four"); // Adding element to LinkedHashMap
        lhm.put(5, "Five"); // Adding element to LinkedHashMap
        System.out.println("LinkedHashMap: " + lhm); // Printing LinkedHashMap
        System.out.println("Size: " + lhm.size()); // Printing size of LinkedHashMap
        System.out.println("\n!---------------------------------------------!\n");

        // TreeMap
        System.out.println("\n!------------- TreeMap ----------------!\n");
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(); // Creating TreeMap object
        tm.put(1, "One"); // Adding element to TreeMap
        tm.put(2, "Two"); // Adding element to TreeMap
        tm.put(3, "Three"); // Adding element to TreeMap
        tm.put(4, "Four"); // Adding element to TreeMap
        tm.put(5, "Five"); // Adding element to TreeMap
        System.out.println("TreeMap: " + tm); // Printing TreeMap
        System.out.println("Size: " + tm.size()); // Printing size of TreeMap
        System.out.println("\n!---------------------------------------------!\n");

        // Hashtable
        System.out.println("\n!------------- Hashtable ----------------!\n");
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); // Creating Hashtable object
        ht.put(1, "One"); // Adding element to Hashtable
        ht.put(2, "Two"); // Adding element to Hashtable
        ht.put(3, "Three"); // Adding element to Hashtable
        ht.put(4, "Four"); // Adding element to Hashtable
        ht.put(5, "Five"); // Adding element to Hashtable
        System.out.println("Hashtable: " + ht); // Printing Hashtable
        System.out.println("Size: " + ht.size()); // Printing size of Hashtable
        System.out.println("\n!---------------------------------------------!\n");
    }
}