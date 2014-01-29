package dao;
import java.math.BigInteger;

import entities.Entity;
import entities.Language;
import entities.User;
import entities.Word;

public interface DAO {

	public void save(Entity se);
	public User getUserByName(String name);
	public Word getWordByName(String name);
	public Language getLangByNumber(int numb);
	public boolean delete(Entity se);
	public Entity findByID(Class<Entity> clazz, BigInteger id);
	public User getAllUsers(int n);
}
