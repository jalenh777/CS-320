import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("123", "Jalen", "Horn", "1234567890", "123 Main St");
        service.addContact(c);
        // Try adding duplicate
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(c);
        });
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("123", "Jalen", "Horn", "1234567890", "123 Main St");
        service.addContact(c);
        service.deleteContact("123");
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("123");
        });
    }
}
