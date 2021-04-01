package org.Q3;

public class BankAccountController {

	private BankAccount bankAccount;

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void bankAccountDetails() {
		System.out.println("Acc Id: " + getBankAccount().getAccountId());
		System.out.println("Acc Holder Name: " + getBankAccount().getAccountHolderName());
		System.out.println("Acc Type: " + getBankAccount().getAccountType());
		System.out.println("Acc Balance: " + getBankAccount().getAccountBalance());
	}
}
