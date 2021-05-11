package interfaces;

public class UpdatingProcess implements Process{

	@Override
	public void proc(String message) {
		
		System.out.println(message +" güncellendi");
		
	}

}
