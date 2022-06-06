package com.btpn.chip9.example1.solution;

public interface NotificationService {
    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);
}
