package com.client.bank;

import com.framework.core.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Map;

/**
 * A basic JFC based application.
 */
public class BankGui extends JFrame
{
    /****
     * init variables in the object
     ****/
	public static Bank bank;
    String accountnr, clientName,street,city,zip,state,accountType,clientType,amountDeposit;
    boolean newaccount;
    private DefaultTableModel model;
    private JTable JTable1;
    private JScrollPane JScrollPane1;
    BankGui myframe;
    private Object rowdata[];
    
	public BankGui()
	{
		myframe = this;
		setTitle("Bank Application.");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0,0));
		setSize(575,310);
		setVisible(false);
		JPanel1.setLayout(null);
		getContentPane().add(BorderLayout.CENTER, JPanel1);
		JPanel1.setBounds(0,0,575,310);
		/*
		/Add five buttons on the pane 
		/for Adding personal account, Adding company account
		/Deposit, Withdraw and Exit from the system
		*/
        JScrollPane1 = new JScrollPane();
        model = new DefaultTableModel();
        JTable1 = new JTable(model);
        model.addColumn("AccountNr");
        model.addColumn("Name");
        model.addColumn("City");
        model.addColumn("P/C");
        model.addColumn("Ch/S");
        model.addColumn("Amount");
        rowdata = new Object[8];
        newaccount=false;
        
        
        JPanel1.add(JScrollPane1);
        JScrollPane1.setBounds(12,92,444,160);
        JScrollPane1.getViewport().add(JTable1);
        JTable1.setBounds(0, 0, 420, 0);
