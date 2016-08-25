package com.framework.core;


import java.util.Scanner;

/**
 * Created by Bijay on 4/19/2016.
 */
public class SampleApp extends Fincom {

    SampleApp(){
        super();
    }

    @Override
    protected ITransactionController createTransactionController() {
        return null;
    }

    public static void main(String[] args) {
        SampleApp c = new SampleApp();
        menu(c);


    }

    private static void menu(SampleApp c) {
        char ans = 'Y';
        while(ans == 'Y') {
            print("1. Create Account: ");
            print("2. Make Deposit: ");
            print("3. Withdraw Amount");
            print("4. Intrest: ");
            print("Choose your option: ");
            int n = (new Scanner(System.in)).nextInt();
            switch (n) {
                case 1:
                    c.createAccount();
                    break;
                case 2:
                    c.makeDeposit(100);
                    break;
                case 3:
                    c.makeWithdraw(10);
                    break;
                case 4:
                    c.applyIntrest(10);
                    break;
                default:
                    print("No match");


            }
            print("Want to Continue - Y/N: ");
            ans = (new Scanner(System.in)).nextLine().trim().charAt(0);
        }

    }



    @Override
    public void start()
    {

        print(" Based on : " + this.name+ " " + VERSION + " Framework. Menu will be presented");
    }


    protected boolean makeDeposit(double amount) {
        print("Transaction: Deposited "+amount);
        return false;
    }


    protected boolean makeWithdraw(double amount) {
        print("Transaction: Withdraw " + amount);
        return false;
    }


    protected boolean applyIntrest(double intrest) {
        print("Transaction: Applied " + intrest +"%" );
        return false;
    }


    @Override
    protected  boolean createAccount(){
       print("Accounted Created");
       return false;
    }

    @Override
    protected boolean executeTransaction(ITransaction t) {
        return false;
    }
}
