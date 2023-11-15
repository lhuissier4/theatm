package fr.unilim.iut.atm.handler;

import fr.unilim.iut.atm.BankNote;
import fr.unilim.iut.atm.BankNotesBundle;
import fr.unilim.iut.atm.Money;

public class BankNotesHandler {
	BankNotesHandler next;
	private static final String CURRENCY = "Euros";
	
	public Money dispense(int amount, Money money) {
		if (next!=null) {
			return next.dispense(amount, money);
		}
		return null;
		
	}
	public void setNext(BankNotesHandler handler) {
		this.next=handler;
	}
}
