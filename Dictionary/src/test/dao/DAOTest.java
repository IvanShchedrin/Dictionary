package test.dao;

import static org.junit.Assert.*;

import java.math.BigInteger;

import helper.Utilities;

import org.junit.*;

import dao.DAO;
import dao.Factory;
import entities.User;

public class DAOTest {

	static DAO dao = Factory.getInstance().getDAO();
	
	@Test
	public void testSave() {
		BigInteger classID = Utilities.getID();
		User user = new User(classID, "Ivan", "123");
		dao.save(user);
		
	}
}