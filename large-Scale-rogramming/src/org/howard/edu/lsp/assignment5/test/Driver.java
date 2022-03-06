package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import java.util.*; 

public class Driver { 
	public static void main(String[] args) {
ArrayList<Integer> list1 = new ArrayList<>(); 
ArrayList<Integer> list2 = new ArrayList<>(); 

IntegerSet set1 = new IntegerSet(list1);
IntegerSet set2 = new IntegerSet(list2);

set1.addItem(1);
set1.addItem(3);
set1.addItem(4);
set1.addItem(6);
set1.addItem(3);
set1.addItem(8);
set1.addItem(7);

set2.addItem(1);
set2.addItem(2);
set2.addItem(3);
set2.addItem(4);
set2.addItem(5);
set2.addItem(6);
set2.addItem(7);

System.out.println("Set 1 is:" +set1.getlist()); 
System.out.println("Set 2 is:" +set2.getlist()); 

System.out.println("Equal:" +set1.equals(set2)); 
System.out.println("Largest element in set1 is: "+set1.largest());
System.out.println("Smallest element in set2 is:"+set2.smallest());

IntegerSet setup = set1.union(set2); 

System.out.println("Union:" +setup.getlist());

IntegerSet setinter = set1.intersection(set2); 

System.out.println("intersection is:"+ setinter.getlist());







	}
}
