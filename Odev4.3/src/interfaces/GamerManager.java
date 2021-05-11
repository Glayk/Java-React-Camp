package interfaces;

public class GamerManager {
	
	public void add(Gamer gamer) {
		RegistrationProcess rp = new RegistrationProcess();
		rp.proc(gamer.getFirstName()+" "+ gamer.getLastName());
	}
	public void update(Gamer gamer) {
		UpdatingProcess up = new UpdatingProcess();
		up.proc(gamer.getFirstName()+" "+ gamer.getLastName());
	}
	public void delete(Gamer gamer) {
		DeletingProcess dp = new DeletingProcess();
		dp.proc(gamer.getFirstName()+" "+ gamer.getLastName());
	}
}
