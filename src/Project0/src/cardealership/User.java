package cardealership;

import java.util.HashMap;
import java.io.Serializable;

public class User implements java.io.Serializable {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	HashMap<String, String> login = new HashMap<String, String> ();

}
