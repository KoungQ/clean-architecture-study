package study.architecture.clean.account.application.port.out;

import study.architecture.clean.account.domain.Account;

public interface UpdateAccountStatePort {

	void updateActivities(Account account);

}
