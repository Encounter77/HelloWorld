import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.Test;

public class CollectionTest {
	@Test
	public void test1(){
		Set set = new LinkedHashSet();
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		set.add("DDD");
		Set set2 = new LinkedHashSet();
		set2.add("ABC");
		set2.add("AAA");
		set2.add("BBB");
		
//		set.addAll(set2);			//并集
//		set.retainAll(set2);		//交集
//		set.removeAll(set2);		//差集
		Iterator in = set.iterator();
		while(in.hasNext()){
			System.out.println(in.next());
		}
	}
}
