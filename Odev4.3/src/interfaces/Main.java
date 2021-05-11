package interfaces;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Gamer gamer1=new Gamer();
		gamer1.setFirstName("Gül");
		gamer1.setLastName("Ayýk");
		gamer1.setScore(50);
		
		Gamer gamer2=new Gamer();
		gamer2.setFirstName("Halil");
		gamer2.setLastName("Ayýk");
		gamer2.setScore(100);
		
		Campaign campaign1=new Campaign(1,10,"k1");
		Campaign campaign2=new Campaign(2,30,"k2");
		
		Sales sale1=new Sales(1,"COD",gamer1.getFirstName(),400);
		Sales sale2=new Sales(2,"GOW",gamer2.getFirstName(),500);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer2);
		gamerManager.add(gamer1);
		gamerManager.delete(gamer1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.update(campaign1);
		
		//SalesManager salesManager1 = new SalesManager(gamer1,sale1,campaign1);
		SalesManager salesManager2 = new SalesManager(gamer2,sale2,campaign2);
		
		
		
		
		

	}

}
