package probe;
import java.util.Scanner;
import helper.Utilities;
import dao.DAO;
import dao.Factory;
import entities.Entity;
import entities.Language;
import entities.User;
import entities.Word;

public class Sample {

	static Scanner in = new Scanner(System.in);
	static DAO dao = Factory.getInstance().getDAO();
	static int n = 0;

	public static void menu() {
		
		System.out.println("1 - Ввод; \n"
				+          "2 - Удаление; \n"
				+          "3 - Вывод; \n"
				+		   "4 - Вывод всех; \n"
				+		   "5 - Сортировака по имени;");
	}
	public static void inputUser() {

		System.out.print("\nИмя юзера: ");
		String name = in.next();
		System.out.print("\nПароль: ");
		String pass = in.next();
		Entity user = new User(Utilities.getID(), name, pass);
		dao.save(user);
		n = n + 1;
	}
	
	public static void deleteUser() {
	
		System.out.print("\nИмя юзера: ");
		String name = in.next();	
		dao.delete(dao.getUserByName(name));
		n = n - 1;
	}

	public static void outputUser() {
		
		System.out.print("\nИмя юзера: ");
		String name = in.next();
		dao.getUserByName(name);
		System.out.println("\n" + dao.getUserByName(name).toString());
	}
	
	public static void outputEverything() {
		for (int i = 0; i < n; i++) {
			System.out.println(dao.getAllUsers(i));
		}
	}
	
	public static void sortByUserName() {
		User[] users = new User [n];
		for (int i = 0; i < n; i++) {
			users[i] = dao.getAllUsers(i);
		}
		for (int i = n - 1; i >= 2; i--) {
			boolean sorted = true;
			for (int j = 0; j < i; j++) {
				if (users[j].getUserName().charAt(0) > users[j+1].getUserName().charAt(0)) {
					User user = users[j];
					users[j] = users[j+1];
					users[j+1] = user;
					sorted = false;
				}
			}
			if (sorted) break;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(users[i].toString());
		}
	}

	public void smallSample() {
		
		String key = null;
		while (key != "q") {
			menu();
			key = in.next();
			switch (key) {
			case "1": inputUser(); break;
			case "2": deleteUser(); break;
			case "3": outputUser(); break;
			case "4": outputEverything(); break;
			case "5": sortByUserName(); break;
			}
		}
	}
}
