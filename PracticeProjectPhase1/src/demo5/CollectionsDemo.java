package demo5;

	import java.util.*;

	public class CollectionsDemo {
	    public static void main(String[] args) {
	        // ArrayList
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        System.out.println("ArrayList: " + arrayList);

	        // LinkedList
	        List<String> linkedList = new LinkedList<>();
	        linkedList.add("Cat");
	        linkedList.add("Dog");
	        linkedList.add("Elephant");
	        System.out.println("LinkedList: " + linkedList);

	        // HashSet
	        Set<String> hashSet = new HashSet<>();
	        hashSet.add("Red");
	        hashSet.add("Green");
	        hashSet.add("Blue");
	        System.out.println("HashSet: " + hashSet);

	        // TreeSet
	        Set<String> treeSet = new TreeSet<>();
	        treeSet.add("January");
	        treeSet.add("February");
	        treeSet.add("March");
	        System.out.println("TreeSet: " + treeSet);

	        // HashMap
	        Map<Integer, String> hashMap = new HashMap<>();
	        hashMap.put(1, "One");
	        hashMap.put(2, "Two");
	        hashMap.put(3, "Three");
	        System.out.println("HashMap: " + hashMap);

	        // TreeMap
	        Map<Integer, String> treeMap = new TreeMap<>();
	        treeMap.put(3, "Three");
	        treeMap.put(1, "One");
	        treeMap.put(2, "Two");
	        System.out.println("TreeMap: " + treeMap);
	    }
	}

