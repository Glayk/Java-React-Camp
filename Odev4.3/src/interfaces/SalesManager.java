package interfaces;

import java.io.IOException;

public class SalesManager {
	public SalesManager(Gamer gamer,Sales sale,Campaign campaign) throws IOException {
		System.out.println("Kampanya ister misiniz? (e,h)");
		char response;
		response =(char) System.in.read(); 		
		if(response=='e') {
			System.out.println("Kampanyalý satýþ yapýldý : "+gamer.getFirstName()
			+" "+gamer.getLastName()+", "+(sale.getPrice()-(sale.getPrice()*campaign.getDiscount()/100))+" tl,");
		}
		else {
			System.out.println("Kampanyasýz satýþ yapýldý : "+gamer.getFirstName()
			+" "+gamer.getLastName()+", "+sale.getPrice()+" tl,");
		}
			
		
	}
}
