 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOperations {
	Map<String,Integer>  hm = new HashMap<String,Integer>();
	/**
	 * @param input
	 * @return
	 */
	public Map<String, Integer> processString(String input){
		if(input.contains("<xs:element name=")){
			String output=input.split("\"")[1] ;
			//System.out.println(output);
			String hashString = output;
			if(hashString!=null){
				if(hm.containsKey(hashString)){
					hm.put(hashString,hm.get(hashString)+1);					
				}
				else {
					hm.put(hashString, 1);
				}
			}	
		}
		return hm;
	}


	/**
	 * @param resultMap
	 */
	public void findResult(Map<String, Integer> resultMap) {
		List<Integer> values = new ArrayList<Integer>();
		List<String>  names = new ArrayList<String>();
		List<Integer> originalValue = new ArrayList<Integer>();
		for(Map.Entry<String,Integer> strt: hm.entrySet()){
			values.add(strt.getValue());
			names.add(strt.getKey());
			originalValue.add(strt.getValue());
		}
		Collections.sort(values);
		int size = values.get(values.size()-1);
		int index = originalValue.indexOf(size);
		String elementName = names.get(index);
		System.out.println("The most frequently occurring element is " + elementName+ "." + "It appears " + size  + " times");
	}
}



