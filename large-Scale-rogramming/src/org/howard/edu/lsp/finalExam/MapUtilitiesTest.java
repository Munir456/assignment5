package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.Map.Entry;



class MapUtilitiesTest {

	@Test 
	public void testCommonKeyValuePairs() throws NullMapException {
		
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map3= new HashMap<String, String>();
		HashMap<String, String> map4 = new HashMap<String, String>();
		HashMap<String, String> map5 = new HashMap<String, String>();



		
		
		map1.put("Jake", "Nice");
		map1.put("Keem", "Sad");
		map1.put("Daisy", "Broke");
		
		map2.put("Keem", "Sad");
		map2.put("Daisy", "Broke");
		map2.put("Karina", "Funny");
		map2.put("Mom", "Driving");
		map2.put("Owall", "Happy");
		
		
		map5.put("Jake", "Nice");
		map5.put("Keem", "Sad");
		map5.put("Daisy", "Broke");

		map3.put("Jake", "Nice"); 
		map4.put(null, null);
		


		
		assertEquals(2, MapUtilities.commonKeyValuePairs(map1, map2));
		assertEquals(3, MapUtilities.commonKeyValuePairs(map1, map5));
		
		assertEquals(1,MapUtilities.commonKeyValuePairs(map3, map5));
		
		
		
	

		
	}


}