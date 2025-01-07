package study.architecture.clean.account.application.service;

import org.springframework.stereotype.Component;
import study.architecture.clean.account.application.port.out.AccountLock;
import study.architecture.clean.account.domain.Account.AccountId;

@Component
class NoOpAccountLock implements AccountLock {

	@Override
	public void lockAccount(AccountId accountId) {
		// do nothing
	}

	@Override
	public void releaseAccount(AccountId accountId) {
		// do nothing
	}

}
