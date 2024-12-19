package pl.zajavka.examples;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class User {

    // BDD - Behaviour Driven Development
    // Arrange - given
    // Act - when
    // Assert - then

    String name;
    String surname;
    String phone;

    public boolean isValid() {
        return Objects.nonNull(name)
                && Objects.nonNull(surname)
                && Objects.nonNull(phone);
    }
}
