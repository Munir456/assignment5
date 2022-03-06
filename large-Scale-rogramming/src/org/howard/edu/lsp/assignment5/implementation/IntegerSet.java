package org.howard.edu.lsp.assignment5.implementation;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set; 

public class IntegerSet {
	
	private ArrayList<Integer> list = new ArrayList<>();
	
	public IntegerSet(ArrayList list) {
		this.list=list; 

	}
	
	// clears all reps of class
	
	public void clear() {
		list.clear();
	}
	
	// length of set
	public int length() {
		return list.size();	
	}
	
	// returns true only if two sets are equal, order doesnt matter
	
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> list2=b.list; 
		
		if (list.size() != list2.size()) {
			return false;
		}
		
		ArrayList<Integer> temp1=list; 
		ArrayList<Integer> temp2=list2; 
		
		Collections.sort(temp1);
		Collections.sort(temp2);
		
		for(int i=0; i<temp1.size(); i++) {
			if(temp1.get(i) != temp2.get(i)) {
				return false;
			}
		}
		return true; 
	}
	// returns true if the set contains the value 
	public boolean contains (int item) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i) == item){
				return true; 
			}
		}
	}
	
	// returns largest item
	public int largest() {
		int max=0; 
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)>max) { 
				max=list.get(i);
			}
		
		}
		return max;
	}
	
	
	//returns smallest item
	public int smallest() {
		int min = Integer.MAX_VALUE; 
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i)<min) {
				min = list.get(i);
			}
		}
		return min;
	}
	
	//adds item to list if its already not in there 
	
	public void addItem(int item) {
		boolean exist = false; 
		
		for(int i=0; i< list.size();i++) {
			if(list.get(i) == item) {
				exist = true;
			}

		// come back to this 
		}
		if(exist == false) { 
			list.add(item);
		}
	}
	
	//removes an item from the set 
	public void remove(int item) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)==item){ 
				list.remove(i); 
			}
		}
	}
	
	//creates a union
	
	public IntegerSet union(IntegerSet list2) {
		ArrayList<Integer> temp=list2.getlist(); 
		
		Set<Integer> set = new HashSet<>(); 
		set.addAll(list); 
		set.addAll(temp); 
		
		ArrayList<Integer> list3 = new ArrayList<>(set); 
		
		IntegerSet list4= new IntegerSet(list3); 
		return list4; 
	}
	
	//creates an intersection
	public IntegerSet intersection (IntegerSet list2) { 
		ArrayList<Integer> temp=list2.getlist(); 
		
		list.retainAll(temp); 

IntegerSet list4 = new IntegerSet(list); 
		return list4; 
	}
	
	//sets the difference between the two sets
	public IntegerSet diff (IntegerSet list2) { 
		ArrayList<Integer> temp=list2.getlist(); 
		
		list.removeAll(temp);
		
IntegerSet list4 = new IntegerSet(list); 
		return list4; 
	
	}
//getting list here
	public ArrayList<Integer> getlist(){ 
		return list; 
	}
	
}

// exception class


		
