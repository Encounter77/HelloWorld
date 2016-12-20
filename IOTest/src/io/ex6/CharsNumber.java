package io.ex6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharsNumber {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("char.txt");
		FileWriter fw = new FileWriter("char2.txt");
		int len = 0;
		int result = 0;
		String s = null;
		char [] ch = new char[20];
		while((len = fr.read(ch))!=-1){
//			System.out.println(len);
			result+=len;
		}
		s = String.valueOf(result);
		fw.write(s);
//		System.out.println(result);
		fr.close();
		fw.close();
	}
}
