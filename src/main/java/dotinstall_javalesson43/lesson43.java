package dotinstall_javalesson43;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class lesson43 {

	public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.now();

	    System.out.println(d.getYear());
	    System.out.println(d.getMonth());
	    System.out.println(d.getMonth().getValue());

	    System.out.println(d.plusMonths(2).minusDays(3));

	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
	    System.out.println(d.format(dtf));

	}

}
