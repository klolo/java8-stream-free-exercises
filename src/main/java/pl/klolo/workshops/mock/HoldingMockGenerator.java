package pl.klolo.workshops.mock;


import pl.klolo.workshops.domain.Company;
import pl.klolo.workshops.domain.Holding;

import java.util.Arrays;
import java.util.List;

/**
 * Liczba rachunkow poszczegolnych pracownikow
 * Coca-cola
 * => Fanta
 * -> 2
 * -> 1
 * -> 3
 * => Sprite
 * -> 1
 * -> 1
 * <p>
 * Nestle
 * => Nescafe
 * -> 1
 * -> 3
 * -> 4
 * -> 2
 * => Gerber
 * -> 2
 * -> 1
 * -> 1
 * => Nestea
 * -> 1
 * <p>
 * Pepsico
 * => Lays
 * -> 1
 * -> 1
 * => Pepsi
 * -> 2
 * -> 3
 * -> 1
 * => Mirinda
 * -> 1
 * -> 3
 * <p>
 * Posumowanie
 * 35 rachunkow
 * 20 pracownikow
 * 8 firm
 * 3 holdingi
 */
public class HoldingMockGenerator implements IGenerator {

    public List<Holding> generate() {
        final CompanyMockGenerator companyMockGenerator = new CompanyMockGenerator();
        final List<Company> companies = companyMockGenerator.generate();
        final List<Holding> result = Arrays.asList(
                new Holding("Nestle", Arrays.asList(companies.get(2), companies.get(3), companies.get(4))),
                new Holding("Coca-Cola", Arrays.asList(companies.get(0), companies.get(1))),
                new Holding("Pepsico", Arrays.asList(companies.get(5), companies.get(6), companies.get(7)))
        );

        return result;
    }

}
