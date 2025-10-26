import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String newFirstName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setFirstName(newFirstName);
        }
    }

    public void updateLastName(String contactId, String newLastName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setLastName(newLastName);
        }
    }

    public void updatePhone(String contactId, String newPhone) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setPhone(newPhone);
        }
    }

    public void updateAddress(String contactId, String newAddress) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setAddress(newAddress);
        }
    }
}