package collection.ex;

import java.util.Comparator;

public class Mycomparator implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		return o1.getX()>o2.getX()?1:-1;
//		return o1.getY()>o2.getY()?1:-1;
	}

}
