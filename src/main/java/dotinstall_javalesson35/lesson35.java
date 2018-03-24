package dotinstall_javalesson35;

public class lesson35 {
	
	public static void main(String[] args) {
		new Thread(() -> {
		  for (int i = 0; i < 500; i++) {
		     System.out.print('*');
		   }
		 }).start();

		    for (int i = 0; i < 500; i++) {
		      System.out.print('.');
		    }
		    
	}
	

}
