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
		assertTrue("Неверное имя юзера", user.getUserName() == "Ivan");         //сделать через equals все методы
		assertTrue("Неверный пароль юзера", user.getUserPassword() == "123");
		assertTrue("Неверный ID класса user", user.getClassID() == classID);
	}
	
	@Test
	public void testWord() {
		BigInteger classID = Utilities.getID();
		Word word = new Word(classID, "Apple");
		assertTrue("Неверное слово", word.getTransWord() == "Apple");
		assertTrue("Неверный ID класса word", word.getClassID() == classID);
	}
	
	@Test
	public void testLanguage() {
		BigInteger classID = Utilities.getID();
		Language lang = new Language(classID, 10);
		assertTrue("Неверный язык", lang.getLangID() == 10);
		assertTrue("Неверный ID класса word", lang.getClassID() == classID);
	}
	
}
