package dotinstall_javalesson25;

class User {
	private String name;
	private static int count = 0;
	
	public User(String name) {
		this.name = name;
		User.count++;
	}
	
	public static void getInfo() {
		System.out.print("# of instances: " + User.count);
	}
}
public class lesson25 {

	public static void main(String[] args) {
		User.getInfo();
		User tom = new User("tom");
		User.getInfo();
		User bob = new User("tom");
		User.getInfo();
	}

}
