package kr.morris.cleanarchitecture.buckpal.application.port.in;

import kr.morris.cleanarchitecture.buckpal.domain.Account;
import kr.morris.cleanarchitecture.buckpal.domain.Money;
import lombok.Getter;

@Getter
public class SendMoneyCommand {

    private final Account.AccountId sourceAccountId;
    private final Account.AccountId targetAccountId;
    private final Money money;

    public SendMoneyCommand(final Account.AccountId sourceAccountId, final Account.AccountId targetAccountId, final Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
    }
}
