package dotinstall_javalesson39;

import java.util.*;

public class lesson39 {

	public static void main(String[] args) {
		List<Integer> sales =new ArrayList<>();
		
		sales.add(10);
		sales.add(20);
		sales.add(30);
		
		for (int i = 0; i < sales.size(); i++) {
	      System.out.println(sales.get(i));
	    }

	    sales.set(0, 100);
	    sales.remove(2);

	    for (Integer sale : sales) {
	    	System.out.println(sale);
	    }

	}

}
