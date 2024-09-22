import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user1 = new User("shirlosh", "123", "white");
		User user2 = new User("biron", "345", "grey", "fifi");		
		User user3 = new User("orke", "fgf", "black");
		
		user1.setPassword("    ");
		
		User[] users = new User[] {user1,user2, user3};
		String username = scan.nextLine();
		String password = scan.nextLine();
		
		
		for(int i = 0; i<3; i++) {
			if(users[i].getUsername() == username && users[i].isPasswordCorrect(password)) {
				System.out.println(users[i].getColor());
				System.exit(0);
			}

		}

		System.out.println(" not Valid");
		
	}

}
