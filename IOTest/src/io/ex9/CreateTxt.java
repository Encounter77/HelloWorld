package io.ex9;

import java.io.FileWriter;
import java.io.IOException;

public class CreateTxt {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Exercise11_1.txt",true);
		String s = null;
		int [] ch = new int[100];
		fw.write('\n');
		for(int i=1;i<ch.length;i++){
			ch[i] = (int)(Math.random()*10);
			s = String.valueOf(ch[i]);
			fw.write(s+" ");
		}
		fw.close();
	}
}
