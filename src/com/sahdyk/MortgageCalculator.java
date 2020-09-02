package com.sahdyk;

public class MortgageCalculator {
    //This class does all the calculations

    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte years;
    /*
    When making a class we need to include all the variables that will be used
    by the methods in the class. These will be initialized by using setters or
    by using the constructor and simply assigning them when passed by using
    the "this" keyword. For example:
    this.principal = principal.
    What this does is assign the passed principal to THIS principal in the class.
    All "this" means is that this is the one in the class we are currently in.
     */

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }
    /*
    As stated before this is initializing the fields in this class.
     */

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double[] getRemainingBalances(){
        double[] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= getNumberOfPayments(); month++) {
            double balance = calculateBalance(month);
            balances[month - 1] = balance;
        }
            return balances;
    }

    public short getYears(){
        return years;
    }
}
