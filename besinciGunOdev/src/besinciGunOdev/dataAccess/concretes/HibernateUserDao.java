package besinciGunOdev.dataAccess.concretes;

import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : "+ user.getName()+" "+user.getSurname());
		
	}


	@Override
	public String getmail(User user) {
		return user.getEmail();
	}


	@Override
	public String getpassword(User user) {
		return user.getPassword();
	}

}
