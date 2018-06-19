package service;

import com.kiev.tickets.entity.User;
import dao.UserDao;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class UserService {
    private UserDao userDao;

    public boolean createUser(User user) {
        return userDao.save(user);
    }

    public boolean logIn(String email, String password) {
        return Optional.ofNullable(userDao.findUserByEmail(email))
                .map(User::getPassword)
                .filter(p -> p.equals(password))
                .isPresent();
    }
}