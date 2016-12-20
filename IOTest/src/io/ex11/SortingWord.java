package io.ex11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class SortingWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("sortingword.txt"));
		TreeSet set = new TreeSet();
		String [] str = null;
		String s = null;
		s = br.readLine();
		str = s.split(" +");
		for(int i=0;i<str.length;i++){
			set.add(str[i]);
		}
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}