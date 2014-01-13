//Singletone
//Почитать, что такое Factory
package dao;

public class Factory {

	private static Factory instance;
	public DAO getDAO() {
		
		return new MemoryDAO();
	}
	
	private Factory() {
	}
	
	public static Factory getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		return instance;
	}
}
