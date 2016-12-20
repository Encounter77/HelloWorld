package filetostring;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		FileOutputStream os = new FileOutputStream("text2.txt");
		StringBuilder sb = new StringBuilder();
		String contant;
//		System.out.println(br.readLine());
		while((contant = br.readLine())!=null){
			sb.append(contant);
		}
		String s = new String(sb);
		byte [] buffer = s.getBytes();
		os.write(buffer);
		br.close();
		os.close();
	}
}
