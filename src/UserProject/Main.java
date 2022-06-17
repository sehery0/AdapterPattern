package UserProject;

import UserProject.adapter.MernisKpsAdapter;
import UserProject.business.concretes.UserManager;
import UserProject.entities.User;

public class Main {
	
	public static void main(String[] args) {
	User user = new User();
	user.setId(1);
	user.setFirstName("Seher");
	user.setLastName("Yalçın");
	user.setIdentityNumber("65866259276");
	user.setbirthYear(1999);
	
	UserManager userManager = new UserManager(new MernisKpsAdapter());
	userManager.add(user);

	}
}
