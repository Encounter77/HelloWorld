package collection.ex;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		int num = scanner.nextInt();
		int max = 0;
		while(num!=0){
			if(map.containsKey(num)){
				int count = map.get(num);
				count++;
				map.put(num,count);
			}else{
				map.put(num,1);
			}
			num = scanner.nextInt();
		}
		Collection<Integer> coll = map.values();
		for(Integer in:coll){
			max = Collections.max(coll);
			if(in > max){
				max = in;
			}	
		}
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
			int key = it.next();
			int value = map.get(key);
			if(value == max)
			System.out.println(key+":"+value);
		}
		scanner.close();
	}
}
