package com;

public class WalletView {
    private String userId;

    private Long balance;

    private Long time;String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String toString() {
        return "Balance " + balance + " for UserId " + userId;
    }
}
