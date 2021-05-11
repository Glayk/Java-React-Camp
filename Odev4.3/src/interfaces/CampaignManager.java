package interfaces;

public class CampaignManager {
	public void add(Campaign campaign) {
		RegistrationProcess rp = new RegistrationProcess();
		rp.proc(campaign.getCampaingName());
	}
	public void update(Campaign campaign) {
		UpdatingProcess up = new UpdatingProcess();
		up.proc(campaign.getCampaingName());
	}
	public void delete(Campaign campaign) {
		DeletingProcess dp = new DeletingProcess();
		dp.proc(campaign.getCampaingName());
	}
}
