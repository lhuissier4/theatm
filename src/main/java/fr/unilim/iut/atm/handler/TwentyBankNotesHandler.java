package fr.unilim.iut.atm.handler;

import fr.unilim.iut.atm.BankNote;
import fr.unilim.iut.atm.BankNotesBundle;
import fr.unilim.iut.atm.Money;

public class TwentyBankNotesHandler extends BankNotesHandler{
	


	private static final String CURRENCY = "Euros";
	
	
	public Money dispense(int amount, Money money) {
		if (amount >= 20) {
			int numberof50BankNotes = amount / 20;
			money = money.add(new BankNotesBundle(new BankNote (20,CURRENCY), numberof50BankNotes));
		}
		amount = amount % 20;
		return super.dispense(amount, money);
		
	}
	
}