package collection.ex;

import java.util.Arrays;



public class Test9 {
	public static void main(String[] args) {
		Point p1 = new CompareY(5,2);
		Point p2 = new CompareY(4,2);
		System.out.println(p1.compareTo(p2));//(1)(2)
		
		Point [] points = new Point[100];
		for(int i=0;i<points.length;i++){
			points[i] = new Point();
			double x = Math.random()*100;
			points[i].setX(x);
			double y = Math.random()*100;
			points[i].setY(y);
		}
		Arrays.sort(points,new Mycomparator());
		for(int j=0;j<points.length;j++){
			System.out.println(points[j]);
		}
	}
}