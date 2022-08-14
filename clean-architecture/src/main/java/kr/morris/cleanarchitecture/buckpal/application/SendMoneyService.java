package kr.morris.cleanarchitecture.buckpal.application;

import kr.morris.cleanarchitecture.buckpal.application.port.in.SendMoneyCommand;
import kr.morris.cleanarchitecture.buckpal.application.port.in.SendMoneyUseCase;
import kr.morris.cleanarchitecture.buckpal.application.port.out.LoadAccountPort;
import kr.morris.cleanarchitecture.buckpal.application.port.out.UpdateAccountStatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
public class SendMoneyService implements SendMoneyUseCase {

    private final LoadAccountPort loadAccountPort;
    private final UpdateAccountStatePort updateAccountStatePort;


    @Override
    public boolean sendMoney(final SendMoneyCommand command) {
        return false;
    }
}
