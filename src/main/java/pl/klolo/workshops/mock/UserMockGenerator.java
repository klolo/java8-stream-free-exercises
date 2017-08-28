package pl.klolo.workshops.mock;

import pl.klolo.workshops.domain.Account;
import pl.klolo.workshops.domain.Permit;
import pl.klolo.workshops.domain.Sex;
import pl.klolo.workshops.domain.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserMockGenerator implements IGenerator {
    private AccountMockGenerator accountMockGenerator = new AccountMockGenerator();

    private static final String[] AVAILABLE_FIRST_NAME = {"Adam", "Mateusz", "Bartek", "Heniek", "Hela", "Ewa", "Ala", "Zosia"};
    private static final String[] AVAILABLE_LAST_NAME = {"Wojcik", "Kowalski", "Pasibrzuch", "Wolny", "Zielinski", "August", "Nowak", "Chmiel"};

    public List<User> generate() {
        final List<Account> accounts = accountMockGenerator.generate();
        final List<User> result = new LinkedList<>();

        result.add( //1
                User.builder()
                        .firstName("Adam")
                        .lastName("Wojcik")
                        .age(17)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(0), accounts.get(1))
                        )
                        .build()
        );

        result.add( //2
                User.builder()
                        .firstName("Mateusz")
                        .lastName("Kowalski")
                        .age(33)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(2))
                        )
                        .build()
        );

        result.add( //3
                User.builder()
                        .firstName("Bartek")
                        .lastName("Pasibrzuch")
                        .age(18)
                        .sex(Sex.OTHER)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(3))
                        )
                        .build()
        );

        result.add( // 4
                User.builder()
                        .firstName("Jan")
                        .lastName("Bazuka")
                        .age(46)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(4), accounts.get(5), accounts.get(6))
                        )
                        .build()
        );

        result.add( // 5
                User.builder()
                        .firstName("Zosia")
                        .lastName("Psikuta")
                        .age(67)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(7), accounts.get(8), accounts.get(9))
                        )
                        .build()
        );

        result.add( // 6
                User.builder()
                        .firstName("Magdalena")
                        .lastName("Warszawska")
                        .age(33)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(10), accounts.get(11))
                        )
                        .build()
        );

        result.add( // 7
                User.builder()
                        .firstName("Amadeusz")
                        .lastName("Mocarz")
                        .age(29)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(12))
                        )
                        .build()
        );

        result.add( // 8
                User.builder()
                        .firstName("Filip")
                        .lastName("Flirciczart")
                        .age(33)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(13))
                        )
                        .build()
        );

        result.add( // 9
                User.builder()
                        .firstName("Zenon")
                        .lastName("Kucowski")
                        .age(21)
                        .sex(Sex.OTHER)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList()
                        )
                        .build()
        );

        result.add( // 10
                User.builder()
                        .firstName("Zenek")
                        .lastName("Biednapalka")
                        .age(18)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList()
                        )
                        .accounts(
                                Arrays.asList()
                        )
                        .build()
        );

        result.add( // 11
                User.builder()
                        .firstName("Mariusz")
                        .lastName("Dreh")
                        .age(50)
                        .sex(Sex.OTHER)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(14))
                        )
                        .build()
        );

        result.add( // 12
                User.builder()
                        .firstName("Marcin")
                        .lastName("Marcinowicz")
                        .age(37)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(
                                        accounts.get(15),
                                        accounts.get(16),
                                        accounts.get(17),
                                        accounts.get(18),
                                        accounts.get(19),
                                        accounts.get(20),
                                        accounts.get(21)
                                )
                        )
                        .build()
        );

        result.add( //13
                User.builder()
                        .firstName("Jan")
                        .lastName("Nowicki")
                        .age(45)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(22))
                        )
                        .build()
        );

        result.add( // 14
                User.builder()
                        .firstName("Kasia")
                        .lastName("Nawalka")
                        .age(29)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(23), accounts.get(24))
                        )
                        .build()
        );

        result.add( //15
                User.builder()
                        .firstName("Martin")
                        .lastName("Prawicowy")
                        .age(29)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(25), accounts.get(26))
                        )
                        .build()
        );

        result.add( // 16
                User.builder()
                        .firstName("Karol")
                        .lastName("Romanowicz")
                        .age(64)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(27), accounts.get(28))
                        )
                        .build()
        );

        result.add( // 17
                User.builder()
                        .firstName("Marta")
                        .lastName("Wialkibuz")
                        .age(33)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(29))
                        )
                        .build()
        );

        result.add( // 18
                User.builder()
                        .firstName("Patryk")
                        .lastName("Piwny")
                        .age(28)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(30))
                        )
                        .build()
        );

        result.add( //19
                User.builder()
                        .firstName("Zenek")
                        .lastName("Jawowy")
                        .age(22)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList()
                        )
                        .accounts(
                                Arrays.asList(accounts.get(31))
                        )
                        .build()
        );

        result.add( //20
                User.builder()
                        .firstName("Alfred")
                        .lastName("Pasibrzuch")
                        .age(40)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(32), accounts.get(33), accounts.get(34))
                        )
                        .build()
        );

        return result;
    }

}
