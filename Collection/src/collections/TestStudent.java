package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		//创建Comparator接口的实现类 comparator
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择排序方式:");
		System.out.println("1.名称升序 "+" "+"2.名称降序"+" "+"3.分数升序"+" "+"4.分数降序");
		final int flag = scanner.nextInt();
		Comparator comparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student &&
						o2 instanceof Student){
					Student s1 = (Student) o1;
					Student s2 = (Student) o2;
					int scoreResult = s1.getScore() - s2.getScore();
					int nameResult = s1.getName().compareTo(s2.getName());
					switch(flag){
						case 1: return nameResult;
						case 2: return -nameResult;
						case 3: return scoreResult;
						case 4: return -scoreResult;
					}
				}
				throw new ClassCastException();
			}
		};
		//1.创建TreeSet 对象,并实现Comparator接口的实现类对象compare
		TreeSet set = new TreeSet(comparator);
		//2.按照要求输入相应数据，并将其放入 TreeSet 中
		process(set);
		//3.排序输出结果
		result(set);
	}

	private static void result(TreeSet set) {
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	private static void process(TreeSet set) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("Student["+(i+1)+"]'s name:");
			String name = scanner.next();
			System.out.print("Student["+(i+1)+"]'s score:");
			int score = scanner.nextInt();
			Student stu = new Student(name,score);
			set.add(stu);
		}
		scanner.close();
	}
}