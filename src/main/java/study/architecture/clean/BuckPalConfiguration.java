package study.architecture.clean;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.architecture.clean.account.application.service.MoneyTransferProperties;
import study.architecture.clean.account.domain.Money;

@Configuration
@EnableConfigurationProperties(BuckPalConfigurationProperties.class)
public class BuckPalConfiguration {

  @Bean
  public MoneyTransferProperties moneyTransferProperties(BuckPalConfigurationProperties buckPalConfigurationProperties){
    return new MoneyTransferProperties(Money.of(buckPalConfigurationProperties.getTransferThreshold()));
  }

}
