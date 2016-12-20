package collection.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test8 {
	public static void main(String[] args) throws IOException {
		Map<String,Integer> map = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
		String [] str = {"public","void","main","static","class","System"};
		String s = null;
		String [] strs = null;
		for(int i=0;i<str.length;i++){
			map.put(str[i],new Integer(0));
		}	
		while((s = br.readLine()) != null){
			strs = s.trim().split(" +|\\.|\\{|\\}|;|\\(|\\)");
			for(int j=0;j<strs.length;j++){
				if(map.containsKey(strs[j])){
					int sum = 0 ;
					sum++;
					int num = map.get(strs[j]);
					map.put(strs[j],num+sum);
				}
			}
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			int value = map.get(key);
			System.out.println(key+":"+value);
		}
		br.close();
	}
}