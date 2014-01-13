package entities;

import java.math.BigInteger;

public class Language extends Entity {
	private int lang;
	
	public Language(BigInteger id, int lang) {
		super(id);
		this.lang = lang;
	}

	public void setLangID(int lang) {
		this.lang = lang;
	}

	public int getLangID() {
		return lang;
	}
	
	public String toString() {
		return "[language, " + lang + ", " + getClassID() + "]";
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
