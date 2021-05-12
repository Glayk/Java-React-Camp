package besinciGunOdev.business.concretes;

import java.util.Scanner;

import besinciGunOdev.business.abstracts.UserService;
import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void SignIn(User user) throws Exception {
		if(user.getPassword().length()<6) {
			System.out.println("Parola 6 karakterden az olamaz!");
			return;
		}
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		Boolean b = user.getEmail().matches(EMAIL_REGEX);
		if(b==false) {
			System.out.println("Do�ru email format� giriniz.");
			return;
		}
		if(user.getName().length()<2 || user.getSurname().length()<2) {
			System.out.println("Ad veya soyad 2 karakterden az olamaz!");
			return;
		}
		
		System.out.println("Do�rulama mailine t�klad�n�z m�? (e,h)");
		char response;
		response =(char) System.in.read(); 
		if(response=='e') {
			System.out.println("Kay�t ger�ekle�tirildi: "+ user.getName()+" "+user.getSurname());
			this.userDao.add(user);
		}else {
			System.out.println("Kay�t ger�ekle�tirilemedi.");
			return;
		}
		
	}

	@Override
	public void LogIn(User user) {
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter email and password:");
	    String email = myObj.next();   
	    String password = myObj.next();  
	    
	    if(email.equals(this.userDao.getmail(user))==true && password.equals(this.userDao.getpassword(user))==true){
	    	System.out.println("Giri� ba�ar�l�");
	    }else {
	    	System.out.println("Giri� ba�ar�s�z! email ve �ifrenizi kontrol edin.");
	    }
		
		myObj.close();
		
	}

}
