package dotinstall_javalesson28;

abstract class User {
	  public abstract void sayHi();
	}

	class JapaneseUser extends User {
	  @Override
	  public void sayHi() {
	    System.out.println("こんにちは！");
	  }
	}

	class AmericanUser extends User {
	  @Override
	  public void sayHi() {
	    System.out.println("Hi!");
	  }
	}

public class lesson28 {

	public static void main(String[] args) {
		AmericanUser tom = new AmericanUser();
		JapaneseUser aki = new JapaneseUser();
		tom.sayHi();
		aki.sayHi();
	}
}

