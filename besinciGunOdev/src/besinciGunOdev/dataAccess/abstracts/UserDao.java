package besinciGunOdev.dataAccess.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface UserDao {
	void add(User user);
	String getmail(User user);
	String getpassword(User user);
	
}
	
