package arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DynamicList {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(21);
		list.add(23);
		list.add(41);
		list.add(15);
		list.add(9);
		System.out.println(list);
		List<Integer> list2 = new ArrayList<Integer>();		
		list2.addAll(list);
		Collections.sort(list2);
		for(Integer i : list2) {			
			System.out.print(i + " ");
		}
	}
}
