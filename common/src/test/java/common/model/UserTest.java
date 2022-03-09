package common.model;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void basicUserTest(){
        User user = new User();
        assertNotNull(user);
    }

}
