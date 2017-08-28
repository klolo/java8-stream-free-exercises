package pl.klolo.workshops.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Company {
    private final String name;
    private final List<User> users;
}
