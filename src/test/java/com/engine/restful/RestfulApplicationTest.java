/*
package com.engine.restful;

import static org.junit.Assert.assertNotNull;

import com.engine.restful.models.User;
import com.engine.restful.service.UserService;
import com.engine.restful.service.UserServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulApplicationTest {

    @Test
    public void contextLoads() {
        UserService userService = Mockito.mock(UserServiceImp.class);

        User user = new User();
        user.setCountry("India");
        user.setName("Goku");
        user.setId(1);

        userService.createUser(user);
        List<User> user1 = userService.getUser();
        assertNotNull(user1);
    }

}

*/
