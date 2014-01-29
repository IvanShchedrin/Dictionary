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
		User user1 = new User(classID, "Ivan", "123");
		User user2 = new User(Utilities.getID(), "Peter", "321");
		User user3 = new User (classID, "Ivan", "123");
		assertFalse("Различные пользователи", user1.equals(user2));
		assertTrue("Одинаковые пользователи", user1.equals(user3));
	}
	
	@Test
	public void testWord() {
		BigInteger classID = Utilities.getID();
		Word word1 = new Word(classID, "Apple");
		Word word2 = new Word(Utilities.getID(), "Orange");
		Word word3 = new Word(classID, "Apple");
		assertFalse("Различное слово", word1.equals(word2));
		assertTrue("Одинаковое слово", word1.equals(word3));
	}
	
	@Test
	public void testLanguage() {
		BigInteger classID = Utilities.getID();
		Language lang1 = new Language(classID, 10);
		Language lang2 = new Language(Utilities.getID(), 11);
		Language lang3 = new Language(classID, 10);
		assertFalse("Различные языки", lang1.equals(lang2));
		assertTrue("Одинаковые языки", lang1.equals(lang3));
	}
	
}
