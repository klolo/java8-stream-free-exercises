package pl.klolo.workshops.mock;


import pl.klolo.workshops.domain.Company;
import pl.klolo.workshops.domain.User;

import java.util.Arrays;
import java.util.List;

public class CompanyMockGenerator implements IGenerator {

    public List<Company> generate() {
        final UserMockGenerator userMockGenerator = new UserMockGenerator();
        final List<User> users = userMockGenerator.generate();
        final List<Company> result = Arrays.asList(
                Company //1
                        .builder()
                        .name("Fanta")
                        .users(
                                Arrays.asList(
                                        users.get(0),
                                        users.get(1),
                                        users.get(2)
                                )
                        )
                        .build(),
                Company //2
                        .builder()
                        .name("Sprite")
                        .users(
                                Arrays.asList(
                                        users.get(3),
                                        users.get(4)
                                )
                        )
                        .build(),
                Company //3
                        .builder()
                        .name("Nescafe")
                        .users(
                                Arrays.asList(
                                        users.get(5),
                                        users.get(6),
                                        users.get(7),
                                        users.get(8)
                                )
                        )
                        .build(),
                Company //4
                        .builder()
                        .name("Gerber")
                        .users(
                                Arrays.asList(
                                        users.get(9),
                                        users.get(10),
                                        users.get(11)
                                )
                        )
                        .build(),
                Company //5
                        .builder()
                        .name("Nestea")
                        .users(
                                Arrays.asList(
                                        users.get(12)
                                )
                        )
                        .build(),
                Company //6
                        .builder()
                        .name("Lays")
                        .users(
                                Arrays.asList(
                                        users.get(13),
                                        users.get(14)
                                )
                        )
                        .build(),
                Company //7
                        .builder()
                        .name("Pepsi")
                        .users(
                                Arrays.asList(
                                        users.get(15),
                                        users.get(16),
                                        users.get(17)
                                )
                        )
                        .build(),
                Company //8
                        .builder()
                        .name("Mirinda")
                        .users(
                                Arrays.asList(
                                        users.get(18),
                                        users.get(19)
                                )
                        )
                        .build()
        );

        return result;
    }
}
