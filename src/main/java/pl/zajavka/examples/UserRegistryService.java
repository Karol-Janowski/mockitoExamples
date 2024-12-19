package pl.zajavka.examples;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class UserRegistryService {

    private final UsersRepository usersRepository;

    public void register(User user) {
        if (!user.isValid() || usersRepository.contains(user.getPhone())) {
            throw new RuntimeException("invalid user data");
        }
        usersRepository.put(user);
    }

    public Optional<User> find(String phone) {
        if (phone.isEmpty()) {
            throw new RuntimeException("invalid phone number");
        }
        if (usersRepository.contains(phone)) {
            return Optional.ofNullable(usersRepository.find(phone));
        }
        return Optional.empty();
    }
}
