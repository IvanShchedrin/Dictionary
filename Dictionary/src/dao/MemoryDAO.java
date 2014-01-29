package dao;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import entities.Entity;
import entities.User;
import entities.Word;
import entities.Language;

public class MemoryDAO implements DAO {

	private Map<BigInteger, User> users = new HashMap<BigInteger, User>();
	private Map<BigInteger, Word> words = new HashMap<BigInteger, Word>();
	private Map<BigInteger, Language> languages = new HashMap<BigInteger, Language>();

	@Override
	public void save(Entity se) {
		if (se instanceof User) {
			users.put(se.getClassID(), (User) se);
		} else if (se instanceof Word) {
			words.put(se.getClassID(), (Word) se);
		} else if (se instanceof Language) {
			languages.put(se.getClassID(), (Language) se);
		}

	}

	@Override
	public boolean delete(Entity se) {
		if (se instanceof User) {
			users.remove(se.getClassID());
			return true;
		} else if (se instanceof Word) {
			words.remove(se.getClassID());
			return true;
		} else if (se instanceof Language) {
			languages.remove(se.getClassID());
			return true;
		}
		return false;
	}

	@Override
	public Entity findByID(Class<Entity> clazz, BigInteger id) {
		if (User.class.equals(clazz)) {
			return users.get(id);
		}
		if (Word.class.equals(clazz)) {
			return words.get(id);
		}
		if (Language.class.equals(clazz)) {
			return languages.get(id);
		}

		return null;
	}

	@Override
	public User getUserByName(String name) {

		Set<Map.Entry<BigInteger, User>> set = users.entrySet();
		for (Map.Entry<BigInteger, User> me : set) {
			if (me.getValue().getUserName().equals(name)) {
				return me.getValue();
			}
		}
		return null;
	}
	
	@Override
	public User getAllUsers(int n) {
		int m = 0;
		Set<Map.Entry<BigInteger, User>> set = users.entrySet();
		for (Map.Entry<BigInteger, User> me : set) {
			if (m == n) {
				return me.getValue();
			} else m = m + 1;
		}
		return null;
	}

	@Override
	public Word getWordByName(String name) {
		
		Set<Map.Entry<BigInteger, Word>> set = words.entrySet();
		for (Map.Entry<BigInteger, Word> me : set) {
			if (me.getValue().getTransWord().equals(name)) {
				return me.getValue();
			}
		}
		return null;
	}

	@Override
	public Language getLangByNumber(int numb) {
		
		Set<Map.Entry<BigInteger, Language>> set = languages.entrySet();
		for (Map.Entry<BigInteger, Language> me : set) {
			if (me.getValue().getLangID().equals(numb)) {
				return me.getValue();
			}
		}
		return null;
	}

	
	
}