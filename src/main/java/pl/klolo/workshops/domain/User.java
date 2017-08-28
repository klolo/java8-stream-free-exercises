package pl.klolo.workshops.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class User {

    private final String firstName;

    private final String lastName;

    private final Sex sex;

    private final int age;

    private final List<Account> accounts;

    private final List<Permit> permits;
}
