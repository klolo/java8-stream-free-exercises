package pl.klolo.workshops.mock;


import pl.klolo.workshops.domain.Account;
import pl.klolo.workshops.domain.AccountType;
import pl.klolo.workshops.domain.Currency;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class AccountMockGenerator implements IGenerator {

    public List<Account> generate() {
        return Arrays.asList(
                Account //1
                        .builder()
                        .number("6754")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("10.50"))
                        .currency(Currency.PLN)
                        .build(),
                Account //2
                        .builder()
                        .number("1178")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("999.50"))
                        .currency(Currency.USD)
                        .build(),
                Account //3
                        .builder()
                        .number("8967")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1000"))
                        .currency(Currency.EUR)
                        .build(),
                Account //4
                        .builder()
                        .number("112221")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1667.22"))
                        .currency(Currency.PLN)
                        .build(),
                Account //5
                        .builder()
                        .number("1234")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1888822.1"))
                        .currency(Currency.EUR)
                        .build(),
                Account //6
                        .builder()
                        .number("2346")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("8236626.12"))
                        .currency(Currency.PLN)
                        .build(),
                Account //7
                        .builder()
                        .number("7676")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1230.00"))
                        .currency(Currency.EUR)
                        .build(),
                Account //8
                        .builder()
                        .number("0192")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("88890.00"))
                        .currency(Currency.PLN)
                        .build(),
                Account //9
                        .builder()
                        .number("8474")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("10000.60"))
                        .currency(Currency.CHF)
                        .build(),
                Account //10
                        .builder()
                        .number("3892")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("70998.8"))
                        .currency(Currency.EUR)
                        .build(),
                Account //11
                        .builder()
                        .number("65423")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("800.99"))
                        .currency(Currency.PLN)
                        .build(),
                Account //12
                        .builder()
                        .number("87631")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("100"))
                        .currency(Currency.CHF)
                        .build(),
                Account //13
                        .builder()
                        .number("1235478")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("1"))
                        .currency(Currency.PLN)
                        .build(),
                Account //14
                        .builder()
                        .number("72446")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("0.01"))
                        .currency(Currency.CHF)
                        .build(),
                Account //15
                        .builder()
                        .number("90753")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("0"))
                        .currency(Currency.CHF)
                        .build(),
                Account //16
                        .builder()
                        .number("865423")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("0"))
                        .currency(Currency.CHF)
                        .build(),
                Account //16
                        .builder()
                        .number("9612541")
                        .type(AccountType.LO2)
                        .amount(new BigDecimal("23500.86"))
                        .currency(Currency.USD)
                        .build(),
                Account //17
                        .builder()
                        .number("971561")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("9999"))
                        .currency(Currency.USD)
                        .build(),
                Account //18
                        .builder()
                        .number("97156221")
                        .type(AccountType.LO2)
                        .amount(new BigDecimal("10.00"))
                        .currency(Currency.CHF)
                        .build(),
                Account //19
                        .builder()
                        .number("867151")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("109823.00"))
                        .currency(Currency.PLN)
                        .build(),
                Account //20
                        .builder()
                        .number("862252")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("123771"))
                        .currency(Currency.CHF)
                        .build(),
                Account //21
                        .builder()
                        .number("872562")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("1234"))
                        .currency(Currency.PLN)
                        .build(),
                Account //22
                        .builder()
                        .number("86252")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("7332"))
                        .currency(Currency.PLN)
                        .build(),
                Account //23
                        .builder()
                        .number("34563")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("2346"))
                        .currency(Currency.PLN)
                        .build(),
                Account //24
                        .builder()
                        .number("1122")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("100"))
                        .currency(Currency.USD)
                        .build(),
                Account //25
                        .builder()
                        .number("62222")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("1009"))
                        .currency(Currency.PLN)
                        .build(),
                Account //24
                        .builder()
                        .number("73344")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("0"))
                        .currency(Currency.PLN)
                        .build(),
                Account //26
                        .builder()
                        .number("8723212")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("2435"))
                        .currency(Currency.USD)
                        .build(),
                Account //27
                        .builder()
                        .number("3457117")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("10000984"))
                        .currency(Currency.PLN)
                        .build(),
                Account //28
                        .builder()
                        .number("45218")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("108987.0"))
                        .currency(Currency.CHF)
                        .build(),
                Account //29
                        .builder()
                        .number("24578")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("13873"))
                        .currency(Currency.CHF)
                        .build(),
                Account //30
                        .builder()
                        .number("0000064")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("9766"))
                        .currency(Currency.USD)
                        .build(),
                Account //31
                        .builder()
                        .number("2322255")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("1000"))
                        .currency(Currency.CHF)
                        .build(),
                Account //32
                        .builder()
                        .number("666622")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("287"))
                        .currency(Currency.CHF)
                        .build(),
                Account //33
                        .builder()
                        .number("998292")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("1467"))
                        .currency(Currency.CHF)
                        .build(),
                Account //34
                        .builder()
                        .number("938383")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("1600"))
                        .currency(Currency.EUR)
                        .build(),
                Account //35
                        .builder()
                        .number("2018543")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("23000.86"))
                        .currency(Currency.PLN)
                        .build()
        );
    }

}
