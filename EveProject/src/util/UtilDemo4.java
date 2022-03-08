package util;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


/*
 * Set Collection - has a table like structure (key value pair)
 * doesnt allow duplicates
 * HashSet & TreeSet
 * HashSet is for smaller collection of data
 * TreeSet is for larger collection of data
 * Treeset maintains an order (by default in ascending) unlike HashSet
 * Comparator is an interface which has methods
 * compareTo

 * */
public class UtilDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		
		set=new TreeSet<String>(new MyComparator());
		
		set.add("aaaa");
		set.add("zzzz");
		set.add("cccc");
		set.add("bbbb");
		set.add("aaaa");
		
		System.out.println(set);
		
		Iterator<String> iter= set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}
