package fr.unilim.iut.atm.handler;

import fr.unilim.iut.atm.BankNote;
import fr.unilim.iut.atm.BankNotesBundle;
import fr.unilim.iut.atm.Money;

public class TenBankNotesHandler extends BankNotesHandler{
	


	private static final String CURRENCY = "Euros";
	
	
	public Money dispense(int amount, Money money) {
		if (amount >= 10) {
			int numberof50BankNotes = amount / 10;
			money = money.add(new BankNotesBundle(new BankNote (10,CURRENCY), numberof50BankNotes));
		}
		amount = amount % 10;
		return super.dispense(amount, money);
		
	}
	
}

