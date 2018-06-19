package dao;

import com.kiev.tickets.entity.User;

public interface UserDao extends GenericDao<User> {
    User findUserByEmail(String email);

}
