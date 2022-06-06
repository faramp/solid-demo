package com.btpn.chip9.example1.srp.solution;

public class LoanService {
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
        if (loanType.equals("studyLoan")) {
            // do some job
            return "Study loan interest info";
        }
        return "";
    }
}
