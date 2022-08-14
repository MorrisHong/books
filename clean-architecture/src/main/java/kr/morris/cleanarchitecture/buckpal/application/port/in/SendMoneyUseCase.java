package kr.morris.cleanarchitecture.buckpal.application.port.in;

public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);
}
