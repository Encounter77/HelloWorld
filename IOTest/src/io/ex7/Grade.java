package io.ex7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Grade {
	private static int getSum(int grade,int sum) {
		sum+=grade;
		return sum;
	}
	
	private static int getMinGrade(int grade, int mine) {
		if(grade<mine){
			mine = grade;
		}
		return mine;
	}
	
	private static int getMaxGrade(int grade,int max) {
		if(grade>=max){
			max = grade;
		}
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("grade.txt"));
		String s = null;
		String [] str = null;
		int esum = 0,msum = 0,psum = 0;
		int maxe = 0,mine = 100;
		int maxm = 0,minm = 100;
		int maxp = 0,minp = 100;
		while((s = br.readLine())!=null){
			str = s.split("id# 00000| e#| m#| p#");
				esum = getSum(Integer.parseInt(str[2]),esum);
				maxe = getMaxGrade(Integer.parseInt(str[2]),maxe);
				mine = getMinGrade(Integer.parseInt(str[2]),mine);
				msum = getSum(Integer.parseInt(str[3]),msum);
				maxm = getMaxGrade(Integer.parseInt(str[3]),maxm);
				minm = getMinGrade(Integer.parseInt(str[3]),minm);
				psum = getSum(Integer.parseInt(str[4]),psum);
				maxp = getMaxGrade(Integer.parseInt(str[4]),maxp);
				minp = getMinGrade(Integer.parseInt(str[4]),minp);
		}
		System.out.println("e average:"+esum/(str.length)+" maxgrade:"+maxe+" mingrade:"+mine);
		System.out.println("m average:"+msum/(str.length)+" maxgrade:"+maxm+" mingrade:"+minm);
		System.out.println("p average:"+psum/(str.length)+" maxgrade:"+maxp+" mingrade:"+minp);
		br.close();
	}
}