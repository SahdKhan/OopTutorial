package com.sahdyk;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
        /*
         All of these values are being initialized by calling the READNUMBER method.
         All of these variables are being casted to their desired type because the
         READNUMBER method returns a different type. Notice the way we use methods from
         other classes. We write the class name followed by a period and then the method.
         */

        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator);
        /*
        Here we are creating objects using constructors that we built in the
        classes "MortgageCalculator" and "MortgageReport"
        The constructor in the MortgageCalculator class has three parameters which we
        have already initialized and are now being passed to that class.
        The MortgageReport constructor needs a contructor parameter which we have given
        by passing the MortgageCalculator constructor to it.
         */

        report.printMortgage();
        report.printPaymentSchedule();
        /*
        Here we are using the methods from the MortgageReport class to print
        the information that we need.
         */
    }

}

