package org.Q3;

public class BankAccountepositoryImpl implements BankAccountRepository {

	private BankAccount bankAccount;
	
	@Override
	public double getBalance(int accountId) {
		// TODO Auto-generated method stub
		return bankAccount.getAccountId();
	}

	@Override
	public double updateBalance(int accountId, double newBalance) {
		// TODO Auto-generated method stub
		return bankAccount.getAccountBalance();
	}

}
