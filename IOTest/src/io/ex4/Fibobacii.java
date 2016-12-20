package io.ex4;

import java.io.FileWriter;
import java.io.IOException;

public class Fibobacii {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("1.txt");
		int [] arr = new int [20];
		String s = null;
		arr[0] = arr[1] = 1;
		for(int i=2;i<arr.length;i++){
			arr[i] = arr[i-1] + arr[i-2];
			s = String.valueOf(arr[i]);
		}
		for(int j=0;j<arr.length;j++){
			if(j!=0&&j%5==0){
				fw.write('\n');
//				System.out.println();
			}
			fw.write(arr[j]+" "); 
//			System.out.print(arr[j]+" ");
		}
		fw.close();
	}
}
