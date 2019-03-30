package pl.klolo.workshops.logic;

import org.junit.Before;
import org.junit.Test;
import pl.klolo.workshops.domain.Account;
import pl.klolo.workshops.domain.AccountType;
import pl.klolo.workshops.domain.Currency;
import pl.klolo.workshops.domain.User;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class WorkShopTest {

    private WorkShop workShop;

    @Before
    public void setUp() {
        workShop = new WorkShop();
    }

    /**
     * 1.
     */
    @Test
    public void shouldReturnAmountOfHoldingWhereIsAtLeastOneCompany() {
        final long amountOfCompanies = workShop.getHoldingsWhereAreCompanies();
        assertEquals(3, amountOfCompanies);
    }

    /**
     * 2.
     */
    @Test
    public void shouldReturnLowerCaseNameOfAllHoldings() {
        final List<String> holdingNames = workShop.getHoldingNames();
        assertEquals("[nestle, coca-cola, pepsico]", holdingNames.toString());
    }

    /**
     * 3.
     */
    @Test
    public void shouldReturnNamesOfAllHoldingInString() {
        final String holdingNames = workShop.getHoldingNamesAsString();
        assertEquals("(Coca-Cola, Nestle, Pepsico)", holdingNames);
    }

    /**
     * 4.
     */
    @Test
    public void shouldCountCompaniesInHoldings() {
        final long companiesAmount = workShop.getCompaniesAmount();
        assertEquals(8, companiesAmount);
    }

    /**
     * 5.
     */
    @Test
    public void shouldCountAllUsersInAllCompanies() {
        final long userAmount = workShop.getAllUserAmount();
        assertEquals(20, userAmount);
    }

    /**
     * 6.
     */
    @Test
    public void shouldReturnAllCompaniesName() {
        final List<String> allCompaniesName = workShop.getAllCompaniesNames();
        assertEquals("[Nescafe, Gerber, Nestea, Fanta, Sprite, Lays, Pepsi, Mirinda]",
                allCompaniesName.toString());
    }

    /**
     * 7.
     */
    @Test
    public void shouldReturnAllCompaniesNameAsString() {
        final String allCompaniesName = workShop.getAllCompaniesNamesAsString();
        assertEquals("Nescafe+Gerber+Nestea+Fanta+Sprite+Lays+Pepsi+Mirinda", allCompaniesName);
    }

    /**
     * 8.
     */
    @Test
    public void shouldReturnAllCompaniesNameAsStringUsingStringBuilder() {
        final String allCompaniesName = workShop.getAllCompaniesNamesAsStringUsingStringBuilder();
        assertEquals("Nescafe+Gerber+Nestea+Fanta+Sprite+Lays+Pepsi+Mirinda", allCompaniesName);
    }

    /**
     * 9.
     */
    @Test
    public void shouldReturnHowMuchAccountHaveUsers() {
        final long accountAmount = workShop.getAllUserAccountsAmount();
        assertEquals(35, accountAmount);
    }

    /**
     * 10.
     */
    @Test
    public void shouldReturnAllCompaniesNameAsLinkedList() {
        final LinkedList<String> allCompaniesName = workShop.getAllCompaniesNamesAsLinkedList();
        assertEquals("[Nescafe, Gerber, Nestea, Fanta, Sprite, Lays, Pepsi, Mirinda]",
                allCompaniesName.toString());
    }

    /**
     * 11.
     */
    @Test
    public void shouldReturnSetOfAllCurrencies() {
        final String allUsedCurrecies = workShop.getAllCurrencies();
        assertEquals("CHF, EUR, PLN, USD", allUsedCurrecies);
    }

    /**
     * 12.
     */
    @Test
    public void shouldReturnSetOfAllCurrenciesUsingGenerate() {
        final String allUsedCurrecies = workShop.getAllCurrenciesUsingGenerate();
        assertEquals("CHF, EUR, PLN, USD", allUsedCurrecies);
    }

    /**
     * 13.
     */
    @Test
    public void shouldReturnHowManyWomenAreInCompanies() {
        final long womanAmount = workShop.getWomanAmount();
        assertEquals(4, womanAmount);
    }

    /**
     * 14.
     */
    @Test
    public void shouldCalculateAmountInPln() {
        final Account accountWithOneZloty = Account.builder()
                .amount(new BigDecimal("1.0"))
                .currency(Currency.PLN)
                .build();

        assertEquals(new BigDecimal("1.00"), workShop.getAccountAmountInPLN(accountWithOneZloty));

        final Account accountWithOneDolar = Account.builder()
                .amount(new BigDecimal("1.0"))
                .currency(Currency.USD)
                .build();

        assertEquals(new BigDecimal("3.720"), workShop.getAccountAmountInPLN(accountWithOneDolar));
    }

    /**
     * 15.
     */
    @Test
    public void shouldGetTotalCashInPLNCorrectlySum() {
        final List<Account> accounts = Arrays.asList(
                Account.builder().amount(new BigDecimal(150)).currency(Currency.PLN).build(), // 150 PLN
                Account.builder().amount(new BigDecimal(50)).currency(Currency.USD).build(), // 186 PLN
                Account.builder().amount(new BigDecimal(300)).currency(Currency.PLN).build() // 300 PLN
        );

        assertEquals(636, workShop.getTotalCashInPLN(accounts).intValue());
    }

    /**
     * 16.
     */
    @Test
    public void shouldReturnUserNameForPassedCondition() {
        assertEquals("[Adam, Alfred, Amadeusz]",
                workShop.getUsersForPredicate(user -> user.getFirstName().startsWith("A")).toString());
        assertEquals("[Karol, Zosia]", workShop.getUsersForPredicate(user -> user.getAge() > 50).toString());
    }

    /**
     * 17.
     */
    @Test
    public void shouldReturnWomanWhichAreOlderThan50() {
        final List<String> oldWomam = workShop.getOldWoman(50);
        assertEquals("[Karol]", oldWomam.toString());
    }

    /**
     * 18.
     */
    @Test
    public void shouldExecuteConsumerForEachCompany() {
        final StringBuilder builder = new StringBuilder();
        workShop.executeForEachCompany(company ->
                builder
                        .append(company.getName())
                        .append("=")
                        .append(company.getUsers().size())
                        .append(" ")
        );

        assertEquals("Nescafe=4 Gerber=3 Nestea=1 Fanta=3 Sprite=2 Lays=2 Pepsi=3 Mirinda=2 ",
                builder.toString());
    }

    /**
     * 19.
     */
    @Test
    public void shouldGetRichestWoman() {
        final Optional<User> richestWoman = workShop.getRichestWoman();
        assertEquals("Zosia Psikuta", richestWoman.get()
                .getFirstName() + " " + richestWoman.get().getLastName());
    }

    /**
     * 20.
     */
    @Test
    public void shouldReturnNamesOfFirstNCompany() {
        final Set<String> first10Company = workShop.getFirstNCompany(5);
        assertEquals("[Sprite, Gerber, Fanta, Nescafe, Nestea]", first10Company.toString());
    }

    /**
     * 21.
     */
    @Test
    public void shouldFindROR1AsMostUsedAccountType() {
        final AccountType mostUseAccoutType = workShop.getMostPopularAccountType();
        assertEquals(AccountType.ROR1, mostUseAccoutType);
    }

    /**
     * 21.
     */
    @Test
    public void shouldGetUserFoPassedPredicate() {
        final User user = workShop.getUser(u -> u.getFirstName().equals("Adam"));
        assertEquals("Wojcik", user.getLastName());
    }

    /**
     * 22.
     */
    @Test(expected = IllegalArgumentException.class)
    public void shouldGetUserFoPassedPredicateThrowException() {
        workShop.getUser(u -> u.getFirstName().equals("Camillo"));
    }

    /**
     * 23.
     */
    @Test
    public void shouldReturnCompanyMapWithUserList() {
        final Map<String, List<User>> companies = workShop.getUserPerCompany();
        assertEquals(8, companies.size());
        assertEquals("Bazuka", companies.get("Sprite").get(0).getLastName());
    }

    /**
     * 24.
     */
    @Test
    public void shouldReturnCompanyMapWithUserListAsString() {
        final Map<String, List<String>> companies = workShop.getUserPerCompanyAsString();
        assertEquals(8, companies.size());
        assertEquals("Jan Bazuka", companies.get("Sprite").get(0));
    }

    /**
     * 25.
     */
    @Test
    public void shouldReturnCompanyMapWithUserListUsingPassedFunction() {
        final Function<User, String> convertUserToString = user -> user.getFirstName() + " " + user.getLastName() + ": "
                + user.getAccounts().size();
        final Map<String, List<String>> companies = workShop.getUserPerCompany(convertUserToString);

        assertEquals(8, companies.size());
        assertEquals("Jan Bazuka: 3", companies.get("Sprite").get(0));
    }

    /**
     * 26.
     */
    @Test
    public void shouldSegregateUserBySex() {
        final Map<Boolean, Set<String>> usersBySex = workShop.getUserBySex();
        assertEquals(13, usersBySex.get(true).size());
        assertEquals(4, usersBySex.get(false).size());

        assertTrue(usersBySex.get(true).contains("Mocarz"));
        assertTrue(usersBySex.get(false).contains("Warszawska"));
    }

    /**
     * 27.
     */
    @Test
    public void shouldCreateAccountsMap() {
        final Map<String, Account> accounts = workShop.createAccountsMap();
        assertTrue(accounts.size() == 35);
    }

    /**
     * 28.
     */
    @Test
    public void shouldCreateListOfUserNames() {
        final String userNames = workShop.getUserNames();

        assertNotNull(userNames);
        assertTrue(userNames.startsWith("Adam Alfred Amadeusz Bartek Filip"));
    }

    /**
     * 29.
     */
    @Test
    public void shouldCreateUserSet() {
        final Set<User> users = workShop.getUsers();

        assertEquals(10, users.size());
    }

    /**
     * 30.
     */
    @Test
    public void shouldSaveAccountsListInFile() {
        workShop.saveAccountsInFile("accounts.txt");
    }

    /**
     * 31.
     */
    @Test
    public void shouldFindUser() {
        final Optional<User> user = workShop.findUser(u -> u.getLastName().equals("Psikuta"));

        assertTrue(user.isPresent());
        assertEquals("Zosia", user.get().getFirstName());
    }

    /**
     * 32.
     */
    @Test
    public void shouldGetUserAdultantStatus() {
        final Optional<User> user = workShop.findUser(u -> u.getLastName().equals("Psikuta"));
        final String adultatStatusOfPsikuta = workShop.getAdultantStatus(user);

        assertNotNull(adultatStatusOfPsikuta);
        assertEquals("Zosia Psikuta ma lat 67", adultatStatusOfPsikuta);

        final Optional<User> userNotExisted = workShop.findUser(u -> u.getLastName().equals("Komorwski"));
        final String adultantStatusNotExisted = workShop.getAdultantStatus(userNotExisted);

        assertNotNull(adultantStatusNotExisted);
        assertEquals("Brak użytkownika", adultantStatusNotExisted);
    }

    /**
     * 33.
     */
    @Test
    public void shouldSortAndDisplayUser() {
        workShop.showAllUser();
    }

    /**
     * 34.
     */
    @Test
    public void shouldCountMoneyOnAllAccounts() {
        final Map<AccountType, BigDecimal> moneyOnAccount = workShop.getMoneyOnAccounts();

        assertEquals(new BigDecimal("87461.4992"), moneyOnAccount.get(AccountType.LO2));
    }

    /**
     * 35.
     */
    @Test
    public void shouldCalculateSumOfSquareAge() {
        final int sumOfSquareAges = workShop.getAgeSquaresSum();
        assertEquals(27720, sumOfSquareAges);
    }

    /**
     * 36.
     */
    @Test
    public void shouldGetRandomNUser() {
        final List<User> randomUsers = workShop.getRandomUsers(4);

        assertEquals(4, randomUsers.size());
    }

    /**
     * 37.
     */
    @Test(timeout = 15) // maksymalnie 25ms jezeli masz wolny komputer.
    public void shouldGetFastRandomNUser() {
        final List<User> randomUsers = workShop.getRandomUsers(20);

        assertEquals(20, randomUsers.size());
    }

    /**
     * 38.
     * Stwórz mapę gdzie kluczem jest typ rachunku a wartością mapa mężczyzn posiadających ten rachunek, gdzie kluczem
     * jest obiekt User a wartością suma pieniędzy na rachunku danego typu przeliczona na złotkówki.
     */
    @Test
    public void shouldReturnManWithSumMoneyOnAccounts() {
        //TODO: dopisać więcej testów po porawce samej metody (tego co zwraca)
        Map<Stream<AccountType>, Map<User, BigDecimal>> manWithSumMoneyOnAccountsTest =
                workShop.getMapWithAccountTypeKeyAndSumMoneyForManInPLN();
        assertEquals(8, manWithSumMoneyOnAccountsTest.size());
        assertFalse(manWithSumMoneyOnAccountsTest.isEmpty());
    }

    /**
     * 39. Policz ile pieniędzy w złotówkach jest na kontach osób które nie są ani kobietą ani mężczyzną.
     */
    @Test
    public void shouldGetAllMoneyInTheAccountsOfPeopleOther() {
        BigDecimal sumMoneyOnAccountsForPeopleOtherInPLN = workShop.getSumMoneyOnAccountsForPeopleOtherInPLN();

        assertEquals(new BigDecimal("1667.000"), sumMoneyOnAccountsForPeopleOtherInPLN);
        assertNotEquals(new BigDecimal("1666.000"), sumMoneyOnAccountsForPeopleOtherInPLN);
        assertNotNull(sumMoneyOnAccountsForPeopleOtherInPLN);
        assertNotSame(Integer.TYPE, sumMoneyOnAccountsForPeopleOtherInPLN.getClass());
    }

    /**
     * 40. Wymyśl treść polecenia i je zaimplementuj.
     * Policz ile osób pełnoletnich posiada rachunek oraz ile osób niepełnoletnich posiada rachunek. Zwróć mapę
     * przyjmując klucz True dla osób pełnoletnich i klucz False dla osób niepełnoletnich. Osoba pełnoletnia to osoba
     * która ma więcej lub równo 18 lat
     */
    @Test
    public void shouldDivideIntoAdultsAndNonAdults() {
        Map<Boolean, Long> countAdultsAndNonAdults = workShop.divideIntoAdultsAndNonAdults();

        assertEquals(1, (long) countAdultsAndNonAdults.get(false));
        assertEquals(19, (long) countAdultsAndNonAdults.get(true));
        assertTrue(countAdultsAndNonAdults.containsKey(false));
        assertTrue(countAdultsAndNonAdults.containsKey(true));
        assertTrue(countAdultsAndNonAdults.containsKey(true));
        assertTrue(countAdultsAndNonAdults.containsKey(false));
        assertTrue(!countAdultsAndNonAdults.isEmpty());
        assertNotEquals(0, (long) countAdultsAndNonAdults.get(false));
        assertNotEquals(20, (long) countAdultsAndNonAdults.get(true));
        assertNotNull(countAdultsAndNonAdults.get(false));
        assertNotNull(countAdultsAndNonAdults.get(true));
        assertNotNull(countAdultsAndNonAdults.values());
        assertNotSame(List.class, countAdultsAndNonAdults.getClass());
    }
}
