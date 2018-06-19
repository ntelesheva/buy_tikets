package service;

import com.kiev.tickets.entity.User;
import dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    UserDao userDao;

    @InjectMocks
    private UserService userService;


    @Test
    public void shouldReturnPasswordInLogIn() {
        User user = User.builder()
                .email("email")
                .password("12345")
                .build();
        when(userDao.findUserByEmail("email")).thenReturn(user);
        assertThat(userService.logIn("email", "12345")).isTrue();
    }

    @Test
    public void shouldReturnFalseIfNoUser() {
        when(userDao.findUserByEmail("email")).thenReturn(null);
        assertThat(userService.logIn("email", anyString())).isFalse();
    }
}