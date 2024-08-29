package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;

    @BeforeEach
    void init(){
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("anusit","12345678");
        userList.addUser("karina","11111111");
        userList.addUser("winter","00000000");
        // TODO: find one of them
        User user = userList.findUserByUsername("karina");
        // TODO: assert that UserList found User
         String expected = "karina";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("anusit","12345678");
        userList.addUser("karina","11111111");
        userList.addUser("winter","00000000");
        // TODO: change password of one user
        boolean actual = userList.changePassword("karina","11111111","222222222");
        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("anusit","12345678");
        userList.addUser("karina","11111111");
        userList.addUser("winter","00000000");
        // TODO: call login() with correct username and password
        User user = userList.login("anusit","12345678");
        String actual = user.getUsername();
        String expected = "anusit";
        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("anusit","12345678");
        userList.addUser("karina","11111111");
        userList.addUser("winter","00000000");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("anusit","11111111");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}