package fr.unilim.iut.atm;

import fr.unilim.iut.atm.handler.BankNotesHandler;
import fr.unilim.iut.atm.handler.FiftyBankNotesHandler;
import fr.unilim.iut.atm.handler.FiveBankNotesHandler;
import fr.unilim.iut.atm.handler.TenBankNotesHandler;
import fr.unilim.iut.atm.handler.TwentyBankNotesHandler;

public class ATM {

	private BankNotesHandler bankNotesHandler;
	

	public ATM() {

		BankNotesHandler bankNotesHandler=new FiftyBankNotesHandler();
		BankNotesHandler bankNotesHandler2=new TwentyBankNotesHandler();
		BankNotesHandler bankNotesHandler3=new TenBankNotesHandler();
		BankNotesHandler bankNotesHandler4=new FiveBankNotesHandler(); 
		
		bankNotesHandler.setNext(bankNotesHandler2);
		bankNotesHandler2.setNext(bankNotesHandler3);
		bankNotesHandler3.setNext(bankNotesHandler4);
	}
		
		
	
	public Money withdraw(int amount) {
		Money money = Money.NO;
		money=this.bankNotesHandler.dispense(amount, money);
		return money;
		
	}
}
