package besinciGunOdev;

import besinciGunOdev.business.abstracts.UserService;
import besinciGunOdev.business.concretes.UserManager;
import besinciGunOdev.dataAccess.concretes.HibernateUserDao;
import besinciGunOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		UserService userService = new UserManager(new HibernateUserDao());
		
		User user1 = new User(1,"Gül", "Ayýk", "gul@gmail.com", "gul123");
		//User user2 = new User(1,"Gül", "Ayýk", "gul", "gul1895");
		userService.SignIn(user1);
		userService.LogIn(user1);
	}

}
