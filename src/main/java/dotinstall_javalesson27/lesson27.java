package dotinstall_javalesson27;

class User {
	protected String name;
	private static final double VERSION = 1.1;

	public User(String name) {
		this.name = name;
		//User.VERSION = 1.2;
	}

	public void sayHi() {
		System.out.println("hi! " + this.name);
	}
}

class AdminUser extends User {

	public AdminUser(String name) {
		super(name);
	}

	@Override
	public void sayHi() {
		System.out.println("[admin] hi! " + this.name);
	}

}

public class lesson27 {

	public static void main(String[] args) {
		User tom = new User("tom");
	}
}




