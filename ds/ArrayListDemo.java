
package ds;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<>();
		
		//add elements
		
		a.add(2);
		a.add(3);
		a.add(6);
		a.add(4);
		a.add(34);
		a.add(5);
		
		Collections.sort(a);
		
		System.out.println(a);
		
		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);
		
		
		//remove element
		
		a.remove(3);
		System.out.println(a);
		
		//get method
		
		System.out.println(a.get(2));
		
		//set method
		
		a.set(2, 99);
		System.out.println(a);
		
		
		//contains method
		System.out.println(a.contains(86));
		System.out.println(a.contains(34));
		
		//clear
		
//		a.clear();
//		System.out.println(a);
		
		
		
		System.out.println((a.toString()));
	}

}
