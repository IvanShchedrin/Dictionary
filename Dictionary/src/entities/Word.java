package entities;
import java.math.BigInteger;

public class Word extends Entity {

	private String transWord;
	
	public Word(BigInteger id, String word) {
		super(id);
		transWord = word;
	}
	
	public void setTransWord(String word) {
		transWord = word;
	}
	
	public String getTransWord() {
		return transWord;
	}
	
	public String toString() {
		return "[word, " + transWord + ", " + getClassID() + "]";
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
