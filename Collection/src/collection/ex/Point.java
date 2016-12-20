package collection.ex;

import java.text.DecimalFormat;

public class Point implements Comparable<Object>{
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "Point [x=" + df.format(x) + ", y=" + df.format(y) + "]";
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Point){
			Point p = (Point) o;
			return (int) (this.getX() - p.getX());
		}
		throw new ClassCastException();
	}
}