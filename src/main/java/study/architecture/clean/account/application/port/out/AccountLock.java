package study.architecture.clean.account.application.port.out;

import static study.architecture.clean.account.domain.Account.AccountId;

public interface AccountLock {

	void lockAccount(AccountId accountId);

	void releaseAccount(AccountId accountId);

}
