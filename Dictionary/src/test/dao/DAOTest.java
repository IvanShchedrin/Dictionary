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
		assertTrue("������������ ��������� �� �����", user1.equals(dao.getUserByName("Ivan")));
		assertTrue("������������ ��������� �� �����", user2.equals(dao.getUserByName("Peter")));
		dao.delete(dao.getUserByName("Ivan"));
		assertTrue("��������� ������������ �� ������", dao.getUserByName("Ivan") == null);
		assertFalse("������ ������ ������������ ����� ��������", dao.getUserByName("Peter") == null);
	}


	@Test
	public void testSaveWord() {
		
		Word word1 = new Word(Utilities.getID(), "Apple");
		Word word2 = new Word(Utilities.getID(), "Orange");
		dao.save(word1);
		dao.save(word2);
		assertTrue("����� ���������", word1.equals(dao.getWordByName("Apple")));
		assertTrue("����� ���������", word2.equals(dao.getWordByName("Orange")));
		dao.delete(dao.getWordByName("Apple"));
		assertTrue("��������� ����� �� �������", dao.getWordByName("Apple") == null);
		assertFalse("������� ������ ����� ����� ��������", dao.getWordByName("Orange") == null);
}
	
	@Test
	public void testSaveLanguage() {
	
		Language lang1 = new Language(Utilities.getID(), 1);
		Language lang2 = new Language(Utilities.getID(), 2);
		dao.save(lang1);
		dao.save(lang2);
		assertTrue("����� ���������", lang1.equals(dao.getLangByNumber(1)));
		assertTrue("����� ���������", lang2.equals(dao.getLangByNumber(2)));
		dao.delete(dao.getLangByNumber(1));
		assertTrue("��������� ���� �� ������", dao.getLangByNumber(1) == null);
		assertFalse("������ ������ ���� ����� ��������", dao.getLangByNumber(2) == null);
	}
	
}
