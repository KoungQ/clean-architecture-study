package study.architecture.clean.account.application.service;

import lombok.RequiredArgsConstructor;
import study.architecture.clean.account.application.port.in.GetAccountBalanceQuery;
import study.architecture.clean.account.application.port.out.LoadAccountPort;
import study.architecture.clean.account.domain.Account.AccountId;
import study.architecture.clean.account.domain.Money;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

	private final LoadAccountPort loadAccountPort;

	@Override
	public Money getAccountBalance(AccountId accountId) {
		return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
				.calculateBalance();
	}
}
