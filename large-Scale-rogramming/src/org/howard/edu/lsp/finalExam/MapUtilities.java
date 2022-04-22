package org.howard.edu.lsp.finalExam;
import java.util.Map.Entry;
import java.util.*;

public class MapUtilities {
    public static int commonKeyValuePairs(
    	HashMap<String, String> map1,
        HashMap<String, String> map2)throws NullMapException {
    	if(map1 == null || map2 == null) {
    		throw new NullMapException("Something is null"); 
    	}
    	
    	if(map1.isEmpty()|| map2.isEmpty()){
    		return 0;
    	}
// implementation
 
//		System.out.println("Map 1: "+ map1);
//		

    	//map1.entrySet();
//		System.out.println("Map 2: "+ map2);
    	//((Set<Entry<String, String>>) map1).retainAll(map2.entrySet());
    	
		//System.out.println("Entries: "+ entries);
    	int ans = 0;
    	
    	for(Map.Entry<String, String> entry: map1.entrySet()) {
    		String key = entry.getKey();
    		String val = entry.getValue();
    		System.out.println(map1);
    		if(map2.containsKey(key)) {
    			if(map2.get(key).equals(val)) { 
    				ans ++;
    			}
    		}
    	}

    	return ans;
    }
}




