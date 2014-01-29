package test.dao;

import static org.junit.Assert.*;
import helper.Utilities;

import org.junit.*;

import dao.DAO;
import dao.Factory;
import entities.Language;
import entities.User;
import entities.Word;

public class DAOTest {

	static DAO dao = Factory.getInstance().getDAO();
	
	@Test
	public void testSaveUser() {
	
		User user1 = new User(Utilities.getID(), "Ivan", "123");
		User user2 = new User(Utilities.getID(), "Peter", "321");
		dao.save(user1);
		dao.save(user2);
		assertTrue("Пользователи совпадают по имени", user1.equals(dao.getUserByName("Ivan")));
		assertTrue("Пользователи совпадают по имени", user2.equals(dao.getUserByName("Peter")));
		dao.delete(dao.getUserByName("Ivan"));
		assertTrue("Удаленный пользователь не найден", dao.getUserByName("Ivan") == null);
		assertFalse("Найден другой пользователь после удаления", dao.getUserByName("Peter") == null);
	}


	@Test
	public void testSaveWord() {
		
		Word word1 = new Word(Utilities.getID(), "Apple");
		Word word2 = new Word(Utilities.getID(), "Orange");
		dao.save(word1);
		dao.save(word2);
		assertTrue("Слова совпадают", word1.equals(dao.getWordByName("Apple")));
		assertTrue("Слова совпадают", word2.equals(dao.getWordByName("Orange")));
		dao.delete(dao.getWordByName("Apple"));
		assertTrue("Удаленное слово не найдено", dao.getWordByName("Apple") == null);
		assertFalse("Найдено другое слово после удаления", dao.getWordByName("Orange") == null);
}
	
	@Test
	public void testSaveLanguage() {
	
		Language lang1 = new Language(Utilities.getID(), 1);
		Language lang2 = new Language(Utilities.getID(), 2);
		dao.save(lang1);
		dao.save(lang2);
		assertTrue("Языки совпадают", lang1.equals(dao.getLangByNumber(1)));
		assertTrue("Языки совпадают", lang2.equals(dao.getLangByNumber(2)));
		dao.delete(dao.getLangByNumber(1));
		assertTrue("Удаленный язык не найден", dao.getLangByNumber(1) == null);
		assertFalse("Найден другой язык после удаления", dao.getLangByNumber(2) == null);
	}
	
}
