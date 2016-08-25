package com.client.bank;


import com.framework.core.Fincom;
import com.framework.core.ITransaction;
import com.framework.core.ITransactionController;
import com.framework.core.Party;

public class Bank extends Fincom
{

	public void setCustomer(Party cust){
		this.customer = cust;
	}

	@Override
	protected ITransactionController createTransactionController() {
		return BankTransactionController.getBankTransactionController();
	}

	@Override
	protected void start() {
		print("Bank App based on " + name + " Version "+ VERSION);
	}

	@Override
	protected boolean createAccount() {
		return false;
	}

	@Override
	protected boolean executeTransaction(ITransaction t) {
		return transactionController.execute(t);
	}

	public static void main(String[] args) {
		System.out.println("Loading GUI");
		BankGui gui = new BankGui();
		gui.setBank(new Bank());
		gui.loadGui();
	}
}
