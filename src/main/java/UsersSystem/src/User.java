
public class User {
	private String username;
	private String password;
	private String color;
	private String lastName;
	
	
	public User(String userName, String password, String color) {
		this.username = userName;
		this.password = password;
		this.color = color;
	}
	
	public User(String userName, String password, String color, String lastname) {
		this.username = userName;
		this.password = password;
		this.color = color;
		this.lastName = lastname;
	}
	
	public boolean isPasswordCorrect(String password) {
		if(this.password == password) {
			return true;
		}
		return false;
	}

	public String getUsername() {
		return this.username;
	}

	public String getColor() {
		return this.color;
	}
	
	public String getLastname() {
		return this.lastName;
	}
	
	public void setPassword(String password) {
		if(!password.isBlank())
		{
			this.password = password;
		}
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
