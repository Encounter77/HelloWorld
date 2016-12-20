package collection.ex;

public class CompareY extends Point implements Comparable<Object> {
	
	public CompareY(double x,double y) {
		super(x,y);
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Point){
			Point p = (Point) o;
			if(this.getY() > p.getY()){
				return 1;
			}else if(this.getY() < p.getY()){
				return -1;
			}else{
				if(this.getX() > p.getX()){
					return 1;
				}else if(this.getX() < p.getX()){
					return -1;
				}else
					return 0;
//				super.compareTo(p);
			}
		}
		return 7;
	}
}