package collection.ex;

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
		return "Point [x=" + x + ", y=" + y + "]";
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
