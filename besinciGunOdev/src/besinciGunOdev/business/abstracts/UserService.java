package besinciGunOdev.business.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface UserService {
	void SignIn(User user) throws  Exception;
	void LogIn(User user);
}
