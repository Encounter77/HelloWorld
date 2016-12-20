package io.ex5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Letter {
	public static void main(String[] args) throws IOException {
		FileInputStream is = new FileInputStream("letter.txt");
		FileOutputStream os = new FileOutputStream("letter2.txt");
		int len = 0;
		byte [] buffer = new byte[1024];
		while((len = is.read(buffer)) != -1){
//			System.out.println(len);
			os.write(buffer,0,len);
		}
		is.close();
		os.close();
	}
}
