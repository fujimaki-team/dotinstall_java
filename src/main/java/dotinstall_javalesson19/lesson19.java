package dotinstall_javalesson19;

class User {
	String name;

	  User(String name) {
	    this.name = name;
	  }


	  User() {
	  
	    this("Me!");
	  }

	  void sayHi() {
	    System.out.println("hi! " + this.name);
	  }
	}


public class lesson19 {
	public static void main(String[] args) {
	    User tom;
	    // tom = new User("Tom");
	    tom = new User();
	    System.out.println(tom.name);
	    tom.sayHi();
	}
}
