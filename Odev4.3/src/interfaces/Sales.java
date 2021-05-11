package interfaces;

public class Sales  {
	private int id;
	private String gameName;
	private String gamerName;
	private float price;
	
	public Sales() {
	}

	public Sales(int id, String gameName, String gamerName, float price) {
		
		this.id = id;
		this.gameName = gameName;
		this.gamerName = gamerName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	
}
