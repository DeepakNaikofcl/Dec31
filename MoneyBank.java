package edu.peters.session;

public interface MoneyBank {
		
		void withDraw(int amt) throws InSufficientBalanceException;
	

}
