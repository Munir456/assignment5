package org.howard.edu.lsp.assignment5.implementation;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;  
import static org.junit.Assert.assertFalse; 
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue; 
import static org.junit.Assert.assertThrows; 
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

public class IntegerSetTest  {

	
	@Test 
	@DisplayName("Test cases for Add")
	
	public void testaddItem() {
		ArrayList<Integer> list8 = new ArrayList<>();
		IntegerSet set8 = new IntegerSet(list8);
		
		set8.addItem(5);
		set8.addItem(4);
		set8.addItem(3);
		
		assertFalse(set8.toString().equals("[5,4,3]"));
	}
	
	
	
	@Test
	@DisplayName("Test cases for contains")
	public void testcontains() {
		ArrayList<Integer> ListA = new ArrayList<>();
		IntegerSet set1 = new IntegerSet(ListA);
		
		set1.addItem(11);
		set1.addItem(20);
		set1.addItem(200493);
		
		assertTrue(set1.contains(20)); 
		assertFalse(set1.contains(4)); 
		assertTrue(set1.contains(200493));
		
		set1.clear();
		
	}
	
	@Test 
	@DisplayName("Test cases for Union")
	
	public void testunion() {
		ArrayList<Integer> list2 = new ArrayList<>();
		IntegerSet setA = new IntegerSet(list2);
		
		ArrayList<Integer> list3 = new ArrayList<>();
		IntegerSet setB = new IntegerSet(list3);
		
		ArrayList<Integer> list4 = new ArrayList<>();
		IntegerSet setC = new IntegerSet(list4);
		
		setA.addItem(1);
		setA.addItem(2);
		setA.addItem(3);
		
		setB.addItem(4);
		setB.addItem(5);
		setB.addItem(6);

		setC.addItem(1);
		setC.addItem(2);
		setC.addItem(3);
		setC.addItem(4);
		setC.addItem(5);
		setC.addItem(6);
		
		assertFalse(setA.union(setB) == setC); 
		
		setA.clear();
		setB.clear();
		setC.clear();

	}
	
	@Test 
	@DisplayName("Test cases for remove")
	public void testremove() {
		ArrayList<Integer> listR = new ArrayList<>(); 
		IntegerSet setR = new IntegerSet(listR); 
		
		ArrayList<Integer> listt = new ArrayList<>(); 
		IntegerSet setS = new IntegerSet(listR); 
		
		setR.addItem(3);
		setR.addItem(5); 
		
		setS.addItem(3);
		setS.addItem(4);
		setS.addItem(5); 
		setS.remove(4);
		assertFalse(setS == setR);
		
	} 
	
	@Test 
	@DisplayName("Test cases for small")
	
	public void testsmallest() {
		ArrayList<Integer> listS = new ArrayList<>(); 
		IntegerSet setS = new IntegerSet(listS); 
		
		setS.addItem(5);
		setS.addItem(10);
		setS.addItem(15);
		
		int min = 5;
		assertTrue(min == setS.smallest());
		
		
	}
	
	@Test 
	@DisplayName("Test cases for largest")
	public void testlargest() {
		ArrayList<Integer> listL = new ArrayList<>(); 
		IntegerSet setL = new IntegerSet(listL); 
		
		setL.addItem(10);
		setL.addItem(17);
		setL.addItem(20);
		
		int max = 20; 
		assertTrue(max == setL.largest());


	}
	
	@Test 
	@DisplayName("Test cases for intersection")
	public void testintersection() {
		ArrayList<Integer> ListI = new ArrayList<>();
		IntegerSet setI = new IntegerSet(ListI);
		
		ArrayList<Integer> ListJ = new ArrayList<>();
		IntegerSet setJ = new IntegerSet(ListJ);
		
		ArrayList<Integer> ListK = new ArrayList<>();
		IntegerSet setK = new IntegerSet(ListK);
		
		setI.addItem(1);
		setI.addItem(2);
		setI.addItem(3);
		
		setJ.addItem(1);
		setJ.addItem(6);
		setJ.addItem(4);
		
		setK.addItem(1);
		
		assertFalse(setK == setJ.intersection(setK));
		
		
	}
	
	@Test 
	@DisplayName("Test cases for diff")
	public void diff() {
		ArrayList<Integer> listD = new ArrayList<>(); 
		IntegerSet setD = new IntegerSet(listD);
		
		ArrayList<Integer> listE = new ArrayList<>(); 
		IntegerSet setE = new IntegerSet(listE);
		
		ArrayList<Integer> listF = new ArrayList<>(); 
		IntegerSet setF = new IntegerSet(listF);
		
		setD.addItem(5);
		setE.addItem(10);
		setF.addItem(15);

		assertFalse(setD == setF.diff(setE));
			
	}
	
	@Test 
	@DisplayName("Test cases for equals")
	
	public void equals() {
		ArrayList<Integer> listZ = new ArrayList<>(); 
		IntegerSet setZ = new IntegerSet(listZ);
		
		ArrayList<Integer> listX = new ArrayList<>();
		IntegerSet setX = new IntegerSet(listX); 
		
		setZ.addItem(1);
		setZ.addItem(2);
		setZ.addItem(3);
		
		setX.addItem(1);
		setX.addItem(2);
		setX.addItem(3);
		
		assertTrue(setX.equals(setZ));

	}
	
	@Test
	@DisplayName("Test case for clear")
	public void clear() {
		ArrayList<Integer> listC = new ArrayList<>(); 
		IntegerSet setC = new IntegerSet(listC);
		
		ArrayList<Integer> listH = new ArrayList<>(); 
		IntegerSet setH = new IntegerSet(listH);
		
		setC.addItem(4);
		setC.addItem(5);
		setC.addItem(7);
		
		setH.addItem(0);
		setH.remove(0);
		
		assertFalse(setH == setC);
	}
	
	@Test
	@DisplayName("Test case length")
	public void length() {
		ArrayList<Integer> listL = new ArrayList<>(); 
		IntegerSet setL = new IntegerSet(listL);
		
		ArrayList<Integer> listLen = new ArrayList<>(); 
		IntegerSet setLen = new IntegerSet(listLen);
		
		setL.addItem(8);
		setL.addItem(3);
		setL.addItem(9);
		
		assertTrue(setL.length()== 3);
				
	
		


	}
}
