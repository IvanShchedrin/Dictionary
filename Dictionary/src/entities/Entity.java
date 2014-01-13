package entities;
import java.math.BigInteger;

public abstract class Entity {
	
	private BigInteger classID;
	private String className;
	
	
	public Entity(BigInteger id) {
        classID = id;
    }
	
	public void setClassID(BigInteger id) {
		classID = id;
	}

	public void setClassName(String name) {
		className = name;
	}
	
	public BigInteger getClassID() {
		return classID;
	}
	
	public String getClassName() {
		return className;
	}
	
	public String toString() {
		return "[" + className + "   " + classID + "]";
	}
	
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Entity that = (Entity) obj;
        return classID.equals(that.classID);
    }
	
	public int hashCode() {
        return classID.hashCode();
    }

	
}
