package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put("BB",new Person("Jerry",14));
		map.put("AA",new Person("Tom",18));
		map.put("CC",new Person("Black",17));
		
		Map map2 = new LinkedHashMap();
		map2.put("DD",new Person("Tom2",18));
		map2.put("EE",new Person("Jerry2",16));
		map2.put("FF",new Person("Black2",21));
//		map.putAll(map2);
//		Object obj = map.get("CC");
//		System.out.println(obj);
//		Object obj2 = map.keySet();
//		System.out.println(obj2);
//		int i = map.hashCode();
//		System.out.println(i);
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key+":"+value);	
		}
	}
}
