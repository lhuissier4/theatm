package fr.unilim.iut.atm.handler;

import fr.unilim.iut.atm.BankNote;
import fr.unilim.iut.atm.BankNotesBundle;
import fr.unilim.iut.atm.Money;

public class FiveBankNotesHandler extends BankNotesHandler{
	


	private static final String CURRENCY = "Euros";
	
	
	public Money dispense(int amount, Money money) {
		if (amount >= 5) {
			int numberof50BankNotes = amount / 5;
			money = money.add(new BankNotesBundle(new BankNote (5,CURRENCY), numberof50BankNotes));
		}
		amount = amount % 5;
		return super.dispense(amount, money);
		
	}
	
}