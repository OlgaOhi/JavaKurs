package home_work.hw_34_Task_1;

import les_33.persons.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PersonTest {

    @Test
    void testInvalidEmails() {

        Person person = new Person();

        String[] invalidEmails = {
                "plainaddress",
                "@missingusername.com",
                "username@.com",
                "username@com.",
                "username@com",
                "username@-domain.com",
                "username@domain..com",
                "username@.domain.com",
                "username@domain.c",
                "username@domain.corporate",
                "user@domain..com",
                "user@domain.com.",
                "user@.domain.com",
                ".user@domain.com",
                "user@@domain.com",
                ".user@domain.com"

        };

        for (String email : invalidEmails) {
            assertFalse(person.isValidEmail(email));
        }
    }
}
