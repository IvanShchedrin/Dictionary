package dao;

import java.math.BigInteger;
import entities.Entity;
import entities.User;

public interface DAO {

	public void save(Entity se);

	public User getUserByName(String name);

	public boolean delete(Entity se);

	public Entity findByID(Class<Entity> clazz, BigInteger id);

	public User getAllUsers(int n);
}
