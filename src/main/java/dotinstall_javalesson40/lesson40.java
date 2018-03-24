package dotinstall_javalesson40;

import java.util.*;


public class lesson40 {

	public static void main(String[] args) {
		Set<Integer> sales =new HashSet<>();
		
		sales.add(10);
		sales.add(20);
		sales.add(30);
		
		System.out.println(sales.size());
		
		for (Integer sale : sales) {
			System.out.println(sale);
	}
		sales.remove(30);
		
		for (Integer sale : sales) {
			System.out.println(sale);
		}
		
	}

}
