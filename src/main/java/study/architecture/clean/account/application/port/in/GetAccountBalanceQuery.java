package study.architecture.clean.account.application.port.in;

import study.architecture.clean.account.domain.Account.AccountId;
import study.architecture.clean.account.domain.Money;

public interface GetAccountBalanceQuery {

	Money getAccountBalance(AccountId accountId);

}
