package interfaces;

public class DeletingProcess implements Process {

	@Override
	public void proc(String message) {
		System.out.println(message +" silindi");
		
	}

}
