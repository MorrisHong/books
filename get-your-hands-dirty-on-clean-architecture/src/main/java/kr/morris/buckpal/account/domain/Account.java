package kr.morris.buckpal.account.domain;

import java.time.LocalDateTime;

public class Account {
    private AccountId id;
    private Money baselineBalance;
    private ActivityWindow activityWindow;

    public Money calculateBalance() {
        return Money.add(
                this.baselineBalance,
                this.activityWindow.calculateBalance(this.id)
        );
    }

    public boolean withdraw(Money money, AccountId targetAccountId) {
        if (!mayWithdraw(money)) {
            return false;
        }

        final var withdrawal = new Activity(
                this.id,
                this.id,
                targetAccountId,
                LocalDateTime.now(),
                money
        );

        this.activityWindow.addActivity(withdrawal);

        return true;
    }

    private boolean mayWithdraw(Money money) {
        return Money.add(
                this.calculateBalance(),
                money.negate()
        ).isPositiveOrZero();
    }

    public boolean deposite(Money money, AccountId sourceAccountId) {
        final var deposit = new Activity(
                this.id,
                sourceAccountId,
                this.id,
                LocalDateTime.now(),
                money
        );
        this.activityWindow.addActivity(deposit);
        return true;
    }

    public static class AccountId {
        private Long id;
    }
}

