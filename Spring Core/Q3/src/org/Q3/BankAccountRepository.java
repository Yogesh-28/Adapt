package org.Q3;

public interface BankAccountRepository {
	
	public double getBalance(int accountId);
	public double updateBalance(int accountId, double newBalance);
}
