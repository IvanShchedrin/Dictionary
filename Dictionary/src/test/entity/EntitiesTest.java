package test.entity;
import static org.junit.Assert.*;
import java.math.BigInteger;
import helper.Utilities;
import org.junit.*;
import entities.Language;
import entities.User;
import entities.Word;


public class EntitiesTest {
	
	@Test
	public void testUser() {
		BigInteger classID = Utilities.getID();
		User user = new User(classID, "Ivan", "123");
		assertTrue("�������� ��� �����", user.getUserName() == "Ivan");         //������� ����� equals ��� ������
		assertTrue("�������� ������ �����", user.getUserPassword() == "123");
		assertTrue("�������� ID ������ user", user.getClassID() == classID);
	}
	
	@Test
	public void testWord() {
		BigInteger classID = Utilities.getID();
		Word word = new Word(classID, "Apple");
		assertTrue("�������� �����", word.getTransWord() == "Apple");
		assertTrue("�������� ID ������ word", word.getClassID() == classID);
	}
	
	@Test
	public void testLanguage() {
		BigInteger classID = Utilities.getID();
		Language lang = new Language(classID, 10);
		assertTrue("�������� ����", lang.getLangID() == 10);
		assertTrue("�������� ID ������ word", lang.getClassID() == classID);
	}
	
}
