package com.btpn.chip9.example1.srp;

public class BankService {
    public long deposit(double amount, String accountNo) {
        // deposit amount
        return 0;
    }

    public long withdraw(double amount, String accountNo) {
        // withdraw amount
        return 0;
    }

    public void printPassbook() {
        // update transaction info in passbook
    }

    public String getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            // do some job
            return "Home loan interest info";
        }
        if (loanType.equals("personalLoan")) {
            // do some job
            return "Personal loan interest info";
        }
        if (loanType.equals("businessLoan")) {
            // do some job
            return "Business loan interest info";
        }
        return "";
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email related logic
            // use API
        }
    }
}
