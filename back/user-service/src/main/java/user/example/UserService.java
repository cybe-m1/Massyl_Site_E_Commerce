package user.example;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User findUserById(Long id) throws UserNotFoundException {
        return this.userRepository
                .findById(id)
                .orElseThrow(UserNotFoundException::new);
    }
}
