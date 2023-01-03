import java.util.Scanner;

import game.Rules;
import game.Deck;
import game.Player;

public class GameRunner {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("\nWELCOME TO BLACKJACK");
		
		Rules rules = new Rules();
		rules.display();
		Scanner sc = new Scanner(System.in);
		Deck theDeck = new Deck(1, true);
		
		Player me = new Player("  Shrijay");
		Player dealer = new Player("  Dealer");
		
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		
		
		System.out.println("Cards are dealt\n");
		me.printHand(true);
		dealer.printHand(false);
		System.out.println("\n");
		
		
		
		boolean meDone = false;
		boolean dealerDone = false;
		String ans;
		
		while (!meDone || !dealerDone) {
			if(!meDone) {
				System.out.print("Hit or Stay? (Enter H or S): ");
				ans = sc.next();
				System.out.println();
				
				if(ans.compareToIgnoreCase("H")==0){
					
					meDone=!me.addCard(theDeck.dealNextCard());
					me.printHand(true);
					
				}else {
					meDone = true;
				}
				
			}
			
			if(!dealerDone) {
				if(dealer.getHandSum() < 17) {
					System.out.println("\nThe Dealer hits\n");
					dealerDone = !dealer.addCard(theDeck.dealNextCard());
					dealer.printHand(false);
				} else {
					System.out.println("\nThe Dealer stays\n");
					dealerDone = true;
				}
			}
			
			System.out.println();
			
		}
		
		sc.close();
		
		me.printHand(true);
		dealer.printHand(true);
		
		int mySum = me.getHandSum();
		int dealerSum = dealer.getHandSum();
		
		if(mySum  > dealerSum && mySum <=21 || dealerSum > 21) {
			System.out.println("\nYour win!!");
		} else {
			System.out.println("\nDealer wins!");
		}
	}

}
