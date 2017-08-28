package pl.klolo.workshops.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Account {
    private final AccountType type;
    private final String number;
    private final BigDecimal amount;
    private final Currency currency;
}