//        rowdata = new Object[8];

		JButton_PerAC.setText("Add personal account");
		JPanel1.add(JButton_PerAC);
		JButton_PerAC.setBounds(24,20,192,33);
		JButton_CompAC.setText("Add company account");
		JButton_CompAC.setActionCommand("jbutton");
		JPanel1.add(JButton_CompAC);
		JButton_CompAC.setBounds(240,20,192,33);
		JButton_Deposit.setText("Deposit");
		JPanel1.add(JButton_Deposit);
		JButton_Deposit.setBounds(560,92,96,33);
		JButton_Withdraw.setText("Withdraw");
		JPanel1.add(JButton_Withdraw);
		JButton_Addinterest.setBounds(448,20,106,33);
		JButton_Addinterest.setText("Add interest");
		JPanel1.add(JButton_Addinterest);

		JButton_Generatereport.setBounds(560,20,96,33);
		JButton_Generatereport.setText("Report");
		JPanel1.add(JButton_Generatereport);

		JButton_Withdraw.setBounds(560,155,96,33);
		JButton_Exit.setText("Exit");
		JPanel1.add(JButton_Exit);
		JButton_Exit.setBounds(560,220,96,31);
		// lineBorder1.setRoundedCorners(true);
		// lineBorder1.setLineColor(java.awt.Color.green);
		//$$ lineBorder1.move(24,312);

		JButton_PerAC.setActionCommand("jbutton");

		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		JButton_Exit.addActionListener(lSymAction);
		JButton_PerAC.addActionListener(lSymAction);
		JButton_CompAC.addActionListener(lSymAction);
		JButton_Deposit.addActionListener(lSymAction);
		JButton_Withdraw.addActionListener(lSymAction);
		JButton_Addinterest.addActionListener(lSymAction);
		JButton_Generatereport.addActionListener(lSymAction);
		
	}

	public void setBank(Bank frm){

		this.bank = frm;
	}
	
	/*****************************************************
	 * The entry point for this application.
	 * Sets the Look and Feel to the System Look and Feel.
	 * Creates a new JFrame1 and makes it visible.
	 *****************************************************/
	public void loadGui()
	{
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		    
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
		    
			//Create a new instance of our application's frame, and make it visible.
			(new BankGui()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}


	JPanel JPanel1 = new JPanel();
	JButton JButton_PerAC = new JButton();
	JButton JButton_CompAC = new JButton();
	JButton JButton_Deposit = new JButton();
	JButton JButton_Withdraw = new JButton();
	JButton JButton_Addinterest= new JButton();
	JButton JButton_Generatereport = new JButton();
	JButton JButton_Exit = new JButton();

	void exitApplication()
	{
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
		} catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(WindowEvent event)
		{
			Object object = event.getSource();
			if (object == BankGui.this)
				BankFrm_windowClosing(event);
		}
	}

	void BankFrm_windowClosing(WindowEvent event)
	{
		// to do: code goes here.
			 
		BankFrm_windowClosing_Interaction1(event);
	}

	void BankFrm_windowClosing_Interaction1(WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object object = event.getSource();
			if (object == JButton_Exit)
				JButtonExit_actionPerformed(event);
			else if (object == JButton_PerAC)
				JButtonPerAC_actionPerformed(event);
			else if (object == JButton_CompAC)
				JButtonCompAC_actionPerformed(event);
			else if (object == JButton_Deposit)
				JButtonDeposit_actionPerformed(event);
			else if (object == JButton_Withdraw)
				JButtonWithdraw_actionPerformed(event);
			else if (object == JButton_Addinterest)
				JButtonAddinterest_actionPerformed(event);
			else if (object == JButton_Generatereport)
				JButton_Generatereport_actionPerformed(event);
			
		}
	}
    
    //When the Exit button is pressed this code gets executed
    //this will exit from the system
    void JButtonExit_actionPerformed(ActionEvent event)
	{
		System.exit(0);
	}

	void JButtonPerAC_actionPerformed(ActionEvent event)
	{
		JDialog_AddPAcc pac = new JDialog_AddPAcc(myframe);
		pac.setBounds(450, 20, 300, 330);
		pac.show();
		saveAndDisplay();
    }

	private void saveAndDisplay() {
		if(bank.getCustomer() == null)
			return;
		bank.getPartyController().saveParty(bank.getCustomer());
		IAccount currentAccount = bank.getCustomer().getAllAccounts().get(0);
		Party customer = bank.getCustomer();
		if (newaccount){
			// add row to table
            rowdata[0] = currentAccount.getAccountNumber();
            rowdata[1] = customer.getName();
            rowdata[2] = customer.getCity();
            rowdata[3] = customer.type;
            rowdata[4] = currentAccount.getType();
            rowdata[5] = "0";
            model.addRow(rowdata);
            JTable1.getSelectionModel().setAnchorSelectionIndex(-1);
            newaccount = false;
		}
	}

	void JButtonCompAC_actionPerformed(ActionEvent event)
	{
		/*
		 construct a JDialog_AddCompAcc type object 
		 set the boundaries and 
		 show it 
		*/
		
		JDialog_AddCompAcc pac = new JDialog_AddCompAcc(myframe);
		pac.setBounds(450, 20, 300, 330);
		pac.show();
		saveAndDisplay();
	}

	void JButtonDeposit_actionPerformed(ActionEvent event)
	{
	    // get selected name
        int selection = JTable1.getSelectionModel().getMinSelectionIndex();
        if (selection >=0){
            String accnr = (String)model.getValueAt(selection, 0);

		    //Show the dialog for adding deposit amount for the current mane
		    JDialog_Deposit dep = new JDialog_Deposit(myframe,accnr);
		    dep.setBounds(430, 15, 275, 140);
		    dep.show();

			performTransaction(accnr, TransactionType.DEPOSIT, Double.parseDouble(amountDeposit), model.getValueAt(selection, 3).toString());
		    model.setValueAt(String.valueOf(bank.getAccount().getBalance()),selection, 5);
		}
	}

	void JButtonWithdraw_actionPerformed(ActionEvent event)
	{
	    // get selected name
        int selection = JTable1.getSelectionModel().getMinSelectionIndex();
        if (selection >=0){
            String accnr = (String)model.getValueAt(selection, 0);

		    //Show the dialog for adding withdraw amount for the current mane
		    JDialog_Withdraw wd = new JDialog_Withdraw(myframe,accnr);
		    wd.setBounds(430, 15, 275, 140);
		    wd.show();

			performTransaction(accnr, TransactionType.WITHDRAW, Double.parseDouble(amountDeposit), model.getValueAt(selection, 3).toString());
			Double newamount= bank.getAccount().getBalance();
		    model.setValueAt(String.valueOf(newamount),selection, 5);
		    if (newamount <0){
		       JOptionPane.showMessageDialog(JButton_Withdraw, " Account "+accnr+" : balance is negative: $"+String.valueOf(newamount)+" !","Warning: negative balance",JOptionPane.WARNING_MESSAGE);
		    }
		}
		
		
	}
	private void performTransaction(String accountNumber, TransactionType type, Double amount, String partyType){
		bank.setAccount((Account) bank.getPartyController().getAccount(accountNumber));
		Transaction t = TransactionFactory.createTransaction(type, bank.getAccount(), amount);

		Functor emailSender = EmailSenderFactory.getEmailSender(partyType, t);
		TransactionProxy tProxy = new TransactionProxy(t, emailSender);
		//bank.tController.execute(tProxy);
		bank.executeTransaction(tProxy);
	}

	void JButtonAddinterest_actionPerformed(ActionEvent event)
	{
		java.util.List<Account> accounts = bank.getAccountController().getAccounts();
		ITransaction tran = TransactionFactory.createInterestTransaction(accounts, 10);
		tran.compute();

		for (int i = 0; i < JTable1.getRowCount(); i++){
			String accNo = (String)model.getValueAt(i, 0);
			IAccount acc = bank.getAccountController().getAccount(accNo);
			model.setValueAt(acc.getCurrentBalance(), i, 5);
		}

		JOptionPane.showMessageDialog(JButton_Addinterest, "Add interest to all accounts","Add interest to all accounts",JOptionPane.WARNING_MESSAGE);
	}

	private void JButton_Generatereport_actionPerformed(ActionEvent event) {
//		Map<IParty, java.util.List<IAccount>> customers = bank.aController.getCustomers();
//		Iterator it = customers.values().iterator();
//		while(it.hasNext())
//			System.out.println(it.next());

		Map<IParty, java.util.List<IAccount>> customers = bank.getPartyController().getCustomers();

		printReport(customers);


		}


		//System.out.println("Generating Report");

	void printReport(Map<IParty, java.util.List<IAccount>> customers){
		System.out.println("======================================================================================");
		System.out.println("Account Holder:      Account Number                                Current Balance: " );
		//System.out.println("                                     Deposit          Withdrawal        Interest");
		System.out.println("======================================================================================");
		for(IParty p: customers.keySet())
		{
			for(IAccount acc: customers.get(p)){

				Party party = (Party)p;
				String name = party.getName();
				String accountNumber = acc.getAccountNumber();
				double currentBalance = acc.getCurrentBalance();

				System.out.println(name+ ":");
				System.out.println("           "+ accountNumber + "                          "+ currentBalance);
			}
		}


	}
}


