import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testContactCreationSuccess() {
        Contact contact = new Contact("123", "Jalen", "Horn", "1234567890", "123 Main St");
        assertEquals("123", contact.getContactId());
        assertEquals("Jalen", contact.getFirstName());
    }

    @Test
    public void testInvalidPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("124", "Jay", "Horn", "12345", "123 Main St");
        });
    }
}