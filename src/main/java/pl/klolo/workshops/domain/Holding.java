package pl.klolo.workshops.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Holding {
    private final String name;
    private final List<Company> companies;
}
