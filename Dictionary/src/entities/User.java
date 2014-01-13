package entities;
import java.math.BigInteger;

public class User extends Entity{

	private String userName, userPassword;
	
	public User(BigInteger id, String name, String password) {
		super(id);
		userName = name;
		userPassword = password;
	}
	
	public void setUserPassword(String password) {
		userPassword = password;
	}
	
	public void setUserName(String name) {
		userName = name;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public String toString() {
		return "[user, " + userName + ", " + getClassID() + "]";
	}
	
	public boolean equals(Object obj) {
		if (getClass() == null) {
			return false;
		}
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Entity that = (Entity) obj;
        return getClassID().equals(that.getClassID());
    }
	
}
