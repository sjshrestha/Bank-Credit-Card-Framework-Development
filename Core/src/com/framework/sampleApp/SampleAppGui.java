package com.framework.sampleApp;

import com.framework.core.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Map;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by suraj on 4/20/2016.
 */
public class SampleAppGui extends JFrame{
    /****
     * init variables in the object
     ****/
    public static Fincom sampleApp;
    private DefaultTableModel model;
    private JTable JTable1;
    private JScrollPane JScrollPane1;
    SampleAppGui myframe;
    private Object rowdata[];
    boolean newaccount;
    String accountType, amountDeposit;

    public SampleAppGui()
    {
        myframe = this;
        setTitle("Sample Application.");
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

    public void setBank(Fincom frm){
        this.sampleApp = frm;
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
            (new SampleAppGui()).setVisible(true);
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
            if (object == SampleAppGui.this)
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
        if(sampleApp.getCustomer() == null)
            return;
        sampleApp.getPartyController().saveParty(sampleApp.getCustomer());
        IAccount currentAccount = sampleApp.getCustomer().getAllAccounts().get(0);
        Party customer = sampleApp.getCustomer();
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
        //write your code to deposit amount
        System.out.println("Amount has been deposited...");

        int selection = JTable1.getSelectionModel().getMinSelectionIndex();
        if (selection >=0){
            String accnr = (String)model.getValueAt(selection, 0);

            //Show the dialog for adding deposit amount for the current mane
            JDialog_Deposit dep = new JDialog_Deposit(myframe, accnr);
            dep.setBounds(430, 15, 275, 140);
            dep.show();

            performTransaction(accnr, TransactionType.DEPOSIT, Double.parseDouble("500"), model.getValueAt(selection, 3).toString());
            model.setValueAt(String.valueOf(sampleApp.getAccount().getBalance()),selection, 5);
        }
    }

    void JButtonWithdraw_actionPerformed(ActionEvent event)
    {
        //write your code to deposit amount
        System.out.println("Amount has been withdrawn...");
    }

    private void performTransaction(String accountNumber, TransactionType type, Double amount, String partyType){
        sampleApp.setAccount((Account)sampleApp.getPartyController().getAccount(accountNumber));
        Transaction t = new SampleTransaction(accountNumber);

        Functor emailSender = new SampleFunctor();
        TransactionProxy tProxy = new TransactionProxy(t, emailSender);
        //sampleApp.executeTransaction(tProxy);
    }

    void JButtonAddinterest_actionPerformed(ActionEvent event)
    {
        //write your code to deposit amount
        System.out.println("Interest has been added to all account...");
    }

    private void JButton_Generatereport_actionPerformed(ActionEvent event) {
        System.out.println("======================================================================================");
        System.out.println("Account Holder:      Account Number                                Current Balance: " );
        System.out.println("======================================================================================");
        System.out.println("Print your data as required...");
    }
}
