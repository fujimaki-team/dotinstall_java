package dotinstall_javalesson41;

import java.util.*;


public class lesson41 {

	public static void main(String[] args) {
		Map<String, Integer> sales = new HashMap<>();
		sales.put("tom", 10);
		sales.put("bob", 20);
		sales.put("steve", 30);	
		
		System.out.println(sales.get("tom"));
		System.out.println(sales.size());
		
		for (Map.Entry<String, Integer> sale : sales.entrySet()) {
		 System.out.println(sale.getKey() + ":" + sale.getValue());
    }

    sales.put("tom", 100);
    sales.remove("steve");

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    	 }
	}

}
