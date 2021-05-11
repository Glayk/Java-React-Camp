package interfaces;

public class Campaign {
	private int id;
	private float discount;
	private String campaignName;
	
	public Campaign() {
		
	}
	public Campaign(int id, float discount, String campaignName) {
		
		this.id = id;
		this.discount = discount;
		this.campaignName = campaignName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getCampaingName() {
		return campaignName;
	}
	public void setCampaingName(String campaignName) {
		this.campaignName = campaignName;
	}
	
}
