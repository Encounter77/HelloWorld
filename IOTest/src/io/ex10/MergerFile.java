package io.ex10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergerFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("marger1.txt");
		FileWriter fw = new FileWriter("marger2.txt",true);
		int len = 0;
		char [] buffer = new char [4];
//		buffer.length;
		while((len = fr.read(buffer))!=-1){
			fw.write('\n');
			fw.write(buffer,0,len);
		}
//		System.out.println(len);
		fr.close();
		fw.close();
	}
}
