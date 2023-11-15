package fr.unilim.iut.atm.handler;

import fr.unilim.iut.atm.BankNote;
import fr.unilim.iut.atm.BankNotesBundle;
import fr.unilim.iut.atm.Money;

public class FiftyBankNotesHandler extends BankNotesHandler{
	


	private static final String CURRENCY = "Euros";
	
	
	public Money dispense(int amount, Money money) {
		if (amount >= 50) {
			int numberof50BankNotes = amount / 50;
			money = money.add(new BankNotesBundle(new BankNote (50,CURRENCY), numberof50BankNotes));
		}
		amount = amount % 50;
		return super.dispense(amount, money);
		
	}
	
}
