package com.bridgelabz.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private final UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("Pranav", "abc.def@gmail.com", "Password123"));
    }

    @Test
    public void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "abc.def@gmail.com", "Password123"));
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Pranav", "abc@def@gmail..com", "Password1"));
    }

    @Test
    public void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Pranav", "abc.def@gmail.com", "P"));
    }
}
