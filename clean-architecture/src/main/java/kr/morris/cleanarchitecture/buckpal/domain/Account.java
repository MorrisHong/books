package kr.morris.cleanarchitecture.buckpal.domain;

public class Account {

    public Money calculateBalance() {
        return null;
    }

    public boolean withdraw(Money money, AccountId accountId) {
        return false;
    }

    private boolean mayWithdraw(Money money) {
        return false;
    }

    public boolean deposit(Money money, AccountId accountId) {
        return false;
    }

    public static class AccountId {
        private Long id;
    }
}
