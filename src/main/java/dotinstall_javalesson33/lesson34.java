package dotinstall_javalesson33;

class MyData<T> {
	  public void getThree(T x) {
	    System.out.println(x);
	    System.out.println(x);
	    System.out.println(x);
}
}

public class lesson34 {

	public static void main(String[] args) {
		MyData<Integer> i = new MyData<>();
	    i.getThree(32);
	    MyData<String> s = new MyData<>();
	    s.getThree("hello");

	}

}
